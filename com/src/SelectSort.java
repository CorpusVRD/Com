public class SelectSort {
    public SelectSort(int[]list) {

        Timer timer = new Timer();
        long before = timer.getTimer();

        for (int n = 0; n <list.length ; n++){
            int minElementIndex = n;
            for (int j = n; j < list.length ; j++){
                if ( list [minElementIndex] > list[j]){
                    minElementIndex = j;
                }
            }
            if (minElementIndex !=n){
                int temp = list[n];
                list[n] = list[minElementIndex];
                list[minElementIndex] = temp;
            }
        }
        long after = timer.getTimer();
        System.out.println(" SelectSort " + list.length+ " элементов,время выполнения = " + (after - before) + " ms");
    }
}
