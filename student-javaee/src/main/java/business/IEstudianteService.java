package business;

import javax.ejb.Local;

import data.Estudiante;

@Local
public interface IEstudianteService {
	
	public Long registrarEstudiante(Estudiante estudiante);
}
