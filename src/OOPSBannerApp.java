import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // ── Build and return the HashMap of character -> pattern ────────────
    private static Map<Character, String[]> buildPatternMap() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        });

        map.put('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        });

        map.put('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        });

        return map;
    }

    // ── Display the banner using nested loops + StringBuilder ───────────
    public static void displayBanner(String word) {
        Map<Character, String[]> patternMap = buildPatternMap();
        int lines = 5;

        // Outer loop: each row of the banner (0 to 4)
        for (int row = 0; row < lines; row++) {
            StringBuilder sb = new StringBuilder();

            // Inner loop: each character in the word
            for (char c : word.toCharArray()) {
                String[] pattern = patternMap.getOrDefault(c,
                    new String[]{"     ", "     ", "     ", "     ", "     "});
                sb.append(pattern[row]);
                sb.append("  "); // spacing between letters
            }

            System.out.println(sb.toString());
        }
    }

    // ── Main ─────────────────────────────────────────────────────────────
    public static void main(String[] args) {
        System.out.println("=== OOPS Banner ===\n");
        displayBanner("OOPS");
    }
}
