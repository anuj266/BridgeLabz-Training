import java.util.*;

public class MaxStrengthSum {

    public static void main(String[] args) {
        List<Integer> empSkill = Arrays.asList(1, 10, 5, 9, 9);
        List<Integer> teamSize = Arrays.asList(1, 1, 3);
        System.out.println(
            getMaximumStrengthSum(empSkill, teamSize)
        );
    }

    static long getMaximumStrengthSum(List<Integer> empSkill,List<Integer> teamSize) {
        // Sort employee skills
        Collections.sort(empSkill);
        int n = empSkill.size();
        // Count teams having size 1
        int singleTeams = 0;
        // Count teams having size >= 2
        int normalTeams = 0;

        for (int size : teamSize) {
            if (size == 1) {
                singleTeams++;
            } else {
                normalTeams++;
            }
        }

        long answer = 0;

        /*
         * Give the largest skills to teams of size 1.
         * A size-1 team has:
         *
         * minimum = maximum = skill
         *
         * strength = 2 * skill
         */
        for (int i = n - singleTeams; i < n; i++) {
            answer += 2L * empSkill.get(i);
        }

        /*
         * For teams with size >= 2:
         *
         * smallest normalTeams skills become minimums
         * largest normalTeams remaining skills become maximums
         */

        // Minimums
        for (int i = 0; i < normalTeams; i++) {
            answer += empSkill.get(i);
        }

        // Maximums
        int startMaximum = n - singleTeams - normalTeams;

        for (int i = startMaximum; i < n - singleTeams; i++) {
            answer += empSkill.get(i);
        }

        return answer;
    }
}