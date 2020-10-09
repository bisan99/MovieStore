package bisan.android.assign1;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import bisan.android.assign1.model.IMovieDa;
import bisan.android.assign1.model.Movie;
import bisan.android.assign1.model.MovieFactory;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    EditText edtresult;
    EditText edtSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtresult = findViewById(R.id.edtresult);
        edtSearch = findViewById(R.id.edtSearch);
        spinner = findViewById(R.id.spinner);

        populateSpinner();
    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovieDa objBook = factory.getModel();
        String[] data = objBook.getSpinner();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, data);
        spinner.setAdapter(adapter);

    }


    public void btnGetMoviesOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objBook = factory.getModel();
        String item = "";
        item = spinner.getSelectedItem().toString();
        List<Movie> movies = objBook.getMovies(item);
        String str = "";
        for (Movie m : movies) {
            str += m.Print() + "\n";
        }
        edtresult.setText(str);
    }

    public void btnSearchOnClick(View view) {
        MovieFactory factory = new MovieFactory();
        IMovieDa objBook = factory.getModel();
        String item = edtSearch.getText().toString();
        if (item != null) {
            List<Movie> movies = objBook.search(item);
            String str = " ";
            for (Movie m : movies) {
                if (m.getYear() != 0) {
                    str += m.Print() + "\n";
                }
            }
            edtresult.setText(str);}
        else{
            edtSearch.setText("write here");
        }

    }
}