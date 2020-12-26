/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Owner extends User {
    private final Restaurant restruant;
    public Owner(String name, String passward , Restaurant restruant) {
        super(name, passward);
        this.restruant=  restruant;
    }

    public Restaurant getRestruant() {
        return restruant;
    }

    
    public void Register() {
       
    }
}
