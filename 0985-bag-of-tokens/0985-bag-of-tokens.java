class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length - 1;
        int score = 0;
        int maxScore = 0;
        while( left <= right ){
            if(power >= tokens[left]){
                power-=tokens[left];
                score++;
                left++;
                maxScore = Math.max(maxScore,score);
            }else if(score > 0){
                power+=tokens[right];
                score--;
                right--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}