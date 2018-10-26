package movies;

import java.util.List;

public class GrownUpsStreamingServiceProxy {

    private StreamingService streamingService;

    public GrownUpsStreamingServiceProxy(StreamingService streamingService) {
        this.streamingService = streamingService;
    }

    public List<Movie> getPegi18Movies(){
        return streamingService.givePegi18Movies();
    }

    public List<Movie> getPegi16Movies(){
        return streamingService.givePegi16Movies();
    }
}
