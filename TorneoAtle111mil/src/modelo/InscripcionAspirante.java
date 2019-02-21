package modelo;



import java.util.HashSet;
import java.util.Set;


public class InscripcionAspirante  implements java.io.Serializable {


     private Integer idInsAsp;
     private String aspirante;
     private String categoria;
     private Set detalleDisciplinas = new HashSet(0);

    public InscripcionAspirante() {
    }

    public InscripcionAspirante(String aspirante, String categoria, Set detalleDisciplinas) {
       this.aspirante = aspirante;
       this.categoria = categoria;
       this.detalleDisciplinas = detalleDisciplinas;
    }
   
    public Integer getIdInsAsp() {
        return this.idInsAsp;
    }
    
    public void setIdInsAsp(Integer idInsAsp) {
        this.idInsAsp = idInsAsp;
    }
    public String getAspirante() {
        return this.aspirante;
    }
    
    public void setAspirante(String aspirante) {
        this.aspirante = aspirante;
    }
    public String getCategoria() {
        return this.categoria;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Set getDetalleDisciplinas() {
        return this.detalleDisciplinas;
    }
    
    public void setDetalleDisciplinas(Set detalleDisciplinas) {
        this.detalleDisciplinas = detalleDisciplinas;
    }




}


