package controller02;

import java.util.ArrayList;
import java.util.HashMap;

import model.MovieModel;
import model02.MovieModelAL2;
import model.dto02.Movie;
import view.FailView;
import view.SuccessView;

public class MovieController {
	
	public static void movieCreate(String mvName, String mvGenre, String mvCountry, double mvRate, int mvDuration) {
		try {
			HashMap<String, ArrayList <Movie>> hmMovies = MovieModelAL2.create(mvName, mvGenre, mvCountry, mvRate, mvDuration);
			SuccessView.printMovie(movie);
		} catch (Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}
	}
	
	
	public static void movieRead(String key) {
		try {
			Movie movie = MovieModel.read(key);
			SuccessView.printMovie(movie);
		}catch(Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}
	}
	
	
	public static void movieUpdate(String key) {
		try {
			Movie movie = MovieModel.update(key);
			SuccessView.printMovie(movie);
		}catch(Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}				
    }
	
	
	public static void movieDelete(String key) {
		try {
			HashMap<String, Movie> movie = MovieModel.delete(key);
			System.out.println(movie);
		}catch(Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}				
    }
	
	
}
