public class mergeSortArray {
    public static int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
    public static void mergeSort(int nums[], int si, int ei) {
        if(si >= ei) {
            return;
        }
        int mid = si + (ei - si)/2;
        mergeSort(nums, si, mid);
        mergeSort(nums, mid+1, ei);
        merge(nums, si, mid, ei);
    }
    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i <= mid && j <= ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i <= mid) {
            temp[k++] = arr[i++];
        }
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        for(k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int nums[] = {5, 1, 1, 2, 0, 0};
        printArray(sortArray(nums));
    }
}