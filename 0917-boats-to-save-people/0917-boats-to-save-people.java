class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        System.out.println(Arrays.toString(people));
        int n = people.length;
        int right = n-1;
        int boats = 0;
        while(right>=0 && people[right] >= limit){
            boats+=1;
            right--;
        }
        int left = 0;
        while( left <= right){
            if(people[left]+people[right] <= limit){
                right--;
                left++;
            }else{
                right--;
            }
            boats+=1;
        }
        return boats;

    }
}