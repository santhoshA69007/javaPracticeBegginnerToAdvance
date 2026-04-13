public class megaBytetobyte {

    public void printMegaByteAndKiloByte(int kb){

        if(kb>1000){
            System.out.println(kb/1024+"MB"+" "+kb%1024+"kb");
        }

        else{

            System.out.println(kb/1024);
        }

    }
    public static void main(String[] args) {
      megaBytetobyte mb=new megaBytetobyte();
      mb.printMegaByteAndKiloByte(5000);
    }
}
