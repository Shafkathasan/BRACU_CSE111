import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int[] a = new int[20];
        int i;
        for(i=0; i<=a.length-1; ++i) {
            System.out.println("Please Enter Number:");
            a[i]=sc.nextInt();
        }
        for(i=a.length-1; i>=0; --i) {
            if(a[i]%2==0){
                System.out.println(a[i]);
            }
        }
    }
}
