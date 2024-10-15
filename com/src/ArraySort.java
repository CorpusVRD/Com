import java.util.Arrays;

public class ArraySort {
    Timer timer = new Timer();

   long before = timer.getTimer();

   public ArraySort(int[]list) {
       Arrays.sort(list);
       long after = timer.getTimer();
        System.out.println(" ArraysSort " + list.length+ " элементов,время выполнения = " + (after - before) + " ms");
    }
}
