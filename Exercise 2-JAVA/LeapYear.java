import java.util.Scanner;
public class LeapYear{
    public static void main(String[] args){
        int n;
        System.out.println("Enter the year:");
        Scanner sct=new Scanner(System.in);
        n=sct.nextInt();
        if ((n%4==0)&&(n%100!=0)||(n%400==0))
        System.out.println("The given"+n+"is leap year.");
        else
        System.out.println("The given"+n+"is not leap year.");
    }
}