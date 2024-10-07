public class Main {
    public static void main(String[] args) {

        String  text1 = "В тексте, который вы видите на этом изображении, " +
                "посчитайте количество букв ‘е’ в каждом слове";

        String replaceText = text1.replaceAll("[а-яА-ЯёЁ\\s]","");

        System.out.println(replaceText);

        System.out.println("выражение для проверки номера +7 XXX XXX-XX-XX " +
                "^(\\+\\d|8)(\\D{0,2})(\\d{1,3})(\\D)(\\d{1,3})(\\D)(\\d{1,2})\\D(\\d{1,2})$");

        String  text = "В тексте, который вы видите на этом изображении, " +
                "посчитайте количество букв ‘е’ в каждом слове";

        int number_e = 0;
        int word = 0 ;

        print(text + "\n");

        for (int n = 0; n <text.length() ; n++){
            if  ( text.charAt(n) == 'е' ) {
                number_e++;
            }
            if( text.charAt(n) == ' '){
                word++;
                print( " " + number_e + "e");
                number_e = 0;
            }
            print(text.charAt(n) + "");
        }
        print(" " + number_e + "е");
    }
    private static void print(String text) {
        System.out.print(text);
    }
}