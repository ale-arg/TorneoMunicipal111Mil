package modelo;

public class Escuela  implements java.io.Serializable {


     private Integer idEscuela;
     private String nombreEscuela;

    public Escuela() {
    }

    public Escuela(String nombreEscuela) {
       this.nombreEscuela = nombreEscuela;
    }
   
    public Integer getIdEscuela() {
        return this.idEscuela;
    }
    
    public void setIdEscuela(Integer idEscuela) {
        this.idEscuela = idEscuela;
    }
    public String getNombreEscuela() {
        return this.nombreEscuela;
    }
    
    public void setNombreEscuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
    }




}


