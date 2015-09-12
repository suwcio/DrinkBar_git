/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.jstl.sql.Result;
import javax.servlet.jsp.jstl.sql.ResultSupport;

/**
 *
 * @author Piotr
 */
@ManagedBean(name="usersManagedBean")
@SessionScoped
public class UsersManagedBean {

    /**
     * Creates a new instance of UsersManagedBean
     */
    private Connection conn;
    
    public UsersManagedBean() {
    }
    
    //połączenie z bazą
    public void open() throws SQLException, ClassNotFoundException {
        if(conn!=null)
            return;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        conn = DriverManager.getConnection("jdbc:derby://localhost:1527/drinkbar","drinkbar","drinkbar");
    }
    
    //czy użytkownik jest w bazie
    public boolean isExist(String email, String pass) throws SQLException, ClassNotFoundException {
        try {
            open();
            Statement st = conn.createStatement();
            ResultSet results = st.executeQuery("select email from Users where email = '" + email + "' and pass = '" + pass + "';");
            boolean empty = results.wasNull();
            //return ResultSupport.toResult(results);
            return empty;
        }
        finally {
            close();
        }
    }
    
    private void close() throws SQLException {
        if(conn==null)
            return;
        conn.close();
        conn=null;
    }
    
    public void login(String email, String pass) throws SQLException, ClassNotFoundException {
        if(isExist(email, pass)) {
            
        }
    }
}
