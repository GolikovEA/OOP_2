import java.io.IOException;

/**
 * <b> Сложение двух чисел</b>
 *
 * <b>Примечание:</b>
 *
 * @author Tomichio
 * @version 1.0
 * @since 2024-11-11
 */
public class Number {

    /**
     * @param numberFirst - первый
     * @param numberSecond - второй
     * @return int - тип
     */
    public int sum(int numberFirst, int numberSecond) {return numberFirst + numberSecond;}

    /**
     * @param args не используется
     * @throws IOException при ошибке ввода
     * @see IOException
     */
    public static void main(String args []) throws IOException {
        Number number = new Number();
        int sum = number.sum(10, 20);
        System.out.println(sum);
    }
}