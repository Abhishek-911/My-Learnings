public static int findTrapped(int height[]) {
    int n = height.length;
    int trappedwater = 0;

    for (int i = 0; i < n; i++) {
    int leftmax = 0;
    for (int j = 0; j <= i; j++) {
    leftmax = Math.max(leftmax, height[j]);
    }
    int rightmax = 0;
    for (int j = i; j < n; j++) {
    rightmax = Math.max(rightmax, height[j]);
    }
    trappedwater += Math.min(leftmax, rightmax) - height[i];
    }
    return trappedwater;
    }