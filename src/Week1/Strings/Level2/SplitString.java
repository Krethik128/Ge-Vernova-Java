package src.Week1.Strings.Level2;

import java.util.Scanner;

public class SplitString {
    public static int getLength(String str){
        int count=0;
        while(true){
            try{
                str.charAt(count);//str[i];
                count++;
            }catch (StringIndexOutOfBoundsException e) {

                break;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int length=getLength(str);

        int wordCount=1;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' '){
                wordCount++;
            }
        }
        String arr[]=new String[wordCount];
        int idx=0;
        int start=0;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' '){
                String temp="";
                for(int j=start;j<i;j++){
                    temp+=str.charAt(j);
                }
                start=i+1;
                arr[idx]=temp;
                idx++;
            }
        }
        String temp = "";
        for (int j = start; j < length; j++) {
            temp += str.charAt(j);
        }

        String[] builtInWords = str.split(" ");
        System.out.println("Built-in split: ");
        for (String word : builtInWords) {
            System.out.println(word);
        }

        System.out.println("Manual split: ");
        for (String word : arr) {
            System.out.println(word);
        }
    }
}
