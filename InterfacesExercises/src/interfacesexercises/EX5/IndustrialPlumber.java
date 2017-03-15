/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises.EX5;

/**
 *
 * @author Riverto
 */
public class IndustrialPlumber extends Human implements Plumber,Electrician{

    public IndustrialPlumber(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "IndustrialPlumber{" +super.toString()+ '}';
    }



    @Override
    public String unplugDrain() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String changeBulb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
