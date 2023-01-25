public class Main {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(Solution.lengthOfLastWord(s));
    }

    public static class Solution {
        public static int lengthOfLastWord(String s) {
            String[] out = s.trim().split(" ");
            return out[out.length - 1].length();
        }
    }
}
