package src.Week1.Strings;

public class NullException {
    public static void main(String[] args){
        String s=null;
        try {
            System.out.println("Length of text: " + s.length());  // This will throw an exception
        } catch (NullPointerException e) {
            System.out.println("ive successfully handled the exception");
        }
        // only will execute if exception is handled properly
        System.out.println("Mahesh babu");
    }
}

