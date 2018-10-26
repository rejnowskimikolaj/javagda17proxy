package movies;

import java.util.List;

public interface ChildrenStreamingServiceProxy {
     List<Movie> givePegi3Movies();
     List<Movie> givePegi7Movies();

}
