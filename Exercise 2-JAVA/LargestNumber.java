import java.util.Scanner;
public class LargestNumber{
    public static void main(String[] args){
        int a,b,c;
        System.out.println("Enter three numbers");
        Scanner sct=new Scanner(System.in);
        a=sct.nextInt();
        b=sct.nextInt();
        c=sct.nextInt();
        if (a>b && a>c)
        System.out.println("1st number is the largest.");
        else if (b>a && b>c)
        System.out.println("2nd number is the largest.");
        else if (c>a && c>b)
        System.out.println("3rd number is the largest.");
        else 
        System.out.println("Number is distinct.");
    }
}