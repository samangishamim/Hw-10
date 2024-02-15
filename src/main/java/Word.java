import java.util.HashMap;
import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the word : ");
        String word = scanner.nextLine();


        HashMap<Character, Integer> letter = new HashMap<>();

        for (char a : word.toCharArray()) {
            letter.put(a, letter.getOrDefault(a, 0) + 1);
        }
        generate("", word.length(), letter);
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
