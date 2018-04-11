package math;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
         */
        int Previous =0; int next = 1;
        for(int i=0; i<40; i++){
            System.out.println(Previous);
            Previous = next - Previous;
            next = next + Previous;
        }
    }
}
