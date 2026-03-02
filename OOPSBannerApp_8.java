import java.util.*;

public class OOPSBannerApp_8{

    static Map<Character, String[]> map = new HashMap<>();
    public static void main(String[] args){
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

        renderBanner("OOPS");
    }

    public static void renderBanner(String word) {

        for (int row = 0; row < 5; row++) {
            for (char ch : word.toCharArray()) {
                String[] pattern = map.get(ch);
                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }
            System.out.println();
        }
    }
}