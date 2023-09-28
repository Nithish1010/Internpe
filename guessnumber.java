import java.util.Scanner;
import java.lang.Math;
public class gnum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        boolean playagain=true;
        while(playagain)
        {
            System.out.println("\n\t\t\t\tWelcome to Number guessing Game!");
            System.out.println("\nEnter no. of trails: ");
            int k=sc.nextInt();
            int num=1+(int)(Math.random()*100);
            int i=0;
            for(i=0;i<k;i++)
            {
                System.out.println("Enter the number to guess: ");
                int gnum=sc.nextInt();
                if(num==gnum)
                {
                    System.out.println("Congrats! you guessed the number: "+num);
                    break;
                }
                else if(num>gnum && i!=k-1)
                {
                    System.out.println("the number is greater than: "+gnum);
                }
                else if(num<gnum && i!=k-1)
                {
                        System.out.println("the number is less than: "+gnum);
                }
           
            }  
            if(i==k)
            {
                System.out.println("your trail was exhausted");
                 System.out.println("The number is: "+num);

            } 
            System.out.println("Do you want to play again? (yes/no): ");
            String paChoice = sc.next().toLowerCase();
            playagain = paChoice.equals("yes");
        }
        System.out.println("\n\t\t\t\tThank You For Playing..!");
        sc.close();  
    }
}
