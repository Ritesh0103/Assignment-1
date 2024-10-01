import java.util.Scanner;

public class _11_R4_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n > 0 && n <= 100)
        {
            int row = 1;
            int star = 1;
            while(row <= n)
            {
                int col = 1;
                while(col <= star)
                {
                    System.out.print("*");
                    col++;
                }
                row++;
                star++;
                System.out.println();
            }
        }
    }    
}
