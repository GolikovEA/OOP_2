public class Skirt extends Clothes implements WomensClothing{
    @Override
    public void DressWoman(){
        System.out.println("Одежда - Юбка");
        System.out.println("Размер: " + getSize() + " " + getSize().getDescription());
        System.out.println("Цвет: " + getColor());
        System.out.println("Цена: " + getPrice());
        System.out.println();
    }
}