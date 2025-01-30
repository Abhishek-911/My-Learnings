public class _09_Trapped_Water {

    // Brute-Force Approach
    // public static int findTrapped(int height[]) {
    // int n = height.length;
    // int trappedwater = 0;

    // for (int i = 0; i < n; i++) {
    // int leftmax = 0;
    // for (int j = 0; j <= i; j++) {
    // leftmax = Math.max(leftmax, height[j]);
    // }
    // int rightmax = 0;
    // for (int j = i; j < n; j++) {
    // rightmax = Math.max(rightmax, height[j]);
    // }
    // trappedwater += Math.min(leftmax, rightmax) - height[i];
    // }
    // return trappedwater;
    // }

    // Optimal Approach
    public static int findTrapped(int height[]) {
        int left = 0;
        int right = height.length - 1;
        int leftmax = 0, rightmax = 0;
        int trappedwater = 0;

        while (left < right) {
            leftmax = Math.max(leftmax, height[left]);
            rightmax = Math.max(rightmax, height[right]);
            if (leftmax < rightmax) {
                trappedwater += leftmax - height[left];
                left++;
            } else {
                trappedwater += rightmax - height[right];
                right--;
            }
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int trappedwater = findTrapped(height);
        System.out.println("The amount of Trapped Water is: " + trappedwater);
    }
}
