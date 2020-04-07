package entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Formapago.class)
public abstract class Formapago_ {

	public static volatile SingularAttribute<Formapago, String> descripcion;
	public static volatile ListAttribute<Formapago, Inscripcion> inscripcions;
	public static volatile SingularAttribute<Formapago, Double> recargo;
	public static volatile SingularAttribute<Formapago, Integer> idformapago;

}

