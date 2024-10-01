import java.util.Scanner;

public class _07_Fibonacci_Number {
    public static int Fibo(int n)
    {
        if(n==0 || n == 1)
        {
            return n;
        }
        return Fibo(n-1) + Fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && n < 100)
        {
            int row = 1;
            int star = 1;
            int fib = 0;
            while(row <= n)
            {
                // Star
                int col1 = 1;
                while(col1 <= star)
                {
                    System.out.print(Fibo(fib)+"\t");
                    fib++;
                    col1++;
                }

                star+= 1;
                row++;
                System.out.println();

            }
        }
    }    
}
