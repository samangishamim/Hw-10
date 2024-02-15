import java.util.Random;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet<Character> set1 = getRandomCharacterSet();
        TreeSet<Character> set2 = getRandomCharacterSet();
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        TreeSet<Character> unionSet = findUnion(set1, set2);
        System.out.println("Union Set: " + unionSet);
        TreeSet<Character> commonSet = findCommonality(set1, set2);
        System.out.println("Common Set: " + commonSet);
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

    public static TreeSet<Character> findUnion(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> unionSet = new TreeSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }


    public static TreeSet<Character> findCommonality(TreeSet<Character> set1, TreeSet<Character> set2) {
        TreeSet<Character> commonSet = new TreeSet<>(set1);
        commonSet.retainAll(set2);
        return commonSet;
    }
}
