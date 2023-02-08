package test;

import menu.AdminMenu;

public class LogTest {

	public static void main(String[] args) throws Exception {

		AdminMenu a = AdminMenu.getInstance();
		a.command();
		
		System.out.println();
	}
}