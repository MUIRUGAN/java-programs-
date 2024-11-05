// program for calculate the sum of cube values from one intger to another integer
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter the starting element");
        int m =obj.nextInt();
        System.out.println("enter the ending element ");
        int n = obj.nextInt();
        int sum = 0;
        if(m>n)//check whether the input is valid or not
        {
            System.out.println("invalid input");
        }
        else
        {
            for(int i=m;i<=n;i++)
            {
                //calculate the cube value and stored 
                sum = sum+(int)Math.pow(i,3);
            }
            //display the total cube value
            System.out.println(sum);
        }
        obj.close();
    }
}