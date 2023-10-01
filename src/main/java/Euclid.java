public class Euclid {
    public int task(int a, int b) {
        return switch (Integer.compare(a, b)) {
            case 1 -> task(a - b, b);
            case -1 -> task(a, b - a);
            default -> a;
        };
    }
}