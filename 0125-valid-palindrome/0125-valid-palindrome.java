class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char c1 = s.charAt(left);
            char c2 = s.charAt(right);

            if (!isAlphaNumeric(c1)) {
                left++;
            } else if (!isAlphaNumeric(c2)) {
                right--;
            } else {
                if (Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }

    public boolean isAlphaNumeric(char c) {
        return (c >= 'a' && c <= 'z') || 
               (c >= 'A' && c <= 'Z') || 
               (c >= '0' && c <= '9');
    }
}