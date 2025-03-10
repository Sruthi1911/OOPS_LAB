import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner sct=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1=sct.nextInt();
        System.out.println("Enter the operator (+,-,*,/):");
        char ch=sct.next().charAt(0);
        System.out.println("Enter the second number:");
        int num2=sct.nextInt();
        int result;
        switch (ch){
            case'+':
            result=num1+num2;
            System.out.println("Result:"+result);
            break;
            case'-':
            result=num1-num2;
            System.out.println("Result:"+result);
            break;
            case'*':
            result=num1*num2;
            System.out.println("Result:"+result);
            break;
            case'/':
            if (num2 !=0){
                result=num1/num2;
                System.out.println("Result:"+result);
                break;
            }
            else{
                System.out.println("Error! Division by zero is not allowed.");
                break;
            }
            default:
            System.out.println("Invalid operator! Please use +, -, *, or /.");
        }
        sct.close();
            
    }
}