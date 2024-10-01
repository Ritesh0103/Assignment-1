import java.util.Scanner;

public class _02_Pattern_Traingle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int star = 1;
        int space = n-1;

        while(row <= n)
        {  
            //  Spaces 
            int col1 = 1;
            while(col1 <= space)
            {
                System.out.print("  ");
                col1++;
            }
            // Mirror Concept
            int count = row;

            // Star
            int col2 = 1;
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
            // Prep For Next Iter
            System.out.println();
            row++;
            space--;
            star+= 2;
        }
        sc.close();
    }
}