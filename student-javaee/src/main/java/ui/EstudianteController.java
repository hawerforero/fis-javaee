package ui;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import business.IEstudianteService;
import data.Estudiante;

@ManagedBean
@ViewScoped
public class EstudianteController {
	
	@EJB
	private IEstudianteService esudianteService;
	
	private Long Id;
	private String Nombre;
	private String Apellido;

	public void RegistrarEstudiante()
	{
		Estudiante estudiante = new Estudiante();
		estudiante.setNombre(this.Nombre);
		estudiante.setApellido(this.Apellido);
		this.Id = esudianteService.registrarEstudiante(estudiante);
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}
	
	
}
