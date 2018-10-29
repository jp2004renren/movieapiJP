package fr.ecp.sio.movieapiJP.data;

import fr.ecp.sio.movieapiJP.data.flat.MoviesRepositoryImpl;
import fr.ecp.sio.movieapiJP.model.Movie;

import java.util.List;

public interface MoviesRepository {

    static MoviesRepository getInstance() {
        return MoviesRepositoryImpl.getInstance();
    }


    List<Movie> getMovie();
}
