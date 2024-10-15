public class InsertSort {
    public InsertSort(int[]list) {
        Timer timer = new Timer();
        long before = timer.getTimer();
        for (int n = 0; n < list.length ; n++){
            int key = list [n];
            int j = n - 1 ;
            while (j >= 0 && list[j] > key){
                list[j + 1] = list[j];
                j = j -1;
            }
            list[j + 1 ] = key;
        }
        long after = timer.getTimer();
        System.out.println(" InsertSort " + list.length+ " элементов,время выполнения = " + (after - before) + " ms");
    }
}
