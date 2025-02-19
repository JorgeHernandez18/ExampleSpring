package co.edu.ufps.commands;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T, ID extends Serializable> {

	T save(T entity);
	
	void delete(ID id);
	
	T get (ID id);
	
	List<T> getAll();
	
	T select(String email, String clave);
}


