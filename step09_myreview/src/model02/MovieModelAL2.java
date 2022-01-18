package model02;

import java.util.ArrayList;
import java.util.HashMap;

import model.dto02.Movie;

public class MovieModelAL2 {
	
	static ArrayList <Movie> mvAL = new ArrayList <>();		
	static{
		mvAL.add(new Movie("������", "���", "�ѱ�", 9.00, 104));
		mvAL.add(new Movie("�ʿ��� ���±�", "��ť���͸�", "�ѱ�", 9.42, 93));
		mvAL.add(new Movie("���Ǿƿ�", "���", "�Ϻ�", 9.06, 328));
		mvAL.add(new Movie("�ҵ� ��Ʈ", "�ִϸ��̼�", "�Ϻ�", 8.36, 97));
		mvAL.add(new Movie("��÷�Ÿ", "���", "������", 7.38, 107));
	}
	
	static ArrayList <Movie> mvALKR = new ArrayList <>();
	static ArrayList <Movie> mvALJP = new ArrayList <>();
	static ArrayList <Movie> mvALFR = new ArrayList <>();
	//static ArrayList <Movie> mvNew = new ArrayList <>();

	
	static HashMap<String, ArrayList <Movie>> mvMap = new HashMap<String, ArrayList <Movie>>();
	static{
		for(int i=0; i < mvAL.size(); i++) {
			if(mvAL.get(i).getMvContry().equals("�ѱ�")) {
				mvALKR.add(mvAL.get(i));
				mvMap.put("�ѱ�", mvALKR);
			}else if(mvAL.get(i).getMvContry().equals("�Ϻ�")) {
				mvALJP.add(mvAL.get(i));
				mvMap.put("�Ϻ�", mvALJP);
			}else if(mvAL.get(i).getMvContry().equals("������")) {
				mvALFR.add(mvAL.get(i));
				mvMap.put("������", mvALFR);
			}
		}
	}
	
	
	//��ü �˻�
	public static HashMap<String, ArrayList <Movie>> movieAll(){
		return mvMap;
	}
	
	
	//HashMap�� Ű���� ���� �˻�
	public static ArrayList<Movie> movieKey(String key) {
		return mvMap.get(key);
	}
	
	
	
	//CRUD Method ����	
	//Create	

	public static HashMap<String, ArrayList <Movie>> 
			create(String mvName, String mvGenre, String mvCountry, double mvRate, int mvDuration) {
		
		ArrayList <Movie> mvNew = new ArrayList <>();
		mvNew.add(new Movie(mvName, mvGenre, mvCountry, mvRate, mvDuration));
		
		for(int i=0; i < mvNew.size(); i++) {
			if(mvNew.get(i).getMvContry().equals("�ѱ�")) {
				mvALKR.add(mvNew.get(i));
				mvMap.put("�ѱ�", mvALKR);
			}else if(mvNew.get(i).getMvContry().equals("�Ϻ�")) {
				mvALJP.add(mvNew.get(i));
				mvMap.put("�Ϻ�", mvALJP);
			}else if(mvNew.get(i).getMvContry().equals("������")) {
				mvALFR.add(mvNew.get(i));
				mvMap.put("������", mvALFR);
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
		System.out.println(movieKey("�ѱ�"));
		
        //create(
		create("Ƽź", "���", "������", 7.18, 108);
		System.out.println(movieAll());
		System.out.println(movieKey("������"));
		
		//read()
		System.out.println(read("�ѱ�", "������"));
		System.out.println(movieAll());
		System.out.println(movieKey("�ѱ�"));
		
		//update()
		update("�ѱ�", "������");
		System.out.println(read("�ѱ�", "������"));
		
		//delete()
		delete("�ѱ�", "������");
		System.out.println(movieKey("�ѱ�"));
		System.out.println(movieAll());
	}

	
}

