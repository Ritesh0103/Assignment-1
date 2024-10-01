import java.util.Scanner;

public class _16_HourGlass
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 20)
        {
            int row = 1;
            int star = 2*n+1;
            int space = 0;
            int i = 0;
            while(row <= 2*n+1)
            {
                // Spaces
                int col1 = 1;
                while(col1 <= space)
                {
                    System.out.print("  ");
                    col1++;
                }

                // Stars
                int count = n - space;
                int col2 = 1;
                while(col2 <= star)
                {
                    System.out.print(count+" ");
                    if(col2 <= star / 2)
                    {
                        count--;
                    }else
                    {
                        count++;
                    }
                    col2++;
                }

                if(row > n)
                {
                    space--;
                    star += 2;
                }
                else{
                    space++;
                    star-=2;
                }
                // Next Iter
                row++;
                System.out.println();
            }

        }
    }
}