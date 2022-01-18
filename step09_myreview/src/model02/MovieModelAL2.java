package model02;

import java.util.ArrayList;
import java.util.HashMap;

import model.dto02.Movie;

public class MovieModelAL2 {
	
	static ArrayList <Movie> mvAL = new ArrayList <>();		
	static{
		mvAL.add(new Movie("숏버스", "드라마", "한국", 9.00, 104));
		mvAL.add(new Movie("너에게 가는길", "다큐멘터리", "한국", 9.42, 93));
		mvAL.add(new Movie("해피아워", "드라마", "일본", 9.06, 328));
		mvAL.add(new Movie("소드 아트", "애니메이션", "일본", 8.36, 97));
		mvAL.add(new Movie("비올레타", "드라마", "프랑스", 7.38, 107));
	}
	
	static ArrayList <Movie> mvALKR = new ArrayList <>();
	static ArrayList <Movie> mvALJP = new ArrayList <>();
	static ArrayList <Movie> mvALFR = new ArrayList <>();
	//static ArrayList <Movie> mvNew = new ArrayList <>();

	
	static HashMap<String, ArrayList <Movie>> mvMap = new HashMap<String, ArrayList <Movie>>();
	static{
		for(int i=0; i < mvAL.size(); i++) {
			if(mvAL.get(i).getMvContry().equals("한국")) {
				mvALKR.add(mvAL.get(i));
				mvMap.put("한국", mvALKR);
			}else if(mvAL.get(i).getMvContry().equals("일본")) {
				mvALJP.add(mvAL.get(i));
				mvMap.put("일본", mvALJP);
			}else if(mvAL.get(i).getMvContry().equals("프랑스")) {
				mvALFR.add(mvAL.get(i));
				mvMap.put("프랑스", mvALFR);
			}
		}
	}
	
	
	//전체 검색
	public static HashMap<String, ArrayList <Movie>> movieAll(){
		return mvMap;
	}
	
	
	//HashMap의 키워드 별로 검색
	public static ArrayList<Movie> movieKey(String key) {
		return mvMap.get(key);
	}
	
	
	
	//CRUD Method 구현	
	//Create	

	public static HashMap<String, ArrayList <Movie>> 
			create(String mvName, String mvGenre, String mvCountry, double mvRate, int mvDuration) {
		
		ArrayList <Movie> mvNew = new ArrayList <>();
		mvNew.add(new Movie(mvName, mvGenre, mvCountry, mvRate, mvDuration));
		
		for(int i=0; i < mvNew.size(); i++) {
			if(mvNew.get(i).getMvContry().equals("한국")) {
				mvALKR.add(mvNew.get(i));
				mvMap.put("한국", mvALKR);
			}else if(mvNew.get(i).getMvContry().equals("일본")) {
				mvALJP.add(mvNew.get(i));
				mvMap.put("일본", mvALJP);
			}else if(mvNew.get(i).getMvContry().equals("프랑스")) {
				mvALFR.add(mvNew.get(i));
				mvMap.put("프랑스", mvALFR);
			}
		}return mvMap;

	}

	
	
	//Read
	public static Movie read(String key, String mvName){
		for(int i = 0; i < mvMap.size(); i++) {
			if(mvMap.get(key).get(i).getMvName().equals(mvName)) {
				return mvMap.get(key).get(i);
			}
		}return null;
	}
	
	
	
	//Update
	public static Movie update(String key, String mvName) {
		for(int i = 0; i < mvMap.size(); i++) {
			if(mvMap.get(key).get(i).getMvName().equals(mvName)) {
				mvMap.get(key).get(i).setMvRate(0.00);
				return mvMap.get(key).get(i);
			}
		}return null;
	}
	
	
	
	//Delete
	public static ArrayList<Movie> delete(String key, String mvName){
		for(int i = 0; i < mvMap.size(); i++) {
			if(mvMap.get(key).get(i).getMvName().equals(mvName)) {
				mvMap.get(key).remove(i);
				return mvMap.get(key);
			}
		}return null;
		
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(movieAll());
		System.out.println(movieKey("한국"));
		
        //create(
		create("티탄", "드라마", "프랑스", 7.18, 108);
		System.out.println(movieAll());
		System.out.println(movieKey("프랑스"));
		
		//read()
		System.out.println(read("한국", "숏버스"));
		System.out.println(movieAll());
		System.out.println(movieKey("한국"));
		
		//update()
		update("한국", "숏버스");
		System.out.println(read("한국", "숏버스"));
		
		//delete()
		delete("한국", "숏버스");
		System.out.println(movieKey("한국"));
		System.out.println(movieAll());
	}

	
}

