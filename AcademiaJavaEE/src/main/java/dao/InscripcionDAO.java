package dao;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.Curso;
import entidades.Inscripcion;

public class InscripcionDAO {

	@PersistenceContext
	EntityManager manager;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearInscripcion(Inscripcion inscripcion){
	     manager.persist(inscripcion);
	}
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarInscripcion(Inscripcion inscripcion){
	manager.remove(inscripcion);
	}
	
	public Curso buscarInscripcion (int idinscripcion){
	     return manager.find(Curso.class, idinscripcion);
	}

	public void actualizarInscripcion(Inscripcion inscripcion){

		Inscripcion inscripcionEnBD = manager.find(Inscripcion.class, inscripcion.getIdinscripcion());
		inscripcionEnBD.setNombre(inscripcion.getNombre());
		inscripcionEnBD.setApellido(inscripcion.getApellido());
		inscripcionEnBD.setTelefono(inscripcion.getTelefono());
		inscripcionEnBD.setCurso(inscripcion.getCurso());
		inscripcion.setFormapago(inscripcion.getFormapago());
	}

}
