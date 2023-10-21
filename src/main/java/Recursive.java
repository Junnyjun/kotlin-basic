public class Recursive {
    public int task(int n) {
        if (n == 0) return 0;
        return n + task(n - 1);
    }
}
