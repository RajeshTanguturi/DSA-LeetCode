class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        // Arrays.sort(arr);
        mergeSort(arr,0,arr.length-1);
        int diff = arr[0] - arr[1];
        for(int i = 2 ;i<arr.length ; i++){
            if(arr[i-1] - arr[i] != diff) return false;
        }
        return true;
    }
    public void mergeSort(int[] arr, int left, int right){
        if(left == right) return;
        int mid = left + (right - left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left, right , mid);
    }
    public void merge(int arr[], int l , int r, int m){
        int n1 = m-l+1;
        int n2 = r -m;
        int leftarr[] = new int[n1];
        int rightarr[] = new int[n2];

        for(int i = 0 ; i< n1 ; i++){
            leftarr[i] = arr[l+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            rightarr[i] = arr[m+1+i];
        }
        int i = 0 , j = 0 , k = l;
        while(i<n1 && j < n2){
            if(leftarr[i]<= rightarr[j]){
                arr[k] = leftarr[i];
                i++;
            }else{
                arr[k] = rightarr[j];
                j++;
            }
            k++;    
        }
        while(i<n1){
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }

}