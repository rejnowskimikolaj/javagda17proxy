package movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ChildrenPlatform {

    private ChildrenStreamingServiceProxy streamingService;


    public ChildrenPlatform(ChildrenStreamingServiceProxy streamingService) {
        this.streamingService = streamingService;
    }

    public Movie getRandomMovie(){

        List<Movie> movies = new ArrayList<>();
        movies.addAll(streamingService.givePegi3Movies());
        movies.addAll(streamingService.givePegi7Movies());
        return movies.get(new Random().nextInt(movies.size()));
    }
}
