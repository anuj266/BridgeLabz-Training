package linkedlist;

class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {

    static TaskNode addAtStart(TaskNode Head,
                               int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (Head == null) {
            newNode.next = newNode;
            return newNode;
        }

        TaskNode curr = Head;
        while (curr.next != Head) {
            curr = curr.next;
        }

        newNode.next = Head;
        curr.next = newNode;
        Head = newNode;

        return Head;
    }

    static TaskNode addAtLast(TaskNode Head,
                              int taskId, String taskName, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);

        if (Head == null) {
            newNode.next = newNode;
            return newNode;
        }

        TaskNode curr = Head;
        while (curr.next != Head) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.next = Head;

        return Head;
    }

    static TaskNode addAtSpecificPosition(TaskNode Head,
                                          int taskId, String taskName,
                                          int priority, String dueDate, int pos) {
        if (pos == 1) {
            return addAtStart(Head, taskId, taskName, priority, dueDate);
        }

        TaskNode curr = Head;
        for (int i = 1; i < pos - 1 && curr.next != Head; i++) {
            curr = curr.next;
        }

        if (curr.next == Head && pos != 2) {
            System.out.println("Invalid Position");
            return Head;
        }

        TaskNode newNode = new TaskNode(taskId, taskName, priority, dueDate);
        newNode.next = curr.next;
        curr.next = newNode;

        return Head;
    }

    static TaskNode delete(TaskNode Head, int taskId) {
        if (Head == null) {
            System.out.println("List is empty");
            return null;
        }

        TaskNode curr = Head;
        TaskNode prev = null;

        do {
            if (curr.taskId == taskId) {

                if (prev == null) { // deleting head
                    TaskNode temp = Head;
                    while (temp.next != Head) {
                        temp = temp.next;
                    }
                    if (temp == Head) {
                        return null;
                    }
                    temp.next = Head.next;
                    Head = Head.next;
                } else {
                    prev.next = curr.next;
                }
                return Head;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != Head);

        System.out.println("Task not found");
        return Head;
    }

    static TaskNode viewCurrentAndNext(TaskNode Head) {
        if (Head == null) {
            System.out.println("No tasks available");
            return null;
        }

        System.out.println("Current Task: "
                + Head.taskId + " " + Head.taskName);

        return Head.next;
    }

    static void searchByPriority(TaskNode Head, int priority) {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }

        TaskNode curr = Head;
        boolean found = false;

        do {
            if (curr.priority == priority) {
                System.out.println(curr.taskId + " " + curr.taskName);
                found = true;
            }
            curr = curr.next;
        } while (curr != Head);

        if (!found) {
            System.out.println("No task with given priority");
        }
    }

    static void display(TaskNode Head) {
        if (Head == null) {
            System.out.println("List is empty");
            return;
        }

        TaskNode curr = Head;
        do {
            System.out.println(curr.taskId + " "
                    + curr.taskName + " "
                    + curr.priority + " "
                    + curr.dueDate);
            curr = curr.next;
        } while (curr != Head);
    }

    public static void main(String[] args) {

        TaskNode Head = null;

        Head = addAtStart(Head, 1, "Design Module", 1, "10-02-2026");
        Head = addAtLast(Head, 2, "Code Module", 2, "15-02-2026");
        Head = addAtLast(Head, 3, "Testing", 1, "18-02-2026");
        Head = addAtSpecificPosition(Head, 4, "Deployment", 3, "20-02-2026", 2);

        Head = viewCurrentAndNext(Head);

        searchByPriority(Head, 1);

        Head = delete(Head, 2);

        display(Head);
    }
}
