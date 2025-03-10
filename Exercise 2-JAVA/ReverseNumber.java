import java.util.Scanner;
public class ReverseNumber{
    public static void main(String[] args){
        int n,rev=0;
        System.out.println("Enter the number to reverse");
        Scanner sct=new Scanner(System.in);
        n=sct.nextInt();
        while(n!=0)
        {
            rev=rev*10;
            rev=rev+n%10;
            n=n/10;

        }
        System.out.println("Reverse of a entered number is"+rev);
    }
}