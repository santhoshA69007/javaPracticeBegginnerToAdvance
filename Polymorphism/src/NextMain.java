public class NextMain {

    static void main() {
//        Adventure movie=(Adventure) Movie.getMovie("A","Tarzan");
//        movie.watchMovie();

//        Object movie= Movie.getMovie("A","Tarzan");
//        Movie movie1=Movie.getMovie("A","Tarzan");
//        movie1.watchMovie();
//        Adventure adm=(Adventure)movie1;
//        adm.adventureWorking();
//
//        var mov=Movie.getMovie("C","Airplane");
//        mov.watchMovie();
//
//        var comedy=new Comedy("Airplane");
//        comedy.watchMovie();
//        movie.watchMovie();

Object unkKnownObject= Movie.getMovie("S","Airplane");
        System.out.println(unkKnownObject);
        if(unkKnownObject instanceof Comedy){

        Comedy comdey=(Comedy) unkKnownObject;
        comdey.watchMovie();

        } else if (unkKnownObject instanceof Adventure) {
            ((Adventure) unkKnownObject).adventureWatchMovie();

        } else if (unkKnownObject instanceof  ScienceFiction syfy) {
            syfy.watchMovie();

        }


    }


}
