package negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import dao.CursoDAO;
import entidades.Curso;

@Stateless
public class AcademiaBean implements IAcademiaBean {

	@Inject
	CursoDAO cursoDAO;
	
	public AcademiaBean() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void InsertarCurso(int idcurso, String descripcion, double precio) {
		// TODO Auto-generated method stub
		Curso curso = new Curso();
		curso.setIdcurso(idcurso);
		curso.setDescripcion(descripcion);
		curso.setPrecio(precio);
		
		cursoDAO.crearCurso(curso);
	}

	@Override
	public List<Curso> buscarCursos() {
		// TODO Auto-generated method stub
		return cursoDAO.buscarCursos();
	}
	

}
