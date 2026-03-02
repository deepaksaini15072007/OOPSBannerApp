public class OOPSBannerUC7{

    public static void main(String[] args) {

        String word = "OOPS";

        for (int line = 0; line < 7; line++) {

            for (char ch : word.toCharArray()) {

                if (ch == 'O') {
                    String[] O = {
                        " ***** ",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        "*     *",
                        " ***** "
                    };
                    System.out.print(O[line] + "  ");
                }

                else if (ch == 'P') {
                    String[] P = {
                        "****** ",
                        "*     *",
                        "*     *",
                        "****** ",
                        "*      ",
                        "*      ",
                        "*      "
                    };
                    System.out.print(P[line] + "  ");
                }

                else if (ch == 'S') {
                    String[] S = {
                        " ***** ",
                        "*      ",
                        "*      ",
                        " ***** ",
                        "      *",
                        "      *",
                        " ***** "
                    };
                    System.out.print(S[line] + "  ");
                }
            }

            System.out.println();
        }
    }
}