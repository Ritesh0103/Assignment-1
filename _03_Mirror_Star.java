import java.util.Scanner;

public class _03_Mirror_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n/2;

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
                System.out.print("* ");
                col2++;
            }
            // Mirror Process
            if(row <= n/2)
            {
                star += 2;
                space--;
            }else{
                star -= 2;
                space++;
            }

            // Prep for the next Iter
            System.out.println();
            row++;
        }
        sc.close();
    }    
}
