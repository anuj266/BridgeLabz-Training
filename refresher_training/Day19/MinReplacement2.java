
public class MinReplacement2 {

    public static void main(String[] args) {
        String s = "aabb";
        int answer = minReplacements(s);
        System.out.println("Minimum replacements = " + answer);
    }

    static int minReplacements(String s) {
        char[] arr = s.toCharArray();
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            // Check whether adjacent characters are invalid
            if (Math.abs(arr[i] - arr[i - 1]) <= 1) {
                count++;
                // Replace current character
                // with a character that is safe.
                arr[i] = getReplacement(arr[i - 1]);
            }
        }
        return count;
    }

    static char getReplacement(char previous) {
        // Pick a character sufficiently far from previous.
        if (previous <= 'x') {
            return (char)(previous + 2);
        } else {
            return (char)(previous - 2);
        }
    }
}