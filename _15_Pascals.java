import java.util.Scanner;

public class _15_Pascals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && n < 100)
        {
            int row = 1;
            int star = 1;
            while(row <= n)
            {
                int col1 = 1;
                int passcal = 1;
                while(col1 <= star)
                {
                    System.out.print(passcal + "\t");
                    passcal = passcal * (row - col1)/col1;
                    col1++;
                }
                row++;
                star++;
                System.out.println();
            }
        }
    
    }    
}
