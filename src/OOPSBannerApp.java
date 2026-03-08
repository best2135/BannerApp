public class OOPSBannerApp {

    // ── Static Inner Class ──────────────────────────────────────────────
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // ASCII art patterns made of '*'
    private static final CharacterPatternMap[] PATTERNS = {
        new CharacterPatternMap('O', new String[]{
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        }),
        new CharacterPatternMap('P', new String[]{
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        }),
        new CharacterPatternMap('S', new String[]{
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        })
    };

    private static String[] getPatternFor(char c) {
        for (CharacterPatternMap map : PATTERNS) {
            if (map.getCharacter() == c) {
                return map.getPattern();
            }
        }
        return new String[]{"     ", "     ", "     ", "     ", "     "};
    }

    public static void displayBanner(String word) {
        int lines = 5;
        for (int row = 0; row < lines; row++) {
            StringBuilder sb = new StringBuilder();
            for (char c : word.toCharArray()) {
                String[] pattern = getPatternFor(c);
                sb.append(pattern[row]);
                sb.append("  ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== OOPS Banner ===\n");
        displayBanner("OOPS");
    }
}
