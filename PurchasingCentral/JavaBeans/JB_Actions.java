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
public class JB_Actions implements Serializable {
    
    public static final String ACTION_ID = "at_id";
    public static final String ACTION_NAME = "at_name";
    
    private int at_id;
    private String at_name;
    
    private PropertyChangeSupport propertySupport;
    
    public JB_Actions() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getActionId() {
        return at_id;
    }
    public void setActionId(int value) {
        int oldValue = at_id;
        at_id = value;
        propertySupport.firePropertyChange(ACTION_ID, oldValue, at_id);
    }
    
    public String getActionName(){
        return at_name;
    }
    public void setActionName(String value){
        String old = at_name;
        at_name = value;
        propertySupport.firePropertyChange(ACTION_NAME,old,at_name);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
