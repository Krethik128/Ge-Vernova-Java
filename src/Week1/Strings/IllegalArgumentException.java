package src.Week1.Strings;

public class IllegalArgumentException {
    public static void main(String []args){
        String s="Krethik";
        try{
            s.substring(7);
        } catch (java.lang.IllegalArgumentException e) {
            System.out.println("We have handled Exception");
        }
        System.out.println("Handled Exception");
    }
}
