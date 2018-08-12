import model.FizzBuzz;
import model.FizzBuzzFactory;
import model.IFizzBuzz;

public class FizzBuzzApp {

    public static void main(String[] args) {

        long baseTime = printData("base");
        long staticTime = printData("static");
        long directTime = printData("direct");
        long directStaticTime = printData("directStatic");

        System.out.print("\n========================== Result ==========================\n");
        System.out.printf("Base: %.3f ms, Static: %.3f ms, Direct: %.3f ms, DirectStatic: %.3f ms\n"
                , baseTime/1000.0, staticTime/1000.0, directTime/1000.0, directStaticTime/1000.0);
    }

    private static long printData(String fizzBuzzName) {
        System.out.print("\n\nPrint FizzBuzz for 1-100 using '" + fizzBuzzName + "' algorithm\n");

        IFizzBuzz fb = FizzBuzzFactory.get().create(fizzBuzzName);

        long startTime = System.nanoTime();
        for (int i=1; i<=100; ++i) {
            System.out.print(fb.make(i) + "\n");
        }

        return System.nanoTime() - startTime;
    }
}
