import java.util.Scanner;

public class _10_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(2 < n && n <= 1000000000)
        {
            for(int i = 2; i <= n-1; i++)
            {
                if(n % i == 0)
                {
                    count++;
                    break;
                }
            }
        }
        if(count == 1)
        {
            System.out.println("Not Prime");
        }else{
            System.out.println("Prime");
        }
    }    
}
