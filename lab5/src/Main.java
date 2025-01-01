public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        Phone phone2 = new Phone("+784534541233", "iPhone", 240);
        Phone phone3 = new Phone("+789345712836", "samsung", 200);

        phone1.showPhone();
        phone2.showPhone();
        phone3.showPhone();

        Reader[] readers = new Reader[10];
        readers[0] = new Reader();

        readers[0].takeBook("Le Petit Prince", "Alice's Adventures in Wonderland", "The Magic of Oz");
        readers[0].returnBook( "The Magic of Oz");

        readers[0].takeBook(new Book("Le Petit Prince"), new Book("Alice's Adventures in Wonderland"), new Book("The Magic of Oz"));
    }
}