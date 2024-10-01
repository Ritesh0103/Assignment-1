import java.util.Scanner;

public class _14_Pattern_InvertedHourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = 2*n-1;
        int star = 1;
        int i = 1;

        while(row <= 2*n+1)
        {
            // Star
            int count1 = n;
            int col1 = 1;
            while(col1 <= star)
            {
                System.out.print(count1+" ");
                count1--;
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
            if(row == n+1)
            {
                col3 = 2;
                count1++;
            }
            count1++;
            
            while(col3 <= star)
            {
                System.out.print(count1+" ");
                count1++;
                col3++;
            }

            if(row <= n)
            {
                star++;
                space-=2;
            }
            else{
                star--;
                space+=2;
            }
            row++;
            System.out.println();
        }
    }    
}
