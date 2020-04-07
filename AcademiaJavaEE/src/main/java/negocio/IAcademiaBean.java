package negocio;

import java.util.List;

import javax.ejb.Remote;

import entidades.Curso;

@Remote
public interface IAcademiaBean {
	
	public void InsertarCurso(int idcurso, String descripcion, double precio);
	
	public List<Curso> buscarCursos();
}
