package GregoryPi;

import static GregoryPi.GregorySeriesCalculator.NUM_ITERATIONS;
import static GregoryPi.GregorySeriesCalculator.NUM_THREADS;

public class GregorySeriesPartialCalculator extends Thread {
    private final int id;
    private final double[] partials;

    public GregorySeriesPartialCalculator(int id, double[] partials) {
        this.id = id;
        this.partials = partials;
    }

    @Override
    public void run() {
        double sum = 0.0;
        for (int i = id; i < NUM_ITERATIONS; i += NUM_THREADS) {
            int s;
            if (i % 2 == 0) {
                s = 1;
            } else {
                s = -1;
            }
            sum += (double) s / (2 * i + 1);
        }
        partials[id] = sum;
    }
}
