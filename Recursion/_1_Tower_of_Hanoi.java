public class _1_Tower_of_Hanoi {

    static int i = 1;

    public static void TowerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Step "+(i++)+": Transfer disk " + n + " from " + src + " to " + dest);
            return;
        }
        TowerofHanoi(n - 1, src, dest, helper);
        System.out.println("Step "+(i++)+": Transfer disk " + n + " from " + src + " to " + dest);
        TowerofHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        TowerofHanoi(n, "A", "B", "C");
    }
}