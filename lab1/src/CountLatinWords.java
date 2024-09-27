public class CountLatinWords {
    public static int count(String sentence) {
        String[] words = sentence.split(" ");
        int count = 0;
        for (String word : words) {
            if (isLatinWord(word)) {
                count++;
            }
        }
        return count;
    }

    public static boolean isLatinWord(String word) {
        for (char c : word.toCharArray()) {
            if (!Character.isLetter(c) || !isAscii(c)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAscii(char c) {
        return c <= 127;
    }
}
