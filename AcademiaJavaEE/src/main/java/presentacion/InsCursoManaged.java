package presentacion;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import negocio.IAcademiaBean;
import entidades.Curso;
@ManagedBean
public class InsCursoManaged {

	@EJB
	IAcademiaBean iAcademiaBean;
	
	private Integer idcurso;
	private String descripcion;
	private double precio;
	private List<Curso> cursos;
	
	@PostConstruct
	public void init(){
		try{
			cursos = iAcademiaBean.buscarCursos();
		}
		catch(Exception ex){}
		
	}
	
	public InsCursoManaged() {
		// TODO Auto-generated constructor stub
	}
	public String insertarCurso(){
		try{
			iAcademiaBean.InsertarCurso(idcurso, descripcion, precio);
			cursos = iAcademiaBean.buscarCursos();
			return "cursos";
		}
		catch(Exception ex){
			FacesMessage facesMessage = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", ex.getMessage());
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage(null, facesMessage);
			return "";
		}
		
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public List<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}
	
	

	
}
