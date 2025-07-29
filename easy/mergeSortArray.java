public class mergeSortArray {
    public static void merge(int nums1[], int m, int nums2[], int n) {
        int i1 = m - 1;
        int i2 = n - 1;
        int i = m + n - 1;
        while(i1 >= 0 && i2 >= 0) {
            if(nums1[i1] > nums2[i2]) {
                nums1[i] = nums1[i1];
                i1--;
            } else {
                nums1[i] = nums2[i2];
                i2--;
            }
            i--;
        }
        while(i2 >= 0) {
            nums1[i] = nums2[i2];
            i--;
            i2--;
        }
    }
    public static void printArray(int nums[]) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String args[]) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int nums2[] = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
        printArray(nums1);
    }
}