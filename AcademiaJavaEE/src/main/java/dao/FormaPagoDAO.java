package dao;

import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entidades.Formapago;



public class FormaPagoDAO {

	@PersistenceContext
	EntityManager manager;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearformaPago(Formapago formaPago){
	     manager.persist(formaPago);
	}
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void eliminarformaPago(Formapago formaPago){
	manager.remove(formaPago);
	}
	
	public Formapago buscarformaPago (int idformaPago){
	     return manager.find(Formapago.class, idformaPago);
	}

	public void actualizarformaPago(Formapago formaPago){

		Formapago formaPagoEnBD = manager.find(Formapago.class, formaPago.getIdformapago());
		formaPagoEnBD.setDescripcion(formaPago.getDescripcion());
		formaPagoEnBD.setRecargo(formaPago.getRecargo());
	}

}
