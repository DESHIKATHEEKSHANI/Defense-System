package Demo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Observerble {
    private static Observerble ob;
    private final Helicopter heli;
    private final Submarine sub;
    private final Tank tank;
    private final MainController main;
    
    Observerble(){
        ob = this;
        heli = new Helicopter();
        sub = new Submarine();
        tank = new Tank();
        main = new MainController();
    }
    
    public static Observerble getReference(){
        return ob;
    }
    
    public void setLevel(int value,String Vtype){
        if (Vtype.equals("Helicopter") || Vtype.equals("All")) {
            heli.setPosition(value);
        }
        if (Vtype.equals("Tank") || Vtype.equals("All")) {
            tank.setPosition(value);
        }
        if (Vtype.equals("Submarine") || Vtype.equals("All")) {
            sub.setPosition(value);
        }
    }
    
    public void setArea(boolean selected ,String Vtype){
        if (Vtype.equals("Helicopter") || Vtype.equals("All")) {
            heli.setArea(selected);
        }
        if (Vtype.equals("Tank") || Vtype.equals("All")) {
            tank.setArea(selected);
        }
        if (Vtype.equals("Submarine") || Vtype.equals("All")) {
            sub.setArea(selected);
        }
    }  
    
    public void setMessage(String text ,String Vtype){
        if (Vtype.equals("Helicopter") || Vtype.equals("All")) {
            heli.setMessage(text);
        }
        if (Vtype.equals("Tank") || Vtype.equals("All")) {
            tank.setMessage(text);
        }
        if (Vtype.equals("Submarine") || Vtype.equals("All")) {
            sub.setMessage(text);
        }
    }
    public void getMessage(String msg) {
        main.getMessage(msg);
    }
}
