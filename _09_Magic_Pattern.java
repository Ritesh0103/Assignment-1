import java.util.Scanner;

public class _09_Magic_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n;
        int space = -1;

        while(row <= 2*n-1)
        {
            // Star 
            int col1 = 1;
            while(col1 <= star)
            {
                System.out.print("*");
                col1++;
            }

            // Space 
            int col2 = 1;
            while(col2 <= space)
            {
                System.out.print(" ");
                col2++;
            }

            // Star 
            int col3 = 1;
            if(row == 1 || row == 2*n-1)
            {
                col3 = 2;
            }
            while(col3 <= star)
            {
                System.out.print("*");
                col3++;
            }

            // Prep for the next iter
            System.out.println();
            row++;
            if(row <= n)
            {
                star--;
                space += 2;
            }
            else{
                star++;
                space -= 2;
            }
        }
    }    
}
