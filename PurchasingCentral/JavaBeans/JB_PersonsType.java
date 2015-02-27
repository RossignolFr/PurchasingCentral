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
public class JB_PersonsType implements Serializable {
    
    public static final String PT_ID = "pt_id";
    public static final String PT_NAME = "pt_name";
    
    private int pt_id;
    private String pt_name;
    
    private PropertyChangeSupport propertySupport;
    
    public JB_PersonsType() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getPtId() {
        return pt_id;
    }
    public void setPtId(int value) {
        int oldValue = pt_id;
        pt_id = value;
        propertySupport.firePropertyChange(PT_ID, oldValue, pt_id);
    }
    
    public String getPtName(){
        return pt_name;
    }
    public void setPtName(String value){
        String old = pt_name;
        pt_name = value;
        propertySupport.firePropertyChange(PT_NAME,old,pt_name);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
