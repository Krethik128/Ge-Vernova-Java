package src.Week1.Strings;
import java.util.*;
public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int size=sc.nextInt();
        int arr[]=new int[size];
        try{
            int a=arr[arr.length];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Handling ArrayIndexOutOfBoundsException");
        }

    }
}
