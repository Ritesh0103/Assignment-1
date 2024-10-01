import java.util.Scanner;

public class _06_Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int row = 1;
        int space = n-1;
        int star = 1;
        int i = 1;
        while(row <= 2*n-1)
        {
            // Spaces
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }

            // Star
            int col2 = 1;
            int count;
            if(row >= n)
            {
                space++;
            }else{
            if(row <= n)
            {
                space--;
            }else{
                space++;
            }
        }
            if(row <= n)
            {
                count = row;
            }else{
                count = n-i;
                i++;
            }
            while(col2 <= star)
            {
                System.out.print(count + " ");
                if(col2 <= star/2)
                {
                    count++;
                }else{
                    count--;
                }
                col2++;
            }

            if(row < n)
            {
                star += 2;
            }else{
                star -= 2;
            }

            // New Line start
            System.out.println();
            row++;
        }
    }    
}
