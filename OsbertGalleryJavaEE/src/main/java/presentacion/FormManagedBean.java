package presentacion;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormManagedBean {
	private String usuario;
	private String pass;
	public String getUsuario() {
		return usuario;
	}
	
	public FormManagedBean(){}
	
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}

	public String validarLogin(){
		return "inicio";
	}
	
	
	
}
