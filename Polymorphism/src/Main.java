//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
//Movie theMovie=Movie.getMovie("Science","Star Wars");
//theMovie.watchMovie();
Scanner s=new Scanner(System.in);
while (true){
    System.out.println("Enter type(A for Advanture)"+"\n C for Comedy"+"\n S for ScienceFiction");
    String type=s.nextLine();
    if("Qq".contains(type)){

        break;
    }
    System.out.println("Enter movie title:");
    String title=s.nextLine();

    Movie movie= Movie.getMovie(type,title);
    movie.watchMovie();
}
}
