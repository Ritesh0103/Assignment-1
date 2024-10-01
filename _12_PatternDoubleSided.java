import java.util.Scanner;

public class _12_PatternDoubleSided {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n %2 != 0)
        {
            int row = 1;
            int space1 = n-1;
            int star = 1;
            int space2 = -1;
            while(row <= n)
            {
                // Space 
                int count = 0;
                if(row <= n/2+1)
                {
                    count = row;
                }
                else{
                    count = n-row+1;
                }
                
                int col1 = 1;
                while(col1 <= space1)
                {
                    System.out.print("  ");
                    col1++;
                }

                // Star
                int col2 = 1;
                while(col2 <= star)
                {
                    System.out.print(count + " ");
                    if(row <= n)
                    {
                        count--;
                    }
                    col2++;
                }
                // Space
                int col3 = 1;
                while(col3 <= space2)
                {
                    System.out.print("  ");
                    col3++;
                }
                count++;

                // Star 
                int col4 = 1;
                if(row == 1 || row == n)
                {
                    col4 = 2;
                }
                while(col4 <= star)
                {
                    System.out.print(count+" ");
                    if(row <= n)
                    {
                        count++;
                    }
                    col4++;
                }

                // Next Iter
                if(row <= n/2)
                {
                    space1-=2;
                    space2+= 2;
                    star++;
                }else{
                    space1+=2;
                    space2 -= 2;
                    star--;
                }
                row++;
                System.out.println();
            }
        }
    }    
}
