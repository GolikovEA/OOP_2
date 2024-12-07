public class Trousers extends Clothes implements MensClothing, WomensClothing{
    @Override
    public void DressMan(){
        System.out.println("Одежда - Брюки для мужчины");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
    @Override
    public void DressWoman(){
        System.out.println("Одежда - Брюки для женщины");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
}