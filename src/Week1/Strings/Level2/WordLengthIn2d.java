package src.Week1.Strings.Level2;

import java.util.Scanner;

public class WordLengthIn2d {
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
        String[][] arr =new String[wordCount][2];
        int idx=0;
        int start=0;
        for(int i=0;i<length;i++){
            if(str.charAt(i)==' '){
                String temp="";
                for(int j=start;j<i;j++){
                    temp+=str.charAt(j);
                }

                arr[idx][0]=temp;
                arr[idx][1]=String.valueOf(getLength(temp));;
                idx++;
                start=i+1;
            }
        }
        String temp = "";
        for (int j = start; j < length; j++) {
            temp += str.charAt(j);
        }
        arr[idx][0] = temp;
        arr[idx][1] = String.valueOf(getLength(temp));

        System.out.println("\nWord\tLength");
        for (String[] strings : arr) {
            String word = strings[0];
            int len = Integer.parseInt(strings[1]);
            System.out.println(word + "\t" + len);
        }
    }
}
