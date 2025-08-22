public class BeautifulArray {
    static int idx = 0;
    public static int[] beautifulArray(int n) {
        int beautifulArray[] = new int[n];
        createBeautiful(1, 1, beautifulArray, n);
        return beautifulArray;        
    }

    public static void createBeautiful(int start, int inc, int arr[], int n) {
        if(start + inc > n) {
            arr[idx++] = start;
            return;
        }
        createBeautiful(start, 2 * inc, arr, n);
        createBeautiful(start + inc, 2 * inc, arr, n);
    }

    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int n = 5;
        printArray(beautifulArray(n));
    }
}