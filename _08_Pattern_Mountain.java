import java.util.Scanner;

public class _08_Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && n < 10)
        {
            int row = 1;
            int star = 1;
            int space = 2*n-3;
            
            while(row <= n)
            {
                // Star 
                int col1 = 1;
                int count1 = 1;
                while(col1 <= star)
                {
                    System.out.print(count1+" ");
                    count1++;
                    col1++;
                }

                // Space
                int col2 = 1;
                while(col2 <= space)
                {
                    System.out.print("  ");
                    col2++;
                }

                // Star
                int col3 = 1;
                int count2 = count1-1;
                if(row == n)
                {
                    count2 = count1-2;
                    col3 = 2;
                }
                while(col3 <= star)
                {
                    System.out.print(count2+" ");
                    count2--;
                    col3++;
                }

                // Prep for the next iter
                row++;
                System.out.println();
                space -= 2;
                star++;
            }
        }
    }    
}
