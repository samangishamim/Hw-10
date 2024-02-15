import java.util.HashMap;

public class Word {
    public static void main(String[] args) {

    }
    private static void generate(String p, int r, HashMap<Character, Integer> letter) {
        if (r == 0) {
            System.out.println(p);
            return;
        }

        for (char c : letter.keySet()) {
            int count = letter.get(c);
            if (count > 0) {
                letter.put(c, count - 1);
                generate(p + c, r - 1, letter);
                letter.put(c, count);
            }
        }

    }
}
