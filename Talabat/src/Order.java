/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Order {
    private Meal orderedmeal;
   private int quantity;
    private String notes;
    private final Date orderdate;

    public Order(Meal orderedmeal, int quantity, String notes, Date orderdate) {
        this.orderedmeal = orderedmeal;
        this.quantity = quantity;
        this.notes = notes;
        this.orderdate = orderdate;
    }

    public Meal getOrderedmeal() {
        return orderedmeal;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getNotes() {
        return notes;
    }

    public Date getOrderdate() {
        return orderdate;
    }
     public float getorderprice()
     {
         float totalprice=0;
         totalprice=((orderedmeal.getPrice())*quantity);
               return totalprice;
}
}
