package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cargo")
public class Cargo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_Cargo;

	@Column(name = "Nombre_Puesto")
	private String Nombre_Puesto;

	@Column(name = "Numero_Cuenta")
	private String Numero_Cuenta;

	@Column(name = "Valor_Salario")
	private String Valor_Salario;
	
	// Se utiliza la anotacion OneToMany ya que las dos tablas se necesitan relacionarme mediante el puesto y rol del usuario
	@OneToMany(mappedBy = "cargo")
	//Aqui se crea el objeto de la relacion con la clase Rol y se trabaja con un List ya que se usa un OneToMany
	private List<Rol> roles = new ArrayList<Rol>();
	//Constructor Vacio
	public Cargo() {

	}
	//Constructor con los atributos de la tabla cargo
	public Cargo(String nombre_Puesto, String numero_Cuenta, String valor_Salario) {
		this.Nombre_Puesto = nombre_Puesto;
		this.Numero_Cuenta = numero_Cuenta;
		this.Valor_Salario = valor_Salario;
	}
	//Constructor con los atributos y la relacion con la entidad Rol
	public Cargo(String nombre_Puesto, String numero_Cuenta, String valor_Salario, List<Rol> roles) {
		super();
		this.Nombre_Puesto = nombre_Puesto;
		this.Numero_Cuenta = numero_Cuenta;
		this.Valor_Salario = valor_Salario;
		this.roles = roles;
	}
	//Getters And Setters
	public long getId_Cargo() {
		return id_Cargo;
	}
	public void setId_Cargo(long id_Cargo) {
		this.id_Cargo = id_Cargo;
	}
	public String getNombre_Puesto() {
		return Nombre_Puesto;
	}
	public void setNombre_Puesto(String nombre_Puesto) {
		Nombre_Puesto = nombre_Puesto;
	}
	public String getNumero_Cuenta() {
		return Numero_Cuenta;
	}
	public void setNumero_Cuenta(String numero_Cuenta) {
		Numero_Cuenta = numero_Cuenta;
	}
	public String getValor_Salario() {
		return Valor_Salario;
	}
	public void setValor_Salario(String valor_Salario) {
		Valor_Salario = valor_Salario;
	}
	public List<Rol> getRoles() {
		return roles;
	}
	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}

}