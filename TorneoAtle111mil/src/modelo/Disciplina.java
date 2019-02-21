package modelo;

public class Disciplina  implements java.io.Serializable {


     private Integer idDisciplina;
     private String nombreDisciplina;

    public Disciplina() {
    }

    public Disciplina(String nombreDisciplina) {
       this.nombreDisciplina = nombreDisciplina;
    }
   
    public Integer getIdDisciplina() {
        return this.idDisciplina;
    }
    
    public void setIdDisciplina(Integer idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public String getNombreDisciplina() {
        return this.nombreDisciplina;
    }
    
    public void setNombreDisciplina(String nombreDisciplina) {
        this.nombreDisciplina = nombreDisciplina;
    }




}


