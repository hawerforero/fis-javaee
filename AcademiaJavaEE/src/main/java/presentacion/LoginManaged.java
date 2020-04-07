package presentacion;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginManaged {

	private String user;
	private String password;
	
	public LoginManaged() {
		// TODO Auto-generated constructor stub
	}
	
	public String validarLogin(){
		if(user.equals(password)){
			return "exito";
		}
		return "error";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
