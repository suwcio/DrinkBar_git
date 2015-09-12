/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.servlet.jsp.jstl.sql.ResultSupport;
import org.hibernate.Session;

/**
 *
 * @author Piotr
 */
public class UsersHelper {
    
    Session session = null;
    private Connection conn;
    
    public UsersHelper() {
        this.session = UsersHibernateUtil.getSessionFactory().openSession(); 
    }
    
    public List<Users> getUsers() {
        List<Users> users = session.createQuery("from Users").list();
        return users;
    }
    
}
