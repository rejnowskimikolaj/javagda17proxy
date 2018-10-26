package movies;

import java.util.List;
import java.util.stream.Collectors;

public class StreamingService implements ChildrenStreamingServiceProxy{

    private List<Movie> movies;

    public StreamingService(List<Movie> movies) {
        this.movies = movies;
    }

    public List<Movie> givePegi3Movies(){
        return movies.stream()
                .filter(x->x.getPegiRating().equals(PegiRating.PEGI_3))
                .collect(Collectors.toList());
    }

    public List<Movie> givePegi7Movies(){
        return movies.stream()
                .filter(x->x.getPegiRating().equals(PegiRating.PEGI_7))
                .collect(Collectors.toList());
    }

    public List<Movie> givePegi12Movies(){
        return movies.stream()
                .filter(x->x.getPegiRating().equals(PegiRating.PEGI_12))
                .collect(Collectors.toList());
    }

    public List<Movie> givePegi16Movies(){
        return movies.stream()
                .filter(x->x.getPegiRating().equals(PegiRating.PEGI_16))
                .collect(Collectors.toList());
    }

    public List<Movie> givePegi18Movies(){
        return movies.stream()
                .filter(x->x.getPegiRating().equals(PegiRating.PEGI_18))
                .collect(Collectors.toList());
    }

}
