//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Numbers numbers = new Numbers();
    numbers.find();

    Mid mid = new Mid();
        String str1 = "string";
        String str2 = "code";
        String str3 = "Practice";

        System.out.println("Средние символы для '" + str1 + "': " + mid.Midl(str1));
        System.out.println("Средние символы для '" + str2 + "': " + mid.Midl(str2));
        System.out.println("Средние символы для '" + str3 + "': " + mid.Midl(str3));

    MinDifferentSymbols min = new MinDifferentSymbols();
        String text = "fffff ab f 1234 jkjk";
        String minWord = min.find(text);
        System.out.println("Слово с минимальным количеством различных символов: " + minWord);

    CountLatinWords latin = new CountLatinWords();
        String sentence = "One two three раз два три one1 two2 123";
        int count = latin.count(sentence);
        System.out.println("Количество слов, содержащих только латинские буквы: " + count);
        }
    }