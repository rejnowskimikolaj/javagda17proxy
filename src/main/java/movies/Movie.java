package movies;

public class Movie {
    private String title;
    private PegiRating pegiRating;

    public Movie(String title,PegiRating pegiRating) {
        this.title = title;
        this.pegiRating = pegiRating;
    }

    public void play(){
        System.out.println(title+" has started");
    }

    public String getTitle() {
        return title;
    }

    public PegiRating getPegiRating() {
        return pegiRating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", pegiRating=" + pegiRating +
                '}';
    }
}
