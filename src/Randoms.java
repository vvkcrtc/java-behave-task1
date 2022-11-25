import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random;
    int min;
    int max;
    int rand = 0;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
        random = new Random();
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {

                rand = random.nextInt(min, max + 1);
                return true;

            }

            @Override
            public Integer next() {
                return rand;
            }
        };
    }
}
