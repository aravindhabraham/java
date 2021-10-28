import java.util.Scanner;

public class main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println("** Printing the pattern... **");
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)  n 
            {
                System.out.print(" "+ j + " ");
            }
            System.out.println();
        }
    }
}
