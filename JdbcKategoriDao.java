package oopWithKodlamaio.dataAccess;

import java.util.ArrayList;

import oopWithKodlamaioApp.entities.Kategori;

public class JdbcKategoriDao implements KategoriDao{
	
	private ArrayList<Kategori> categories=new ArrayList<>();
	
	public void add(Kategori kategori) {
		
		System.out.println("Kategori Jdbc ile veritabanına eklendi.");
		categories.add(kategori);
	}
	
	public ArrayList<Kategori> getCategories(){
		return categories;
	}

}
