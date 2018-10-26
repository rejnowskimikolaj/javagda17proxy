package movies;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Barbie w krainie goblinow",PegiRating.PEGI_7);
        Movie movie2 = new Movie("Barbie w krainie goblinow2",PegiRating.PEGI_7);
        Movie movie3 = new Movie("Barbie w krainie komunistow",PegiRating.PEGI_16);
        Movie movie4 = new Movie("Barbie w krainie komunistow2",PegiRating.PEGI_16);
        Movie movie5 = new Movie("Barbie w teksasie",PegiRating.PEGI_18);
        Movie movie6 = new Movie("Barbie w teksasie2",PegiRating.PEGI_18);
        Movie movie7 = new Movie("Barbie w krainie chmurek",PegiRating.PEGI_3);
        Movie movie8 = new Movie("Barbie w krainie chmurek2",PegiRating.PEGI_3);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(movie1);
        movieList.add(movie2);
        movieList.add(movie3);
        movieList.add(movie4);
        movieList.add(movie5);
        movieList.add(movie6);
        movieList.add(movie7);
        movieList.add(movie8);

        ChildrenPlatform childrenPlatform =new ChildrenPlatform(new StreamingService(movieList));
        GrownUpsPlatform grownUpsPlatform =new GrownUpsPlatform
                (new GrownUpsStreamingServiceProxy(
                        new StreamingService(movieList)));

        System.out.println(grownUpsPlatform.getRandomMovie());
    }
}
