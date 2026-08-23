class Solution {
    public String countAndSay(int n) {

        String s = "1";

        for (int k = 1; k < n; k++) {

            String ans = "";
            int count = 1;

            for (int i = 1; i <= s.length(); i++) {

                if (i < s.length() && s.charAt(i) == s.charAt(i - 1)) {
                    count++;
                } else {
                    ans = ans + count + s.charAt(i - 1);
                    count = 1;
                }
            }

            s = ans;
        }

        return s;
    }
}