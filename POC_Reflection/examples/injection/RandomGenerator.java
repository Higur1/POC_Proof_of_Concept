package injection;

import java.util.Random;

public class RandomGenerator {
    private Random random = new Random();

    @Inject
    private int min;
    @Inject
    private int max;

    public int next(){
        return random.nextInt(min, max+1);
    }
}
