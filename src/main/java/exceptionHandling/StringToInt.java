package exceptionHandling;
// write a method that converts given string into an integer. Call the method with different inputs and print the return value.
// Print exception if it is thrown.
// sample inputs - "23", "45.67" , "test", "123f"
public class StringToInt   {

    public static Integer convertStringToInt(String str) throws NumberFormatException {

            return Integer.parseInt(str);
    }

//    public static void main(String[] args) {
//        System.out.println( StringToInt.convertStringToInt("45.67"));
//
//        System.out.println( StringToInt.convertStringToInt("test"));
//
//        System.out.println( StringToInt.convertStringToInt("23"));
//
//        System.out.println( StringToInt.convertStringToInt("123f"));
//
//    }
}
