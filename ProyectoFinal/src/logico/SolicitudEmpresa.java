package logico;

import java.util.ArrayList;
import java.util.Date;

public class SolicitudEmpresa {	
	private String id;
	private String RNCEmpresa;
	private Date fecha;
	private int cantidadPlazasNecesarias;
	private boolean estado;
	private ArrayList<Personal> candidatosPosibles;

	// Requisitos
	private boolean salarioEsperado;
	private int edad;
	private int agnosExperiencia;
	private boolean disponibilidadSalirCiudad;
	private boolean disponibilidadCambioResidencia;
	private boolean forTiempoCompleto;
	private boolean esCasado;
	private ArrayList<String> idiomas;
	private String carrera;
	private String universidad;
	private String areaTecnica;
	private ArrayList<String> oficios;
	
	public SolicitudEmpresa(String id, String rNCEmpresa, Date fecha, int cantidadPlazasNecesarias, boolean estado,
			ArrayList<Personal> candidatosPosibles, boolean salarioEsperado, int edad, int agnosExperiencia,
			boolean disponibilidadSalirCiudad, boolean disponibilidadCambioResidencia, boolean forTiempoCompleto,
			boolean esCasado, ArrayList<String> idiomas, String carrera, String universidad, String areaTecnica,
			ArrayList<String> oficios) {
		super();
		this.id = id;
		RNCEmpresa = rNCEmpresa;
		this.fecha = fecha;
		this.cantidadPlazasNecesarias = cantidadPlazasNecesarias;
		this.estado = estado;
		this.candidatosPosibles = candidatosPosibles;
		this.salarioEsperado = salarioEsperado;
		this.edad = edad;
		this.agnosExperiencia = agnosExperiencia;
		this.disponibilidadSalirCiudad = disponibilidadSalirCiudad;
		this.disponibilidadCambioResidencia = disponibilidadCambioResidencia;
		this.forTiempoCompleto = forTiempoCompleto;
		this.esCasado = esCasado;
		this.idiomas = idiomas;
		this.carrera = carrera;
		this.universidad = universidad;
		this.areaTecnica = areaTecnica;
		this.oficios = oficios;
	}

	public String getId() {
		return id;
	}

	public String getRNCEmpresa() {
		return RNCEmpresa;
	}

	public Date getFecha() {
		return fecha;
	}

	public int getCantidadPlazasNecesarias() {
		return cantidadPlazasNecesarias;
	}

	public boolean isEstado() {
		return estado;
	}

	public ArrayList<Personal> getCandidatosPosibles() {
		return candidatosPosibles;
	}

	public boolean isSalarioEsperado() {
		return salarioEsperado;
	}

	public int getEdad() {
		return edad;
	}

	public int getAgnosExperiencia() {
		return agnosExperiencia;
	}

	public boolean isDisponibilidadSalirCiudad() {
		return disponibilidadSalirCiudad;
	}

	public boolean isDisponibilidadCambioResidencia() {
		return disponibilidadCambioResidencia;
	}

	public boolean isForTiempoCompleto() {
		return forTiempoCompleto;
	}

	public boolean isEsCasado() {
		return esCasado;
	}

	public ArrayList<String> getIdiomas() {
		return idiomas;
	}

	public String getCarrera() {
		return carrera;
	}

	public String getUniversidad() {
		return universidad;
	}

	public String getAreaTecnica() {
		return areaTecnica;
	}

	public ArrayList<String> getOficios() {
		return oficios;
	}

	public void setCantidadPlazasNecesarias(int cantidadPlazasNecesarias) {
		this.cantidadPlazasNecesarias = cantidadPlazasNecesarias;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}	
}