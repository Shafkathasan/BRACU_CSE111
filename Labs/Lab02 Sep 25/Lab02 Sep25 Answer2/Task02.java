import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        int i, j;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
            System.out.print("You have Entered ");
            for(j=0; j<=i; ++j) {
                System.out.print(a[j]+",");
            }
            System.out.println();
        }
    }
}
