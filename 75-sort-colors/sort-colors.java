class Solution {
    public void sortColors(int[] arr) {
        int zero = 0;
        int i = 0;
        int last = arr.length - 1;

        while(i <= last){
            if(arr[i] == 0){
                int temp = arr[i];
                arr[i] = arr[zero];
                arr[zero] = temp;
                zero++;
                i++;
            } 
            else if(arr[i] == 2){
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last] = temp;
                last--;
            } 
            else {
                i++;
            }
        }
    }
}