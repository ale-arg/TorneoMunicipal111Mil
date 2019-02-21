

package controlador;

import java.util.List;
import modelo.Disciplina;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class DisciplinaControlador {
    
    public List<Disciplina> listarDisciplina() {
        
        try {
         SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        List<Disciplina> lista= se.createCriteria(Disciplina.class).list();
        
        se.close();
        return lista;
        } catch (HibernateException he) {
            
        he.printStackTrace();
            
        }
        return null;
        
    }
    
    
}
