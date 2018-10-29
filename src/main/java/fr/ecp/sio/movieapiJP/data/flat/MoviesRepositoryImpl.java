package fr.ecp.sio.movieapiJP.data.flat;

import fr.ecp.sio.movieapiJP.data.MoviesRepository;
import fr.ecp.sio.movieapiJP.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesRepositoryImpl implements MoviesRepository {

    private static MoviesRepositoryImpl instance;

    public static MoviesRepositoryImpl getInstance() {
        if (instance == null) instance = new MoviesRepositoryImpl();
        return instance;
    }


    private MoviesRepositoryImpl() {
    }
    @Override
    public List<Movie> getMovie() {

        ArrayList<Movie> movies = new ArrayList<>();
        Movie m1 = new Movie();
        m1.setTitle("JIANGPENG");
        movies.add(m1);
        return movies;
    }
}
