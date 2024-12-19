import java.util.HashMap;

public class Recursion {
    public static void main(String[] args) {
       // towersOfHanoi(3,"A","C","B");
        //System.out.println(fibonacciR(100));
        try{
        foo(0);}
        catch(Error e){

        }
    }
    public static void foo(int depth){
        long []a= new long[1000];
        System.out.println(depth);
        foo(depth+1);
    }
    public static int stringLength( String s ){
        if (s.toCharArray().length == 0)
            return 0;
        return 1 + stringLength(s.substring(1));
    }

    public static long factorial(int n) {
        return (n <= 1) ? 1 : n * factorial(n - 1);
    }

    public static void towersOfHanoi(int numberOfDiscs, String source, String dest, String temp)
    {
        if (numberOfDiscs == 1){
            System.out.printf("Move disc from %s to %s%n", source, dest);
            return;
        }
        towersOfHanoi(numberOfDiscs - 1, source, temp, dest);
        System.out.printf("Move disc from %s to %s%n", source, dest);
        towersOfHanoi(numberOfDiscs - 1, temp, dest, source);
    }







    static HashMap<Integer, Long> fibMemoized = new HashMap<>();
    public static long fibonacciR(int n) {
        if (fibMemoized.containsKey(n)) {
            return fibMemoized.get(n);
        }
        if (n <= 1){ // Base
            fibMemoized.put(n, (long)n);
            return n;
        }
        long solution = fibonacciR(n - 1) + fibonacciR(n - 2);
        fibMemoized.put(n, solution);
        return solution;
    }

}
