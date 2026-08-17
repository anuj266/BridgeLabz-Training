/*
    problem statement:
    It is New Year's Day and people are in line for the Wonderland rollercoaster ride. 
    Each person wears a sticker indicating their initial position in the queue from  to .
    Any person can bribe the person directly in front of them to swap positions, but they 
    still wear their original sticker. One person can bribe at most two others.

    Determine the minimum number of bribes that took place to get to a given queue order. 
    Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
*/

import java.util.*;

public class NewYearChaos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> q = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                q.add(sc.nextInt());
            }
            minimumBribes(q);
        }
        sc.close();
    }

    public static void minimumBribes(List<Integer> q) {
        int min = 0;
        for (int i = 0; i < q.size(); i++) {
            int bribe = q.get(i) - (i + 1);
            if (bribe > 2) {
                System.out.println("Too chaotic");
                return;
            }
            int start = Math.max(0, q.get(i) - 2);
            for (int j = start; j < i; j++) {
                if (q.get(j) > q.get(i)) {
                    min++;
                }
            }
        }
        System.out.println(min);
    }
}