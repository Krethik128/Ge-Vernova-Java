import java.util.*;
public class q1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<num;i++){
            if(i%2==0){
                System.out.println("Even number "+i);
            }
            else{
                System.out.println("Odd number "+i);
            }
        }
    }
}
