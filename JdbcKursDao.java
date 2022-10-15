package oopWithKodlamaio.dataAccess;

import java.util.ArrayList;

import oopWithKodlamaioApp.entities.Kurs;

public class JdbcKursDao implements KursDao {
	
	private ArrayList<Kurs> courses=new ArrayList<>();
	
	
	public void add(Kurs kurs) {
		
		System.out.println("Kurs Jdbc ile veritabanına eklendi.");
		courses.add(kurs);
	}
	
	public ArrayList<Kurs> getCourses(){
		return courses;
	}

}
