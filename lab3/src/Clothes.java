public abstract class Clothes {
    private Size size;
    private int price;
    private Color color;

    Clothes(Size size, int price, Color color){
        this.color = color;
        this.price = price;
        this.size = size;
    }

    Clothes(){
        this.size = Size.XXS;
        this.color = Color.TRANSPARENT;
        this.price = 0;
    }

    public Size getSize(){
        return size;
    }
    public void setSize(Size size){
        this.size = size;
    }

    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}