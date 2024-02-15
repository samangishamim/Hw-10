import java.util.Random;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {

    }
    public static TreeSet<Character> getRandomCharacterSet() {
        TreeSet<Character> set = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char randomChar = (char) (random.nextInt(26) + 'a');
            set.add(randomChar);
        }
        return set;
    }
}
