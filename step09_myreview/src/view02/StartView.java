package view02;

import org.junit.Test;
import controller.MovieController;


public class StartView {
	
	public void createMovie() {
		create("Ƽź", "���", "������", 7.18, 108);
		System.out.println(movieAll());
		System.out.println(movieKey("������"));
	}
	
	public void 
	System.out.println(movieAll());
	System.out.println(movieKey("�ѱ�"));
	
    //create(
	
	
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
