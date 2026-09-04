class Solution {
    public boolean detectCapitalUse(String word) {
        int c = 0, s = 0;
        for (char ch : word.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                s++;
            if (ch >= 'A' && ch <= 'Z')
                c++;
        }
        if ((s == word.length() || c == word.length())
                || (c == 1 && s == word.length() - 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')) {
            return true;
        }

        return false;
    }
}