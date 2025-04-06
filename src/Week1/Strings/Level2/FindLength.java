package src.Week1.Strings.Level2;
import java.util.*;
public class FindLength {
    public static void main(String[] args){
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();// string s; cin>>s;
        int count=0;
        while(true){
            try{
                str.charAt(count);//str[i];
                count++;
            }catch (StringIndexOutOfBoundsException e) {
                System.out.println("Length of String is " + count);
                break;
            }
        }
        System.out.println("The length of String using built-in length() method is "+str.length());
    }
}
