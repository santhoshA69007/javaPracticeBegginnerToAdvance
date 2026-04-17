public class Printer {
    private int tonerLevel,pagesPrinted;
    boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel<=100&& tonerLevel>=0?tonerLevel:0;

        this.duplex = duplex;
    }

    public void addTonerLevel(int toner){

        if(toner>=100 &&toner<=0){
            System.out.println("tonner should not be below 0 or greater than 100");
            return;
        }
            tonerLevel=toner;
    }

    public  void printPages(int pages){
        System.out.println("no of pages inserted:"+pages);
        if(pages/10>=tonerLevel || (duplex&& pages/20>=tonerLevel)){
            System.out.println("printer dont have sufficient ink! tonner! add some tonner to it!");
            return;
        }

        if(duplex && tonerLevel>0 ){
            pagesPrinted+=pages/2 + (pages%2);
            System.out.println("pages to be printed is "+pagesPrinted+" it prints dual side of the each page!");
            System.out.println("pages printing.... pages finsihed printed:"+pagesPrinted+" pages");
            tonerLevel-=pages/20;
            System.out.println("remaing toner in printer is:"+tonerLevel);
            System.out.println("the remaining pages:"+pagesPrinted);

        }

        else{
            pagesPrinted+=pages;
            System.out.println("page to be printed is "+pages+" it prints only one side of the each page");
            tonerLevel-=pages/10;
            System.out.println("pages printing.... pages finsihed printed:"+pagesPrinted+" pages");
            System.out.println("remaing toner in printer is:"+tonerLevel);
            System.out.println("remaining pages is None!");
        }


    }



}
