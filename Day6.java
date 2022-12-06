import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) throws IOException {
        Scanner sd = null;
        File data = new File("input.txt");
        sd = new Scanner(data);
        String use = sd.next();

        ArrayList<Character> g = new ArrayList<Character>();
        for (int i = 0; i < use.length(); i++) {
            g.add(use.charAt(i));
        }

        for (int i = 0; i < use.length(); i++) {
            String sect = use.substring(i, i+14);
            if (aredifferent(sect)){
                System.out.println(i+14);
                return;
            }
        }

    }

    static boolean aredifferent(String input) {
        for (int i = 0; i < input.length() - 1; i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.charAt(i) == input.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}

