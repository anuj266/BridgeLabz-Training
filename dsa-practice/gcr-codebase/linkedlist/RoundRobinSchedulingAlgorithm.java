package linkedlist;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

public class RoundRobinSchedulingAlgorithm {

    static ProcessNode addAtLast(ProcessNode Head, int pid, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(pid, burstTime, priority);

        if (Head == null) {
            newNode.next = newNode;
            return newNode;
        }

        ProcessNode curr = Head;
        while (curr.next != Head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = Head;

        return Head;
    }

    static ProcessNode delete(ProcessNode Head, ProcessNode nodeToDelete) {
        if (Head == null || nodeToDelete == null) {
            return Head;
        }

        if (Head == nodeToDelete && Head.next == Head) {
            return null;
        }

        ProcessNode curr = Head;
        ProcessNode prev = null;

        do {
            if (curr == nodeToDelete) {
                if (prev != null) {
                    prev.next = curr.next;
                }
                if (curr == Head) {
                    Head = curr.next;
                }
                return Head;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != Head);

        return Head;
    }

    static void display(ProcessNode Head) {
        if (Head == null) {
            System.out.println("No processes in queue");
            return;
        }

        ProcessNode curr = Head;
        do {
            System.out.println("PID: " + curr.pid +
                    " RemainingTime: " + curr.remainingTime);
            curr = curr.next;
        } while (curr != Head);
    }

    static void roundRobin(ProcessNode Head, int timeQuantum) {
        if (Head == null) {
            System.out.println("No processes to schedule");
            return;
        }

        int currentTime = 0;
        int completed = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        ProcessNode curr = Head;

        while (Head != null) {

            if (curr.remainingTime > 0) {

                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                currentTime += execTime;

                ProcessNode temp = Head;
                do {
                    if (temp != curr && temp.remainingTime > 0) {
                        temp.waitingTime += execTime;
                    }
                    temp = temp.next;
                } while (temp != Head);

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = currentTime;
                    totalWaitingTime += curr.waitingTime;
                    totalTurnaroundTime += curr.turnaroundTime;
                    completed++;

                    ProcessNode toDelete = curr;
                    curr = curr.next;
                    Head = delete(Head, toDelete);
                } else {
                    curr = curr.next;
                }
            }

            System.out.println("\nQueue after round:");
            display(Head);
        }

        System.out.println("\nAverage Waiting Time: " +
                (double) totalWaitingTime / completed);
        System.out.println("Average Turnaround Time: " +
                (double) totalTurnaroundTime / completed);
    }

    public static void main(String[] args) {

        ProcessNode Head = null;

        Head = addAtLast(Head, 1, 10, 1);
        Head = addAtLast(Head, 2, 5, 2);
        Head = addAtLast(Head, 3, 8, 1);

        int timeQuantum = 4;

        roundRobin(Head, timeQuantum);
    }
}
