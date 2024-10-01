import java.util.Scanner;

public class _01_Hollow_Diamond
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = n/2+1;
        int space = -1;

        while(row <= n)
        {
            //  Stars
            int col1 = 1;
            while(col1 <= star)
            {
                System.out.print("*\t");
                col1++;
            }
            // Spaces
            int col2 = 1;
            while(col2 <= space)
            {
                System.out.print("\t");
                col2++;
            }
            // Star
            int col3 = 1;
            if(row == 1 || row == n)
            {
                col3 = 2;
            }
            while(col3 <= star)
            {
                System.out.print("*\t");
                col3++;
            }

            // Mirror Forming
            if(row <= n/2)
            {
                star--;
                space+=2;
            }else{
                star++;
                space-=2;
            }
            // Next Iter
            System.out.println();
            row++; 
        }
        sc.close();
    }
}