package modelo;

public class Categoria  implements java.io.Serializable {


     private Integer idCategoria;
     private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(String nombreCategoria) {
       this.nombreCategoria = nombreCategoria;
    }
   
    public Integer getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNombreCategoria() {
        return this.nombreCategoria;
    }
    
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }




}


