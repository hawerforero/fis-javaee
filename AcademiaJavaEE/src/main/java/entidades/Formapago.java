package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the formapago database table.
 * 
 */
@Entity
@NamedQuery(name="Formapago.findAll", query="SELECT f FROM Formapago f")
public class Formapago implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private Integer idformapago;

	private String descripcion;

	private double recargo;

	//bi-directional many-to-one association to Inscripcion
	@OneToMany(mappedBy="formapago")
	private List<Inscripcion> inscripcions;

	public Formapago() {
	}

	public Integer getIdformapago() {
		return this.idformapago;
	}

	public void setIdformapago(Integer idformapago) {
		this.idformapago = idformapago;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getRecargo() {
		return this.recargo;
	}

	public void setRecargo(double recargo) {
		this.recargo = recargo;
	}

	public List<Inscripcion> getInscripcions() {
		return this.inscripcions;
	}

	public void setInscripcions(List<Inscripcion> inscripcions) {
		this.inscripcions = inscripcions;
	}

	public Inscripcion addInscripcion(Inscripcion inscripcion) {
		getInscripcions().add(inscripcion);
		inscripcion.setFormapago(this);

		return inscripcion;
	}

	public Inscripcion removeInscripcion(Inscripcion inscripcion) {
		getInscripcions().remove(inscripcion);
		inscripcion.setFormapago(null);

		return inscripcion;
	}

}