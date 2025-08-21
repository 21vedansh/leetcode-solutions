public class mostWater {
    public static int maxArea(int height[]) {
        int maxWater = 0;
        int left = 0, right = height.length-1;
        while(left < right) {
            int ht = Math.min(height[left], height[right]);
            int wt = right-left;
            int currentWater = ht * wt;
            maxWater = Math.max(maxWater, currentWater);

            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int height[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(maxArea(height));
    }
}