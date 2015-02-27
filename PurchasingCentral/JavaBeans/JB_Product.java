/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.beans.*;
import java.io.Serializable;
import jdk.nashorn.internal.runtime.regexp.joni.EncodingHelper;

/**
 *
 * @author Bertrand
 */
public class JB_Product implements Serializable {
    
    public static final String PRODUCT_ID = "product_id";
    public static final String PRODUCT_STATUT_ID = "product_statut_id";
    public static final String PRODUCT_REF = "product_ref";
    public static final String PRODUCT_LOT = "product_lot";
    public static final String PRODUCT_UID = "product_uid";
    public static final String PRODUCT_PRICE = "product_price";
    
    private int product_id;
    private int product_statut_id;
    private String product_ref;
    private String product_lot;
    private String product_uid;
    private double product_price;
    
    private PropertyChangeSupport propertySupport;
    
    public JB_Product() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public int getProductId(){
        return product_id;
    }
    public void setProductId(int value){
        int old = product_id;
        product_id = value;
        propertySupport.firePropertyChange(PRODUCT_ID,old,product_id);
    }
    
    public int getProductStatutId(){
        return product_statut_id;
    }
    public void setProductStatutId(int value){
        int old = product_statut_id;
        product_statut_id = value;
        propertySupport.firePropertyChange(PRODUCT_STATUT_ID, old, product_statut_id);
    }
    
    public String getProductRef(){
        return product_ref;
    }
    public void setProductRef(String value){
        String old = product_ref;
        product_ref = value;
        propertySupport.firePropertyChange(PRODUCT_REF, od, product_ref);
    }
    
    public String getProductLot(){
        return product_lot;
    }
    public void setProductLot(String value){
        String old = product_lot;
        product_lot = old;
        propertySupport.firePropertyChange(PRODUCT_LOT,old,product_lot);
    }
    
    public String getProductUid(){
        return product_uid;
    }
    public void setProductUid(String value){
        String old = product_uid;
        product_uid = value;
        propertySupport.firePropertyChange(PRODUCT_UID,old,product_uid);
    }
    
    public double getProductPrice(){
        return product_price;
    }
    public void setProductPrice(double value){
        double old = product_price;
        product_price = value;
        propertySupport.firePropertyChange(PRODUCT_PRICE,old,product_price);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
