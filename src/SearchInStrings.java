public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Cyril";
        char target = 'q';

        System.out.println(linearSearch2(name, target));
    }

    static public boolean linearSearch(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    static public boolean linearSearch2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }

        for (char ch: str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
