package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Curso.class)
public abstract class Curso_ {

	public static volatile SingularAttribute<Curso, String> descripcion;
	public static volatile SingularAttribute<Curso, Double> precio;
	public static volatile ListAttribute<Curso, Inscripcion> inscripcions;
	public static volatile SingularAttribute<Curso, Integer> idcurso;

}

