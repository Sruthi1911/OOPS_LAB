import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;
public class FindDay{
    public static void main(String[] args){
        Scanner sct=new Scanner(System.in);/
        System.out.println("Enter year:");
        int year=sct.nextInt();
        System.out.println("Enter month:");
        int month=sct.nextInt();
        System.out.println("Enter day:");
        int day=sct.nextInt();
        LocalDate date=LocalDate.of(year,month,day);
        DayOfWeek dayofweek=date.getDayOfWeek();
        System.out.println("The day of the week is:"+dayofweek);
    }
}
