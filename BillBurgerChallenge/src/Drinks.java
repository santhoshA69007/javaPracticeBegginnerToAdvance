public class Drinks{

    private Cola cola;
    private Sprite sprite;

    public Drinks(String type, String name, String size) {
      if(type=="TYPE-2") cola=new Cola(type,name,size);
      else sprite=new Sprite(type, name, size);

    }

    public Cola getCola() {
        return cola;
    }

    public Sprite getSprite() {
        return sprite;
    }
}

class Cola extends Item{

    private static  int PRICE=5;
    private  int BIG_PRICE=7;



    public Cola(String type, String name, String size) {
        super(type, name, PRICE, size);
    }

    public static void setPRICE(int PRICE) {
        Cola.PRICE = PRICE;
    }
}



class Sprite extends Item{

    private static  int PRICE=4;
    private  int BIG_PRICE=7;

    public Sprite(String type, String name,  String size) {
        super(type, name, PRICE, size);
    }

    public static void setPRICE(int PRICE) {
        Sprite.PRICE = PRICE;
    }
}







