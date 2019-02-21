package modelo;

public class DetalleDisciplina  implements java.io.Serializable {


     private DetalleDisciplinaId id;
     
     private String disciplina;

    public DetalleDisciplina() {
    }

    public DetalleDisciplina(DetalleDisciplinaId id, String disciplina) {
        this.id = id;
        this.disciplina = disciplina;
    }

	
    
   
    public DetalleDisciplinaId getId() {
        return this.id;
    }
    
    public void setId(DetalleDisciplinaId id) {
        this.id = id;
    }
    
    public String getDisciplina() {
        return this.disciplina;
    }
    
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }




}


