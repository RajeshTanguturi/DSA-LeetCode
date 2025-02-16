class Solution {
    public long maxWeight(int[] pizzas) {
        int n = pizzas.length;
        Arrays.sort(pizzas);
        int days = n/4; 
        long sum = 0;
        int index = n - 1;
        // Pick heaviest pizza on odd days
        for( int day = 1 ; day<=days ; day+=2){
            sum+=pizzas[index--];
        }
        index--;
         // Pick second heaviest pizza on even days
        for( int day = 2 ; day <= days ; day+=2){
            sum+=pizzas[index];
            index-=2;
        }
        return sum;
    }
}