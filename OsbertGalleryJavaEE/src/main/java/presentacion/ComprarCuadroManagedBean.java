package presentacion;


import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ComprarCuadroManagedBean {
	
	//Datos del cuadro
	private String titulo;
	private Date fechaCreacion;
	private int ancho;
	private int alto;
	private String clasificacion;
	private String tecnica;
	private String tema;
	//Datos del artista
	private String nombreArtista;
	private String apellidoArtista;
	//Datos del vendedor
	private String nombreVendedor;
	private String direccionVendedor;
	private Date fechaCompra;
	private long valor;
	
	//constructor
    public ComprarCuadroManagedBean(){}
    
    //metodos controlador
    public String registrarCuadro(){
		return "resumen";
	}

    
    
    //metodos get - set
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public String getNombreArtista() {
		return nombreArtista;
	}

	public void setNombreArtista(String nombreArtista) {
		this.nombreArtista = nombreArtista;
	}

	public String getApellidoArtista() {
		return apellidoArtista;
	}

	public void setApellidoArtista(String apellidoArtista) {
		this.apellidoArtista = apellidoArtista;
	}

	public String getNombreVendedor() {
		return nombreVendedor;
	}

	public void setNombreVendedor(String nombreVendedor) {
		this.nombreVendedor = nombreVendedor;
	}

	public String getDireccionVendedor() {
		return direccionVendedor;
	}

	public void setDireccionVendedor(String direccionVendedor) {
		this.direccionVendedor = direccionVendedor;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public long getValor() {
		return valor;
	}

	public void setValor(long valor) {
		this.valor = valor;
	}
    

   
}
