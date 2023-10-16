public class MultiplicationTable
{
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
                System.out.println("Enter a number");
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
