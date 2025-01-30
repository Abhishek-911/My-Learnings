public class _10_Container_Water {

    // Brute-Force Approach
    // public static int findMaxArea(int height[]) {
    // int maxarea = 0;

    // for (int i = 0; i < height.length; i++) {
    // for (int j = i + 1; j < height.length; j++) {
    // int minheight = Math.min(height[i], height[j]);
    // int width = j - i;
    // int area = minheight * width;
    // maxarea = Math.max(maxarea, area);
    // }
    // }

    // return maxarea;
    // }

    // Optimal-Approach
    public static int findMaxArea(int height[]) {
        int maxarea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int minheight = Math.min(height[left], height[right]);
            maxarea = Math.max(maxarea, minheight * (right - left));
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxarea;
    }

    public static void main(String[] args) {
        int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        int area = findMaxArea(height);
        System.out.println("Maximum area is: " + area);
    }
}
