package src.Week1.Strings;

public class StringIndexOutOfBoundsException {
    public static void main(String []args){
        String name="Krethik";
        try{
            name.charAt(7);
        }catch(java.lang.StringIndexOutOfBoundsException e){
            System.out.println("Catching StringIndexOutOfBoundsException Exceptions ");
        }
        System.out.println("Printing after handling exceptions");
    }
}
