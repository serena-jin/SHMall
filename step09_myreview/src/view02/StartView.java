package view02;

import org.junit.Test;
import controller.MovieController;


public class StartView {
	
	public void createMovie() {
		create("Æ¼Åº", "µå¶ó¸¶", "ÇÁ¶û½º", 7.18, 108);
		System.out.println(movieAll());
		System.out.println(movieKey("ÇÁ¶û½º"));
	}
	
	public void 
	System.out.println(movieAll());
	System.out.println(movieKey("ÇÑ±¹"));
	
    //create(
	
	
	//read()
	System.out.println(read("ÇÑ±¹", "¼ô¹ö½º"));
	System.out.println(movieAll());
	System.out.println(movieKey("ÇÑ±¹"));
	
	//update()
	update("ÇÑ±¹", "¼ô¹ö½º");
	System.out.println(read("ÇÑ±¹", "¼ô¹ö½º"));
	
	//delete()
	delete("ÇÑ±¹", "¼ô¹ö½º");
	System.out.println(movieKey("ÇÑ±¹"));
	System.out.println(movieAll());

}
