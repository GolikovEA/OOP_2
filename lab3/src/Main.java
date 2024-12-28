public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {new Skirt(), new Tshirt(), new Trousers(), new Tie()};

        Atelier atelier = new Atelier();
        atelier.dressWomen(clothes);
        atelier.dressMan(clothes);
    }
}