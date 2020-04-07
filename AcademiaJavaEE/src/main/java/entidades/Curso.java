package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the curso database table.
 * 
 */
@Entity
@NamedQuery(name="Curso.findAll", query="SELECT c FROM Curso c")
public class Curso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idcurso;

	private String descripcion;

	private double precio;

	//bi-directional many-to-one association to Inscripcion
	@OneToMany(mappedBy="curso")
	private List<Inscripcion> inscripcions;

	public Curso() {
	}

	public Integer getIdcurso() {
		return this.idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public List<Inscripcion> getInscripcions() {
		return this.inscripcions;
	}

	public void setInscripcions(List<Inscripcion> inscripcions) {
		this.inscripcions = inscripcions;
	}

	public Inscripcion addInscripcion(Inscripcion inscripcion) {
		getInscripcions().add(inscripcion);
		inscripcion.setCurso(this);

		return inscripcion;
	}

	public Inscripcion removeInscripcion(Inscripcion inscripcion) {
		getInscripcions().remove(inscripcion);
		inscripcion.setCurso(null);

		return inscripcion;
	}

}