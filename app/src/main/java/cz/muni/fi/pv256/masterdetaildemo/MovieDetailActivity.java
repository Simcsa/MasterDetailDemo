package cz.muni.fi.pv256.masterdetaildemo;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by expres on 2/3/2016.
 */

public class MovieDetailActivity extends AppCompatActivity {

    public static final String EXTRA_MOVIE = "extra_movie";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        if(savedInstanceState == null){
            Movie movie = getIntent().getParcelableExtra(EXTRA_MOVIE);
            FragmentManager fm = getSupportFragmentManager();
            DetailFragment fragment = (DetailFragment) fm.findFragmentById(R.id.movie_detail_container);

            if (fragment == null) {
                fragment = DetailFragment.newInstance(movie);
                fm.beginTransaction()
                        .add(R.id.movie_detail_container, fragment)
                        .commit();
            }
        }
    }

}

