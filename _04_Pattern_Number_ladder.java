import java.util.Scanner;

public class _04_Pattern_Number_ladder
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int star = 1;
        int row = 1;
        int count = 1;
        while(row <= n)
        {
            // Star
            int col1 = 1;
            while(col1 <= star)
            {
                System.out.print(count + " ");
                count++;
                col1++;
            }
            // Prep for the next Iter
            System.out.println();
            row++;
            star++;
        }
    }
}