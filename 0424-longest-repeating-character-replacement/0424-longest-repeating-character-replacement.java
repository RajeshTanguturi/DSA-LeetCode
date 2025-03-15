class Solution {
    public int getMaxFreq(int nums[]){
        int max = nums[0];
        for( int i  = 1 ; i < nums.length ; i++ ){
            max = Math.max(max, nums[i]);
        }
        return max;
    }
    public int characterReplacement(String s, int k) {
        int charFreq [] = new int[26];
        int left = 0;
        int max = 0 ;
        int maxFreq = 0;
        for( int right = 0 ; right < s.length() ; right++){
            char c = s.charAt(right);
            charFreq[c-'A']++;
            maxFreq = Math.max( maxFreq, charFreq[c-'A']);
            // System.out.println(right + " "+ c);
            //  System.out.println(Arrays.toString(charFreq));
            while ( left < right && (right - left + 1 ) - maxFreq  > k ){
                charFreq[s.charAt(left)-'A']--;
                maxFreq = getMaxFreq(charFreq);
                left++;
            }
            max = Math.max( max, right - left + 1);
        }
        return max;
    }
}