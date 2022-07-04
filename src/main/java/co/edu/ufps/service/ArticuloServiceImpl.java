package co.edu.ufps.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import co.edu.ufps.commands.GenericServiceImpl;
import co.edu.ufps.model.Articulo;
import co.edu.ufps.repository.ArticuloRepository;
import co.edu.ufps.services.ArticuloService;

@Service
public class ArticuloServiceImpl extends GenericServiceImpl<Articulo, Integer> implements ArticuloService{

    @Autowired
	private ArticuloRepository articuloRepository;

    @Override
    public CrudRepository<Articulo, Integer> getDao() {
        return articuloRepository;
    }
    
}
