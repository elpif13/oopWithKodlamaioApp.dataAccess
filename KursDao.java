package oopWithKodlamaio.dataAccess;

import java.util.ArrayList;

import oopWithKodlamaioApp.entities.Kurs;

public interface KursDao {
	
	void add(Kurs kurs);
	
	ArrayList<Kurs> getCourses();

}
