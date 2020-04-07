package entidades;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Array;


/**
 * The persistent class for the galeria database table.
 * 
 */
@Entity
@NamedQuery(name="Galeria.findAll", query="SELECT g FROM Galeria g")
public class Galeria implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="\"Id\"")
	private long id;

	private Array nombre;

	public Galeria() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Array getNombre() {
		return this.nombre;
	}

	public void setNombre(Array nombre) {
		this.nombre = nombre;
	}

}