package Movie;

public class MovieTestDrive {
    public static void main (String[] args){
        Movie one = new Movie();
        one.title = "Как прогореть на Акциях";
        one.genre = "Трагедия";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Как прогореть на Акциях2";
        two.genre = "Трагедия2";
        two.rating = -5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Как прогореть на Акция3х";
        three.genre = "Трагедия3";
        three.rating = 123;

    }
}
