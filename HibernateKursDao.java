package oopWithKodlamaio.dataAccess;

import java.util.ArrayList;

import oopWithKodlamaioApp.entities.Kurs;

public class HibernateKursDao implements KursDao {
	
	private ArrayList<Kurs> courses=new ArrayList<>();
	
	public void add(Kurs kurs) {
		
		System.out.println("Kurs Hibernate ile veritabanına eklendi.");
		courses.add(kurs);
	}
	
	public ArrayList<Kurs> getCourses(){
		return courses;
	}

}
