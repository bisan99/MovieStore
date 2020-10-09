package bisan.android.assign1.model;

public class MovieFactory {

    public IMovieDa getModel(){
        // if statement to check the internet connection
        return new MovieDa();
    }
}
