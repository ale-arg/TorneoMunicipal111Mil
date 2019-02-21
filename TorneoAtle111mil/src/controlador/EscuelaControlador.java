

package controlador;

import java.util.List;
import modelo.Escuela;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class EscuelaControlador {
    
    
    
    public List<Escuela> listarEscuela() {
        
        try {
         SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        List<Escuela> lista= se.createCriteria(Escuela.class).list();
        
        se.close();
        return lista;
        } catch (HibernateException he) {
            
        he.printStackTrace();
            
        }
        return null;
        
    }
    
   
    
    public int buscarEscuela(String mensaje)  {
        
        
        int idEsc = 0;
        
        try {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Escuela escuela = (Escuela) session.createQuery("from Escuela a where a.nombreEscuela like '"+ mensaje + "%'").uniqueResult();
        idEsc = escuela.getIdEscuela();
        session.getTransaction().commit();
       } catch (HibernateException he) {
        he.printStackTrace();
        }
        return idEsc;
              
    }
    
   
    
    
    
    
    
}
