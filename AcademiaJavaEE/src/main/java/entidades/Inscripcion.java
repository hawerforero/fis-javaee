package entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the inscripcion database table.
 * 
 */
@Entity
@NamedQuery(name="Inscripcion.findAll", query="SELECT i FROM Inscripcion i")
public class Inscripcion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idinscripcion;

	private String apellido;

	private String nombre;

	private String telefono;

	//bi-directional many-to-one association to Curso
	@ManyToOne
	@JoinColumn(name="idcurso")
	private Curso curso;

	//bi-directional many-to-one association to Formapago
	@ManyToOne
	@JoinColumn(name="idformapago")
	private Formapago formapago;

	public Inscripcion() {
	}

	public Integer getIdinscripcion() {
		return this.idinscripcion;
	}

	public void setIdinscripcion(Integer idinscripcion) {
		this.idinscripcion = idinscripcion;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Curso getCurso() {
		return this.curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Formapago getFormapago() {
		return this.formapago;
	}

	public void setFormapago(Formapago formapago) {
		this.formapago = formapago;
	}

}