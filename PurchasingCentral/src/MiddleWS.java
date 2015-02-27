/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package purchasingCentral; 

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;


/**
 *
 * @author Jaouad
 */


class Produit {
    
    
    public Produit(int newprice, int newIdProduit,int newQuantity, int newLot){
        idProduit = newIdProduit; 
        quantity = newQuantity ;
        lot = newLot; 
        price = newprice; 
    }
    public Produit(){
        idProduit = 0; 
        quantity = 0;
        lot = 0; 
        price = 0.0; 
    }
    
    
    
    public void setPrice(int newprice){
        this.price = newprice; 
    }
    
    public double getPrice(){
        return this.price; 
    }
    
    public void setIdProduit(int newIdProduit){
        this.idProduit = newIdProduit; 
    }
    
    public int getIdProduit(){
        return this.idProduit; 
    }
    
    public void setQuantity(int newQuantity){
        this.quantity= newQuantity; 
    }
    
    public int getQuantity(){
        return this.quantity; 
    }
    
    public int getLot(){
        return this.lot; 
    }
    public void setLot(int newLot){
        this.lot = newLot; 
    }
    private int idProduit;
    private int quantity; 
    private double price;  
    private int lot;
    
    
}


class WSPurchasingCentralReponse {
    
    public WSPurchasingCentralReponse(int newerrorcode, String newmessage){
        this.message = newmessage; 
        this.errorcode = newerrorcode; 
        products = new Produit[500]; 
    
        for(int i = 0 ; i < 500 ; i++){
            products[i] = new Produit(); 
        }
    }
    
    public WSPurchasingCentralReponse(){
        
        message = ""; 
        errorcode = 0;
        products = new Produit[500]; 
    }
    
    
    public void setProduit(int i, int newprice, int newIdProduit,int newQuantity, int newLot){
       products[i] = new Produit(newprice,newIdProduit,newQuantity,newLot); 
    }
    private String message; 
    private int errorcode; 
    private Produit[] products; 
    

}


@WebService(serviceName = "MiddleWS", targetNamespace = "http://my.org/ns/")
public class MiddleWS {

    /**
     * This is a sample web service operation
     * @return 
     */
    @WebMethod(operationName = "essai")
    public WSPurchasingCentralReponse essai() {
        WSPurchasingCentralReponse response = new WSPurchasingCentralReponse(2, "produit non disponible"); 
        return response; 
    }
}
