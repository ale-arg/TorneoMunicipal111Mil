

package controlador;

import java.util.List;
import modelo.DetalleDisciplina;
import modelo.DetalleDisciplinaId;
import modelo.InscripcionAspirante;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class RegistrarAspiranteControlador {

    public int agregarRegistroAspirante(InscripcionAspirante ia) {
        int idI=0;
         try {
           SessionFactory sf = HibernateUtil.getSessionFactory();
           Session se = sf.openSession();
           se.beginTransaction();
           se.save(ia);
           se.getTransaction().commit();
           se.close();
            idI = ia.getIdInsAsp();
           
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return idI;
        
    }

    public void altaDis(int idI, Integer num, List<String> listaDis) {
        
        int munero = num;
        
        
        for (int i = 0; i < munero; i++) {
            SessionFactory sf = HibernateUtil.getSessionFactory();
            Session session = sf.openSession();
            int ia= i+1;
            //DetalleInscripcionId diid = new DetalleInscripcionId(ia,numInsAsp);
            DetalleDisciplinaId diid = new DetalleDisciplinaId(idI,ia) ;
            String discipli = listaDis.get(i);
            //DetalleInscripcion di = new DetalleInscripcion(diid, discipli);
            DetalleDisciplina di = new DetalleDisciplina(diid, discipli);
            Transaction tx = session.beginTransaction();
            session.save(di);
            tx.commit();
            session.flush();
            session.close();
        }
        
        
    }
    
}
