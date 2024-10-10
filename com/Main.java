import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        filterNumber("+7(987)654-32-10");
        filterNumber(" g + 89 ( 123 ) 456-78-910");
        String userString = ">?^^^?< Java-машины. Дата официального выпуска — 23 мая 1995 года.|Ёё$";
        String result = remove(userString);
        System.out.println(userString);
        printResult(result);
    }
    public  static void  filterNumber (String userPhoneNumber) {
        System.out.println(userPhoneNumber + " user phone number");
        String filterNumber1 = userPhoneNumber.replaceAll("[^\\d+]", "");

         if (filterNumber1.matches("^\\+[\\d]{1,15}$")) {
            System.out.println(filterNumber1 + " correctly\n");
        } else {
            System.out.println(filterNumber1 + " incorrectly\n");
        }
    }
    private static String remove (String userString){
        return userString.replaceAll("([A-zА-яЁё\\s])","");
    }
    private static String  printResult(String result) {
        System.out.println(result + "//результат удаления букв и пробелов//");
        return result;
    }
}
