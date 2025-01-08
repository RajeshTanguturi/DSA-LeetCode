class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }
        return count;
    }

    public boolean isPrefixAndSuffix(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        for (int i = 0; i < n1; i++) {
            if (i >= n2 || s1.charAt(i) != s2.charAt(i) || s1.charAt(n1 - 1 - i) != s2.charAt(n2 - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}