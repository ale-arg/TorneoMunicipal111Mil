

package controlador;

import java.util.List;
import modelo.Categoria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class CategoriaControlador {
    
    public List<Categoria> listarCategoria() {
        
        try {
         SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        List<Categoria> lista= se.createCriteria(Categoria.class).list();
        
        se.close();
        return lista;
        } catch (HibernateException he) {
            
        he.printStackTrace();
            
        }
        return null;
        
    }
    
}
