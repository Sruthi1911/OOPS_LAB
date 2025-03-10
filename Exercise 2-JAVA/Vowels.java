import java.util.Scanner;
public class Vowels{
    public static void main(String[] args){
        System.out.println("Enter the letter:");
        Scanner sct=new Scanner(System.in);
        char ch=sct.next().charAt(0);
        if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='o'||ch=='U')
        System.out.println("The given letter is vowel.");
        else
        System.out.println("The given letter is consonant.");
        sct.close();
    }
}