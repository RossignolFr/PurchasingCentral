/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Bertrand
 */
public class JB_ProductsStatus implements Serializable {
    
    public static final String PS_ID = "ps_id";
    public static final String PS_NAME = "ps_name";
    
    private int ps_id;
    private String ps_name;
    
    private PropertyChangeSupport propertySupport;
    
    public JB_ProductsStatus() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getPsId(){
        return ps_id;
    }
    public void setPsId(int value){
        int old = ps_id;
        ps_id = value;
        propertySupport.firePropertyChange(PS_ID,old,ps_id);
    }
    
    
    public String getPsName() {
        return ps_name;
    }
    public void setPsName(String value) {
        String oldValue = ps_name;
        ps_name = value;
        propertySupport.firePropertyChange(PS_NAME, oldValue, ps_name);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
