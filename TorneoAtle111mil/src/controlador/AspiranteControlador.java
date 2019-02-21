

package controlador;

import java.util.List;
import modelo.Aspirante;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class AspiranteControlador {
    
   
    
      public List<Aspirante> buscarAspirantes(int idEsc) {    
         
          
          
          try {
             Session session = HibernateUtil.getSessionFactory().openSession();
             session.beginTransaction();
             Query q2 = session.createQuery("from Aspirante a where a.escuelaId like '"+idEsc+"%'");
             List listAspirantes = q2.list();
             session.getTransaction().commit();
             return listAspirantes;
             } catch (HibernateException he) {
                     he.printStackTrace();
             }
         return null;
    
    
     }

    public void alta(Aspirante asp) {
       
        try {
           SessionFactory sf = HibernateUtil.getSessionFactory();
           Session se = sf.openSession();
           se.beginTransaction();
           se.save(asp);
           se.getTransaction().commit();
           se.close(); 
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        
        
        
        
        
    }
        
        
    }

    
    
