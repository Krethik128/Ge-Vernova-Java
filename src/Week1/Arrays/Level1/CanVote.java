package src.Week1.Arrays.Level1;
import java.util.*;
public class CanVote {
    public static void main(String args[]){
        int students=10;
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[students];
        for(int i=0;i<students;i++){
            arr[i]=sc.nextInt();;
            if(arr[i]<0){
                System.out.println(arr[i]+" is invalid age");
            }
            else if(arr[i]>18){
                System.out.println(arr[i]+" can vote");
            }
            else {
                System.out.println(arr[i] + " cannot vote");
            }
        }

    }
}
