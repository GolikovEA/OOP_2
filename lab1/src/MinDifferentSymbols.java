public class MinDifferentSymbols {

    public static String find(String text) {
        String[] words = text.split(" ");
        String minWord = words[0];
        int minCount = count(minWord);

        for (int i = 1; i < words.length; i++) {
            int curr = count(words[i]);
            if (curr < minCount || (curr == minCount && words[i].compareTo(minWord) > 0)) {
                minCount = curr;
                minWord = words[i];
            }
        }

        return minWord;
    }

    public static int count(String word) {
        boolean[] seen = new boolean[Character.MAX_CODE_POINT + 1];
        int curr = 0;

        for (char c : word.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                curr++;
            }
        }
        return curr;
    }
}
