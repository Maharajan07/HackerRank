/* Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

Example 1:

Input: s = "anagram", t = "nagaram"

Output: true

Example 2:

Input: s = "rat", t = "car"

Output: false

 

Constraints:

1 <= s.length, t.length <= 5 * 104
s and t consist of lowercase English letters. */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26]; // For lowercase letters a-z

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int n : count) {
            if (n != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();

        String s1 = "anagram", t1 = "nagaram";
        String s2 = "rat", t2 = "car";
        String s3 = "listen", t3 = "silent";

        System.out.println("\"" + s1 + "\", \"" + t1 + "\" → " + va.isAnagram(s1, t1)); // true
        System.out.println("\"" + s2 + "\", \"" + t2 + "\" → " + va.isAnagram(s2, t2)); // false
        System.out.println("\"" + s3 + "\", \"" + t3 + "\" → " + va.isAnagram(s3, t3)); // true
    }
}
