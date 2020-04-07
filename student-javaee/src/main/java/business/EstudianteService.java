package business;

import javax.ejb.Stateless;
import javax.inject.Inject;

import data.EstudianteDAO;
import data.Estudiante;

@Stateless
public class EstudianteService implements IEstudianteService {

	@Inject
	private EstudianteDAO estudianteDAO;
	
	@Override
	public Long registrarEstudiante(Estudiante estudiante) {
		// TODO Auto-generated method stub
		estudianteDAO.save(estudiante);
		return estudiante.getId();
	}

}
