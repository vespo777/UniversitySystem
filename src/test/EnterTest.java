package test;

import enums.TitleFaculty;
import menu.*;
import university.*;

public class EnterTest {

	public static void main(String[] args) throws Exception {
		UniSystem.getDatabase().read();	
		
		MainMenu menu = MainMenu.getMainMenu();
		
//		System.out.println(UniSystem.getDatabase().getManagers().get(0));
//		UniSystem.getDatabase().getManagers().get(0).changePassword("abc");
		
		Faculty f = new Faculty(TitleFaculty.KMA);
		f.setManager(UniSystem.getDatabase().getManagers().get(0));
		UniSystem.getDatabase().getFaculties().add(f);
		
//		UniSystem.getDatabase().getFaculties().add(new Faculty(TitleFaculty.BS, UniSystem.getDatabase().getManagers().get(0)));
		
		for(User u : UniSystem.getDatabase().getUsers()) {
			u.changePassword("abc");
		}

		menu.displayMenu();
		menu.enterToTheSystem();
		
		
	}

}
