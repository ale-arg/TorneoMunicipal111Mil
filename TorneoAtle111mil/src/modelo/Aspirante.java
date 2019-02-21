package modelo;

public class Aspirante  implements java.io.Serializable {


     private Integer idAspirante;
     private String nombre;
     private String apellido;
     private String direccion;
     private String fechaNacimiento;
     private String sexo;
     private String dni;
     private Integer escuelaId;

    public Aspirante() {
    }

	
    public Aspirante(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Aspirante(String nombre, String apellido, String direccion, String fechaNacimiento, String sexo, String dni, Integer escuelaId) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.direccion = direccion;
       this.fechaNacimiento = fechaNacimiento;
       this.sexo = sexo;
       this.dni = dni;
       this.escuelaId = escuelaId;
    }
   
    public Integer getIdAspirante() {
        return this.idAspirante;
    }
    
    public void setIdAspirante(Integer idAspirante) {
        this.idAspirante = idAspirante;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    public Integer getEscuelaId() {
        return this.escuelaId;
    }
    
    public void setEscuelaId(Integer escuelaId) {
        this.escuelaId = escuelaId;
    }




}


