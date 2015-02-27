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
public class JB_Person implements Serializable {
    
    public static final String PERSON_ID = "person_id";
    public static final String PERSON_TYPE = "person_type_id";
    public static final String PERSON_LOGIN = "person_login";
    public static final String PERSON_PWD = "person_pwd";
    
    private int person_id;
    private int person_type_id;
    private String person_login;
    private String person_pwd;
    
    private PropertyChangeSupport propertySupport;
    
    public JB_Person() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getPersonId() {
        return person_id;
    }
    public void setPersonId(int value) {
        int oldValue = person_id;
        person_id = value;
        propertySupport.firePropertyChange(PERSON_ID, oldValue, person_id);
    }
    
    public int getPersonTypeId(){
        return person_type_id;
    }
    public void setPersonTypeId(int value){
        int old = person_type_id;
        person_type_id = value;
        propertySupport.firePropertyChange(PERSON_TYPE, old, person_type_id);
    }
    
    public String getPersonLogin(){
        return person_login;
    }
    public void setPersonLogin(String value){
        String old = person_login;
        person_login = value;
        propertySupport.firePropertyChange(PERSON_LOGIN,old,person_login);
    }
    
    public String getPersonPwd(){
        return person_pwd;
    }
    public void setPersonPwd(String value){
        String old = person_pwd;
        person_pwd = value;
        propertySupport.firePropertyChange(PERSON_PWD,old,person_pwd);
    }
    
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
