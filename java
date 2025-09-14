//для поиска max значение
public class Main {

    public static void main(String[] args) {
        var ints = new int[]{10, 50, 45, 99, -3, 0};
        var max = findMax(ints);
        System.out.println(max);
    }

    private static int findMax(int[] ints) {
        int max = Integer.MIN_VALUE;

        for (var current : ints) {
            if (current > max) {
                max = current;
            }
        }

        return max;
    }
}
