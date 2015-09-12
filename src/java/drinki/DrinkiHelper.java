/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drinki;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Piotr
 */
public class DrinkiHelper {
    
    Session session = null;
    
    public DrinkiHelper() {
        this.session = DrinkiHibernateUtil.getSessionFactory().openSession(); 
    }
    
    public List<Drinki> getDrinki() {
        List<Drinki> drinki = session.createQuery("from Drinki").list();
        return drinki;
    }
    
    public void saveOrUpdate(Drinki drink) {
        Transaction tx = this.session.getTransaction();
        tx.begin();
        this.session.saveOrUpdate(drink);
        tx.commit();
    }
    
}
