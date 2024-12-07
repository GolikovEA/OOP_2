public class Tie extends Clothes implements MensClothing{
    @Override
    public void DressMan(){
        System.out.println("Одежда - Галстук");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
}