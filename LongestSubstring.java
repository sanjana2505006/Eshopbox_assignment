import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";

        // calling our method to find the length
        int result = findLongestSubstringLength(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    public static int findLongestSubstringLength(String s) {
        // using a hashset to store the characters we have seen so far
        HashSet<Character> seen = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        // sliding window approach
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // if we already saw this character, remove from the left side until it's gone
            while (seen.contains(currentChar)) {
                seen.remove(s.charAt(left));
                left++;
            }

            // add the new character
            seen.add(currentChar);

            // check if the current window is the longest one we've seen
            int currentLength = right - left + 1;
            if (currentLength > maxLength) {
                maxLength = currentLength;
            }
        }

        return maxLength;
    }
}
