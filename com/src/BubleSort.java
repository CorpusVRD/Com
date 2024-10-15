import org.jetbrains.annotations.NotNull;

public class BubleSort {
    Timer timer = new Timer();
    long before = timer.getTimer();
    public BubleSort(int []list) {

        for (int m = 0; m < list.length-1; m++){
            for (int n = 0; n < list.length - 1; n++){
                int temp = list[n];
                if (temp > list[n + 1]) {
                    list[n] = list[n + 1];
                    list[n + 1] = temp;
                }
            }
        }
        long after = timer.getTimer();
        System.out.println(" BubleSort  " + list.length+ " элементов,время выполнения = " + (after - before) + " ms");
    }
}
