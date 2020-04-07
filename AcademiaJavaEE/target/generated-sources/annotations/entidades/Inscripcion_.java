package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Inscripcion.class)
public abstract class Inscripcion_ {

	public static volatile SingularAttribute<Inscripcion, Integer> idinscripcion;
	public static volatile SingularAttribute<Inscripcion, Curso> curso;
	public static volatile SingularAttribute<Inscripcion, String> apellido;
	public static volatile SingularAttribute<Inscripcion, String> telefono;
	public static volatile SingularAttribute<Inscripcion, String> nombre;
	public static volatile SingularAttribute<Inscripcion, Formapago> formapago;

}

