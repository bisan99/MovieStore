package bisan.android.assign1.model;


import java.util.List;

public interface IMovieDa {
    List<Movie> getMovies(String data);
    List<Movie> search(String data);
    String[] getSpinner();
}
