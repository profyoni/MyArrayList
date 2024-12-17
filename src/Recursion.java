public class Recursion {
    public static void main(String[] args) {
        towersOfHanoi(3,"A","C","B");
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

}
