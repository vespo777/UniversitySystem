package test;

//import java.text.Format;
import java.time.LocalTime;

import enums.Day;
import enums.FormatLesson;
import enums.TitleCourse;
import enums.TitleFaculty;
import enums.TypeLesson;
import menu.MainMenu;
import university.*;

//import menu.*;

public class ScheduleTest {



	public static void main(String[] args) throws Exception {
//		UniSystem uniSys = UniSystem.getDatabase();

		Student s1 = new Student("Ernat", "Manapaly");
		Student s2 = new Student("Zhanserik", "Kalmukhambet");
		Student s3 = new Student("Alina", "Abdullina");
		Room r1 = new Room(461, 110);
		UniSystem.getDatabase().getRooms().add(r1);
		
		
		Manager m1 = new Manager("Aqerke", "Omarova");
		Admin a = Admin.getInstance();
		a.addUser(s1);
		a.addUser(s2);
		a.addUser(s3);
		a.addUser(m1);
		s1.changePassword("ab");
		
//		admin.addUser(s);
//	    s.setFaculty(f);
	    
		
		Faculty f1 = new Faculty(TitleFaculty.SITE, m1);
		s1.setFaculty(f1);
		UniSystem.getDatabase().getFaculties().add(f1);
//		f1.setManager(m1);
		
		Course c1 = new Course(TitleCourse.OOP, "2165354");
		Course c2 = new Course(TitleCourse.ADS, "2165353");
		Course c3 = new Course(TitleCourse.DB, "2165351");
		Course c4 = new Course(TitleCourse.PP, "2165352");
		Course c5 = new Course(TitleCourse.DB, "2165352");
		Course c6 = new Course(TitleCourse.ENG, "2165352");
		Course c7 = new Course(TitleCourse.ICT, "2165352");
		Course c8 = new Course(TitleCourse.RUS, "2165352");
		Course c9 = new Course(TitleCourse.WEB, "2165352");
		f1.courses.add(c1);
		f1.courses.add(c2);
		f1.courses.add(c3);
		f1.courses.add(c4);
		f1.courses.add(c5);
		f1.courses.add(c6);
		f1.courses.add(c7);
		f1.courses.add(c8);
		f1.courses.add(c9);
		
		s1.registerForCourse(c1);
		s1.registerForCourse(c2);
		s1.registerForCourse(c3);
		s1.registerForCourse(c4);
		s1.registerForCourse(c5);
		s1.registerForCourse(c6);
		s1.registerForCourse(c7);
		s1.registerForCourse(c8);
		s1.registerForCourse(c9);
		
		
//		Room r2 = new Room(261, 35);
//		Room r3 = new Room(428, 90);
//		Room r4 = new Room(446, 120);
//		Room r5 = new Room(444, 100);
 
		Lesson oopLecture = new Lesson(Day.TUESDAY, FormatLesson.OFFLINE , TypeLesson.LECTURE , LocalTime.of(12, 15, 0) , r1);
		Lesson adsLecture = new Lesson(Day.MONDAY, FormatLesson.OFFLINE , TypeLesson.LECTURE , LocalTime.of(15, 0, 0) , r1);
		Lesson dbLecture = new Lesson(Day.SATURDAY, FormatLesson.OFFLINE , TypeLesson.LECTURE , LocalTime.of(10, 22, 0) , r1);
		Lesson ppLecture = new Lesson(Day.SUNDAY, FormatLesson.OFFLINE , TypeLesson.PRACTICE , LocalTime.of(18, 36, 0) , r1);
		Lesson ictLecture = new Lesson(Day.TUESDAY, FormatLesson.OFFLINE , TypeLesson.LECTURE , LocalTime.of(17, 15, 0) , r1);
		Lesson webLecture = new Lesson(Day.MONDAY, FormatLesson.OFFLINE , TypeLesson.PRACTICE , LocalTime.of(9, 0, 0) , r1);
		Lesson rusLecture = new Lesson(Day.WEDNESDAY, FormatLesson.OFFLINE , TypeLesson.LABORATORY , LocalTime.of(11, 22, 0) , r1);
		Lesson peLecture = new Lesson(Day.FRIDAY, FormatLesson.OFFLINE , TypeLesson.LECTURE , LocalTime.of(18, 36, 0) , r1);
		Lesson engLecture = new Lesson(Day.THURSDAY, FormatLesson.OFFLINE , TypeLesson.LECTURE , LocalTime.of(16, 36, 0) , r1);
		c1.getLessons().add(oopLecture);
		c2.getLessons().add(adsLecture);
		c3.getLessons().add(dbLecture);
		c4.getLessons().add(ictLecture);
		c5.getLessons().add(ppLecture);
		c6.getLessons().add(peLecture);
		c7.getLessons().add(rusLecture);
		c8.getLessons().add(engLecture);
		c9.getLessons().add(webLecture);
		
		
		s1.addLesson(oopLecture);
		s1.addLesson(adsLecture);
		s1.addLesson(dbLecture);
		s1.addLesson(ictLecture);
		s1.addLesson(rusLecture);
		s1.addLesson(webLecture);
		s1.addLesson(engLecture);
		s1.addLesson(ppLecture);
		s1.addLesson(peLecture);
		
		
		UniSystem.getDatabase().getCourses().add(c1);
		UniSystem.getDatabase().getCourses().add(c2);
		UniSystem.getDatabase().getCourses().add(c3);
		UniSystem.getDatabase().getCourses().add(c4);
		UniSystem.getDatabase().getCourses().add(c5);
		UniSystem.getDatabase().getCourses().add(c6);
		UniSystem.getDatabase().getCourses().add(c7);
		UniSystem.getDatabase().getCourses().add(c8);
		UniSystem.getDatabase().getCourses().add(c9);
		
//		StudentLessonsSchedule st1 = new StudentLessonsSchedule(s1);
//		
//		st1.fillSchedule();
//		st1.getSchedule();

		MainMenu mm = MainMenu.getMainMenu();
		mm.enterToTheSystem();
		
		
		

		


//		public class AttendanceDemoTest {
//		  public static void main(String[] args) throws Exception {
//			    UniSystem uniSys = UniSystem.getDatabase();

//			    MainMenu menu = MainMenu.getMainMenu();
		//
//			    menu.displayMenu();
//			    menu.enterToTheSystem();
//	    Admin admin = Admin.getInstance();
//	    Course c = new Course(TitleCourse.OOP, "CSCI2106");
//	    Manager m = new Manager("Aqerke", "Omarova");
//	    Faculty f = new Faculty(TitleFaculty.SITE, m);
//	    Teacher t = new Teacher("Pakizar", "Shamoi", 12.5, 700000, LocalDate.of(2010, 9, 1), TitleTeacher.PROFESSOR);
//	    f.setManager(m);
//	    
//	    Student[] students = {new Student("Ernat", "Manapaly"), new Student("Bob", "Wesly"), 
//	        new Student("John", "Ivanov"), new Student("Nikolai", "Petrov"), new Student("Ahmet", "Serikov"), 
//	        new Student("Nurzhan", "Egemenov"), new Student("Zhenis", "Omarov"), new Student("Aiym", "Seitmetova"), 
//	        new Student("Arman", "Yussupov"), new Student("Artur", "Askaruly"), new Student("Karina", "Kim"), 
//	        new Student("Turar", "Zhenisov"), new Student("Asker", "Rakhatov"), new Student("Margulan", "Kadyrbaev"), 
//	        new Student("Sasha", "Aleksandrova"), new Student("Evgeniya", "Polyak"), new Student("Polina", "Rybina"), 
//	        new Student("Daniil", "Sapkov"), new Student("Elena", "Li"), new Student("Dima", "Vovchenko"), 
//	        new Student("Ardak", "Mustafaeva"), new Student("Bota", "Dzhankieva"), new Student("Alibek", "Sarail"), 
//	        new Student("Sundet", "Tlemesov"), new Student("Tolik", "Krapcov"), new Student("Vladimir", "Berezudskii")};
//	    
//	    for(Student s : students) {
//	      admin.addUser(s);
//	      s.setFaculty(f);
//	      s.registerForCourse(c);
//
//	    }
//	    admin.addUser(t);
//	    admin.addUser(m);
//	    t.setPassword("ab");
//	    m.setPassword("ab");
//	    
//	    UniSystem.getDatabase().getFaculties().add(f);
//	    Room oopLecture = new Room(446, 112);
//	    Room oopPractice = new Room(269, 28);
//	    Lesson[] oopLessons = {new Lesson(Day.MONDAY, FormatLesson.OFFLINE, TypeLesson.LECTURE, LocalTime.of(11, 0), oopLecture, t),
//	        new Lesson(Day.MONDAY, FormatLesson.OFFLINE, TypeLesson.LECTURE, LocalTime.of(13, 0), oopLecture, t),
//	        new Lesson(Day.TUESDAY, FormatLesson.OFFLINE, TypeLesson.LECTURE, LocalTime.of(11, 0), oopLecture, t),
//	        new Lesson(Day.TUESDAY, FormatLesson.OFFLINE, TypeLesson.LECTURE, LocalTime.of(13, 0), oopLecture, t),
//	        new Lesson(Day.MONDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(15, 0), oopPractice, t),
//	        new Lesson(Day.MONDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(16, 0), oopPractice, t),
//	        new Lesson(Day.MONDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(17, 0), oopPractice, t),
//	        new Lesson(Day.TUESDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(15, 0), oopPractice, t),
//	        new Lesson(Day.TUESDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(16, 0), oopPractice, t),
//	        new Lesson(Day.TUESDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(17, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(10, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(11, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(12, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(13, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(14, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(15, 0), oopPractice, t),
//	        new Lesson(Day.FRIDAY, FormatLesson.OFFLINE, TypeLesson.PRACTICE, LocalTime.of(16, 0), oopPractice, t),};
//	    for(Lesson l : oopLessons) {
//	      c.getLessons().add(l);
//	    }
//	    f.addCourse(c);

			

//	    UniSystem.getDatabase().getCourses().add(c);
//			    System.out.println(UniSystem.getDatabase().getCourses().size());
//	    students[0].addLesson(oopLessons[0]);
//	    t.startAttendance(oopLessons[0], 15);
//	    UniSystem.getDatabase().getRooms().add(oopPractice);
//	    UniSystem.getDatabase().getRooms().add(oopLecture);
//	    students[0].setPassword("ab");
//	    MainMenu menu = MainMenu.getMainMenu();

//	    menu.displayMenu();
//	    menu.enterToTheSystem();
	  

	  
	

		
		
		
		
		
		
		
		
		
		
//		f1.setManager(m1);
		

		
//		System.out.println(s1.getCourses().size());
		
//		MainMenu menu = new MainMenu();
////
//		menu.displayMenu();
//		menu.enterToTheSystem();
		
	}

}
