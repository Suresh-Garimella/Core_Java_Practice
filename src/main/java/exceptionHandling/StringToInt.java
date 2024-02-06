package exceptionHandling;
// write a method that converts given string into an integer. Call the method with different inputs and print the return value.
// Print exception if it is thrown.
// sample inputs - "23", "45.67" , "test", "123f"
public class StringToInt   {

    public static String convertStringToInt(String str) throws NumberFormatException {
        try {
            return ""+Integer.parseInt(str);
        }
        catch(NumberFormatException ex){
            return "Inside the Exception \t"+ex.getMessage();
        }
    }

    public static void main(String[] args) {
        System.out.println( StringToInt.convertStringToInt("abc"));
    }
}
