package bisan.android.assign1.model;

import java.util.ArrayList;
import java.util.List;

class MovieDa implements IMovieDa {

    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieDa(){
        movies.add(new Movie("Home Alone",1990,"comedy"));
        movies.add(new Movie("Matilda", 1996,
                "fantasy"));
        movies.add(new Movie("Nanny McPhee", 2005,
                "fantasy"));
        movies.add(new Movie("Sing", 2016,
                "animation"));
        movies.add(new Movie("Harry Potter", 2001,
                "adventure"));
        movies.add(new Movie("101 Dalmatians", 2001,
                "comedy"));


    }


    @Override
    public List<Movie> getMovies(String data) {

        ArrayList<Movie> list = new ArrayList<>();
        for(Movie m : movies){
            if(m.getTitle().equals(data)){
                list.add(m);
            }
        }
        return list;
    }

    @Override
    public List<Movie> search(String data) {
        ArrayList<Movie> list = new ArrayList<>();
        list.clear();
        for(Movie m : movies){
        if((m.getGenre().charAt(0)==data.toLowerCase().charAt(0)) || m.getGenre().equals(data.toLowerCase()) || String.valueOf(m.getYear()).equals(data)){
            list.add(m);
        }
        else {
            list.add(new Movie("null",0,"null"));
        }
        }
        return list;
        }

    @Override
    public String[] getSpinner() {
        String[] data = new String[]{"Home Alone", "Matilda", "Nanny McPhee","Sing","Harry Potter","101 Dalmatians"};
        return data;
    }


}