/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class User {
    protected String name;
    protected String passward;
   

    public User(String name, String passward) {
        this.name = name;
        this.passward = passward;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }
 

     public  void login()
     {
     }
    
}
