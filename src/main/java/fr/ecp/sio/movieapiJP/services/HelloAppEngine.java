package fr.ecp.sio.movieapiJP.services;

import com.google.appengine.api.utils.SystemProperty;
import fr.ecp.sio.movieapiJP.data.MoviesRepository;
import fr.ecp.sio.movieapiJP.data.flat.MoviesRepositoryImpl;
import fr.ecp.sio.movieapiJP.model.Movie;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloAppEngine", value = "/hello")
public class HelloAppEngine extends HttpServlet {



  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws IOException {

    Properties properties = System.getProperties();

    response.setContentType("text/plain");

    //response.getWriter().println("Hello World");

    List<Movie> movies = MoviesRepository.getInstance().getMovie();
    response.getWriter().println(movies.toString());

    /*response.getWriter().println("Hello App Engine - Standard using "
        + SystemProperty.version.get() + " Java " + properties.get("java.specification.version"));*/
  }



  public static String getInfo() {
    return "Version: " + System.getProperty("java.version")
          + " OS: " + System.getProperty("os.name")
          + " User: " + System.getProperty("user.name");
  }

}
