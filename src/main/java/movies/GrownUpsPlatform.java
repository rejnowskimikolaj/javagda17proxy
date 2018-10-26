package movies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GrownUpsPlatform {

    private GrownUpsStreamingServiceProxy streamingService;

    public GrownUpsPlatform(GrownUpsStreamingServiceProxy streamingService) {
        this.streamingService = streamingService;
    }

    public Movie getRandomMovie(){
        //
        List<Movie> movies = new ArrayList<>();
        movies.addAll(streamingService.getPegi16Movies());
        movies.addAll(streamingService.getPegi18Movies());
        return movies.get(new Random().nextInt(movies.size()));
    }
}
