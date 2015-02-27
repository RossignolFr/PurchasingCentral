/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Bertrand
 */
public class JB_LinkProdPers implements Serializable {
    
    public static final String LPP_ID = "lpp_id";
    public static final String LPP_PRODUCT_ID = "lpp_product_id";
    public static final String LPP_PERSON_ID = "lpp_person_id";
    public static final String LPP_ACTION_TYPE = "lpp_action_type";
    public static final String LPP_ACTION_DATE = "lpp_action_date";
    public static final String LPP_DUE_DATE = "lpp_dure_date";
    
    private int lpp_id;
    private int lpp_product_id;
    private int lpp_person_id;
    private int lpp_action_type;
    private Date lpp_action_date;
    private Date lpp_due_date;
    
    private PropertyChangeSupport propertySupport;
    
    public JB_LinkProdPers() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getLppId() {
        return lpp_id;
    }
    public void setLppId(int value) {
        int oldValue = lpp_id;
        lpp_id = value;
        propertySupport.firePropertyChange(LPP_ID, oldValue, lpp_id);
    }
    
    public int getLppProductId(){
        return lpp_product_id;
    }
    public void setLppProducId(int value){
        int old = value;
        lpp_product_id = value;
        propertySupport.firePropertyChange(LPP_PRODUCT_ID,old,lpp_product_id);
    }
    
    public int getLppPersonId(){
        return lpp_person_id;
    }
    public void setLppPersonId(int value){
        int old = lpp_person_id;
        lpp_person_id = value;
        propertySupport.firePropertyChange(LPP_PERSON_ID,old,lpp_person_id);
        
    }
    
    public int getLppActionType(){
        return lpp_action_type;
    }
    public void setLppActionType(int value){
        int old = lpp_action_type;
        lpp_action_type = value;
        propertySupport.firePropertyChange(LPP_ACTION_TYPE,old,lpp_action_type);
        
    }
    
    public Date getLppActionDate(){
        return lpp_action_date;
    }
    public void setLppActionDate(Date value){
        Date old = lpp_action_date;
        lpp_action_date = value;
        propertySupport.firePropertyChange(LPP_ACTION_DATE,old,lpp_action_date);
    }
    
    public Date getLppDueDate(){
        return lpp_due_date;
    }
    public void setLppDueDate(Date value){
        Date old = lpp_due_date;
        lpp_due_date = value;
        propertySupport.firePropertyChange(LPP_DUE_DATE,old,lpp_due_date);
    }
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
