package users;
// Generated 2015-06-18 15:49:25 by Hibernate Tools 4.3.1



/**
 * Users generated by hbm2java
 */
public class Users  implements java.io.Serializable {


     private int id;
     private String email;
     private String pass;

    public Users() {
    }

    public Users(int id, String email, String pass) {
       this.id = id;
       this.email = email;
       this.pass = pass;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }

}


