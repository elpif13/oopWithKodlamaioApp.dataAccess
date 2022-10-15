package oopWithKodlamaio.dataAccess;

import oopWithKodlamaioApp.entities.Eğitmen;

public class JdbcEğitmenDao implements EğitmenDao{
	
	public void add(Eğitmen eğitmen) {
		
		System.out.println("Eğitmen Jdbc ile veritabanına eklendi.");
	}
	
	

}
