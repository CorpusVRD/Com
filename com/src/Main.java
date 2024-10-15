import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        for ( int size = 1000; size <=100000 ; size = size * 10){

            Rnd rnd = new Rnd((int) System.nanoTime() % 256, 31, 71, 9999);
            for (int iteration = 1; iteration <= 4; iteration++){
                ///// массив /////
                int[] list = new int[size];
                for (int n = 0; n < list.length; n++){
                    list[n] = rnd.get();
                }
                switch (iteration) {
                    case 1:
                        ArraySort arraySort = new ArraySort(list);
                        break;
                    case 2:
                        //  for (int number : list){System.out.print( number + "," );} /////  смотреть массив /////
                        InsertSort insertSort = new InsertSort(list);
                        break;
                    case 3:
                        SelectSort selectSort = new SelectSort(list);
                        break;
                    case 4:
                        BubleSort bubleSort = new BubleSort(list);
                        break;
                }
            }
            print("");
        }
    }
    public static void print(String text) {
        System.out.println(text);
    }
}
