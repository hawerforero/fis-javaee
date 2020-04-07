package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import entidades.Curso;

import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

public class CursoDAO {

	
	@PersistenceContext
	EntityManager manager;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearCurso(Curso curso){
	     manager.persist(curso);
	}
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarCurso(Curso curso){
	manager.remove(curso);
	}
	
	public Curso buscarCurso (int idcurso){
	     return manager.find(Curso.class, idcurso);
	}

	public void actualizarCurso(Curso curso){

		Curso cursoEnBD = manager.find(Curso.class, curso.getIdcurso());
		cursoEnBD.setDescripcion(curso.getDescripcion());
		cursoEnBD.setPrecio(curso.getPrecio());
	}
	
	public List<Curso> buscarCursos(){
		TypedQuery<Curso> consulta;
		consulta= manager.createNamedQuery("Curso.findAll", 	Curso.class);
		return consulta.getResultList();

	}
	

}
