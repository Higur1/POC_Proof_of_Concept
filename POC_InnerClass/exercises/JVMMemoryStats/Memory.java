package JVMMemoryStats;

public class Memory {
    private final Runtime runtime = Runtime.getRuntime();

    public Stats stats(){
        long free = runtime.freeMemory();
        long total = runtime.totalMemory();
        return new Stats(free, total - free, total);
    }

    //Static inner class
    public static class Stats{
        private final long free;
        private final long used;
        private final long total;

        public Stats(long free, long available, long total) {
            this.free = free;
            this.used = available;
            this.total = total;
        }

        public long getUsed() {
            return used;
        }

        public long getFree() {
            return free;
        }

        public long getTotal() {
            return total;
        }

        @Override
        public String toString() {
            return "Stats{" +
                    "free=" + free +
                    ", used=" + used +
                    ", total=" + total +
                    '}';
        }
    }
}
