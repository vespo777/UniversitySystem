package test;

import java.time.LocalDate;

import enums.TitleCourse;
import enums.TitleFaculty;
import enums.TitleTeacher;
import menu.MainMenu;
import university.*;

public class PutMarkDemoTest {
	public static void main(String[] args) throws Exception {
		Admin admin = Admin.getInstance();
		Course c = new Course(TitleCourse.OOP, "CSCI2106");
		Manager m = new Manager("Aqerke", "Omarova");
		Faculty f = new Faculty(TitleFaculty.SITE, m);
		Teacher t = new Teacher("Pakizar", "Shamoi", 12.5, 700000, LocalDate.of(2010, 9, 1), TitleTeacher.PROFESSOR);
		
		Student[] students = {new Student("a", "a"), new Student("Bob", "Wesly"), 
				new Student("John", "Ivanov"), new Student("Nikolai", "Petrov"), new Student("Ahmet", "Serikov"), 
				new Student("Nurzhan", "Egemenov"), new Student("Zhenis", "Omarov"), new Student("Aiym", "Seitmetova"), 
				new Student("Arman", "Yussupov"), new Student("Artur", "Askaruly"), new Student("Karina", "Kim"), 
				new Student("Turar", "Zhenisov"), new Student("Asker", "Rakhatov"), new Student("Margulan", "Kadyrbaev"), 
				new Student("Sasha", "Aleksandrova"), new Student("Evgeniya", "Polyak"), new Student("Polina", "Rybina"), 
				new Student("Daniil", "Sapkov"), new Student("Elena", "Li"), new Student("Dima", "Vovchenko"), 
				new Student("Ardak", "Mustafaeva"), new Student("Bota", "Dzhankieva"), new Student("Alibek", "Sarail"), 
				new Student("Sundet", "Tlemesov"), new Student("Tolik", "Krapcov"), new Student("Vladimir", "Berezudskii")};

		for(Student s : students) {
			admin.addUser(s);
			s.setFaculty(f);
			s.registerForCourse(c);

		}

		admin.addUser(t);
		admin.addUser(m);
		
		t.setPassword("ab");
		students[0].setPassword("a");
		
		f.courses.add(c);
		
		UniSystem.getDatabase().getFaculties().add(f);
		
		m.addCourseToSystem(c);
		
		c.addInstructor(t);
		
		MainMenu menu = MainMenu.getMainMenu();

	    menu.displayMenu();
	    menu.enterToTheSystem();
//		
//		
//		System.out.println(f.courses.size());
//		System.out.println(UniSystem.getDatabase().getStudents().size());
//		System.out.println(UniSystem.getDatabase().getTeachers().size());
//		System.out.println(UniSystem.getDatabase().getCourses().size());
		
		System.out.println(students[0].getName());
		students[0].viewTranscript();
		
//		t.putMark(c, students[0], MarkType.ATT1, 25);
//		t.putMark(c, students[0], MarkType.ATT2, 27);
//		t.putMark(c, students[0], MarkType.FINAL, 40);
		
		students[0].viewTranscript();
		
	}
}
