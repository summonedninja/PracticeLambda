public class MathTest {

    @FunctionalInterface
    interface MathInterface<T> {
        T getMax(T first, T second);
    }

    static void print(MathInterface m) {
        System.out.println(m.getMax(324, 35));
    }

    public static void main(String[] args) {
        MathInterface<Integer> m = (x,y) -> x > y ? x : y;
        MathInterface<Integer> m1 = (x,y) -> x < y ? x : y;

        print(m);
    }

}
