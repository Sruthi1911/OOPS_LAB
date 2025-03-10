import java.util.Scanner;
public class GretestNumber {
    public static void main(String[] args){
        int x,y,z;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number:");
        x = s.nextInt();
        System.out.println("Enter the second  number:");
        y = s.nextInt();
        System.out.println("Enter the third number:");
        z = s.nextInt();
        if (x>y)
        {
            if(x>z)
            {
                System.out.println("The gretest number among all is:"+x);
            }
            else{
                System.out.println("The gretest number among all is:"+z);
            }
        }
        if(y>z){
            System.out.println("The gretest number among all is:"+y);
        }
        else{
            System.out.println("The gretest number among all is:"+z);
        }
        System.out.println("code execution sucessfull!!");

    }
    
}