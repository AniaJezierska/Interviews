public class Sqrt {
    public int mySqrt(int x) {
        if (x < 2)
            return x;

        long num;
        int pivot;
        int left = 2;
        int right = x/2;

        while (left <= right) {
            pivot = left + (right - left) / 2;
            num = (long)pivot * pivot;

            if (num > x) right = pivot - 1;
            else if (num < x) left = pivot + 1;
            else return pivot;
        }
        return right;
    }


    public static void main(String[] args) {
        Sqrt sqrtCalculator = new Sqrt();

        int x = 4;
        int result = sqrtCalculator.mySqrt(x);

        System.out.println("The square root of " + x + " is: " + result);
    }
}
