package src.Week1.Strings.Level2;
import java.util.Scanner;
public class TrimSpaces {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str=str.trim();
        System.out.println(str);
    }

}
