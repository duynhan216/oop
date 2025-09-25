public class SumOfTwoDice {
    public static void main(String[] args) {
        int Sides = 6;
        int a = 1 + (int) (Math.random() * Sides);
        int b = 1 + (int) (Math.random() * Sides);
        System.out.println(a + b);
    }
}
