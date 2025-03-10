import java.util.Scanner;
public class ATMProgram{
    public static void main(String [] args){
        Scanner sct=new Scanner(System.in);
        double balance=850000;

        System.out.println("Welcome to the ATM!!");
        while(true) {
            System.out.println("choose an option:");
            System.out.println("1.Check Balance");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Exit");
            try{
                int choice=Integer.parseInt(sct.nextLine());
                switch(choice) {
                    case 1:
                        System.out.println("Your current balance is:$"+ balance);
                        break;
                    case 2:
                        System.out.println("Enter amount to deposit:");
                        double deposit=Double.parseDouble(sct.nextLine());
                        if(deposit<=0){
                            System.out.println("Can deposit more than 0 only.");
                            break;
                        }
                        balance+= deposit;
                        System.out.println("Sucessfully deposited:$"+ deposit);
                        break;
                    case 3:
                        System.out.println("Enter amount to withdraw:");
                        double withdraw=Double.parseDouble(sct.nextLine());
                        if(withdraw<=0){
                            System.out.println("Can withdraw more than 0 only.");
                            break;
                        }
                        if(withdraw<=balance){
                            balance-= withdraw;
                            System.out.println("Sucessfully withdrew:$"+ withdraw);
                        }else{
                            System.out.println("insufficient funds!!");

                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM .Goodbye!! Don't visit again.🤣🐒looking like monkey.");
                        return;
                    default:
                        System.out.println("invalid option! please don't try it again monkey 🐒🐒🐒.");




                }
            }
            catch(NumberFormatException nf){
                System.out.println("Enter integers only...");
            }
            }





    }
}