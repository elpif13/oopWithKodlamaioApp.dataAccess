package oopWithKodlamaio.dataAccess;

import java.util.ArrayList;

import oopWithKodlamaioApp.entities.Kategori;

public interface KategoriDao {
	
	void add(Kategori kategori);
	
	ArrayList<Kategori> getCategories();

}
