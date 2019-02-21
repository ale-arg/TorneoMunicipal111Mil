package modelo;

public class DetalleDisciplinaId  implements java.io.Serializable {


     private int idInsAsp;
     private int idDetDis;

    public DetalleDisciplinaId() {
    }

    public DetalleDisciplinaId(int idInsAsp, int idDetDis) {
       this.idInsAsp = idInsAsp;
       this.idDetDis = idDetDis;
    }
   
    public int getIdInsAsp() {
        return this.idInsAsp;
    }
    
    public void setIdInsAsp(int idInsAsp) {
        this.idInsAsp = idInsAsp;
    }
    public int getIdDetDis() {
        return this.idDetDis;
    }
    
    public void setIdDetDis(int idDetDis) {
        this.idDetDis = idDetDis;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof DetalleDisciplinaId) ) return false;
		 DetalleDisciplinaId castOther = ( DetalleDisciplinaId ) other; 
         
		 return (this.getIdInsAsp()==castOther.getIdInsAsp())
 && (this.getIdDetDis()==castOther.getIdDetDis());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdInsAsp();
         result = 37 * result + this.getIdDetDis();
         return result;
   }   


}


