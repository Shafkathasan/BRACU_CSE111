import java.util.Scanner;
public class Task13
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Number:");
        int number = sc.nextInt();
        int k=1;
        for (int numC=1; numC<=number+(number-1); ++numC)
        {
            if(numC<number){
                System.out.print(k);
                ++k;}
            else{
                System.out.print(k);
                --k;}
        }
        System.out.println();
    }
}
