public class Atelier {
    public void dressMan(Clothes[] clothesArray) {
        for (Clothes clothes : clothesArray) {
            if (clothes instanceof MensClothing) {
                ((MensClothing) clothes).DressMan();
            }
        }
    }

    public void dressWomen(Clothes[] clothesArray){
        for(Clothes clothes:clothesArray){
            if(clothes instanceof WomensClothing){
                ((WomensClothing) clothes).DressWoman();

            }
        }
    }
}