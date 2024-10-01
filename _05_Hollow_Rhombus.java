import java.util.Scanner;

public class _05_Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = n-1;

        while(row <= n)
        {
            // Space
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }

            // Star
            int col2 = 1;
            while(col2 <= star)
            {
                if(row == 1 || col2 == 1 || col2 == n || row == n)
                {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                col2++;
            }

            // Prep for the next Iter 
            System.out.println();
            row++;
            space--;
        }
    }    
}
