import java.util.Scanner;

public class _13_Pattern_with_Zeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n > 0 && n < 100)
        {
            int row = 1;
            int star = 1;
            while(row <= n)
            {
                int count = row;
                int col1 = 1;
                while(col1 <= star)
                {
                    if(row <= 2)
                    {
                        System.out.print(count+"\t");
                    }
                    else{
                        if(col1 == 1 || col1 == star)
                        {
                            System.out.print(count + "\t");
                        }else{
                            System.out.print("0\t");
                        }
                    }
                    col1++;
                }
                // Next iter
                row++;
                System.out.println();
                star++;
            }

        }


    }    
}
