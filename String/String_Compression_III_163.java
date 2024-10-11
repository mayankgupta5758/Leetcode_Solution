package String;

class Solution {
    public static String compressedString(String word) {
        Integer count = 0;
        StringBuilder ans = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            count = 1;
            char ch = word.charAt(i);
            while (i < word.length() - 1 && word.charAt(i) == word.charAt(i + 1)) {
                if (count != 9) {
                    count++;
                } else {
                    ans.append(count.toString() + ch);
                    count = 1;
                }
                i++;
            }
            ans.append(count.toString() + ch);
        }
        return ans.toString();
    }
}