public   class Timer {
   private long timer ;

    public long getTimer() {
        long timer = System.nanoTime()/1000000;
        return timer;
    }
}
