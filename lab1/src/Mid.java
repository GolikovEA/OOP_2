public class Mid {
        public static String Midl(String str) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Длина строки должна быть четной.");
            }

            int midIndex = str.length() / 2;
            return str.substring(midIndex - 1, midIndex + 1);
        }
    }