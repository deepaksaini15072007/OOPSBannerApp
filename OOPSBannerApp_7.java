public class OOPSBannerApp_7 {

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
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };
        CharacterPatternMap o1 = new CharacterPatternMap('O', O);
        CharacterPatternMap p1 = new CharacterPatternMap('P', P);
        CharacterPatternMap s1 = new CharacterPatternMap('S', S);
        CharacterPatternMap[] maps = {o1, p1, s1};

        String word = "OOPS";
        for (int line = 0; line < 7; line++) {

            StringBuilder row = new StringBuilder();

            for (char ch : word.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                row.append(pattern[line]).append("  ");
            }

            System.out.println(row);
        }
    }
}