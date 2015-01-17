/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentpc.BusinessLogic;

import agentpc.DBOperations.DBOperations;

public class ItemDetails {
    private String itemID;
    private String itemName;
    private String suplier;
    private String itemType;
    private double getPrice;
    private double selPrice;
    private double lblPrice;
    private double companyDisc;
    private double salesDisc;
    private int quantity;
    private String complain;
    private String description;
    
    //private static int autoIncrement=1;
    
    private DBOperations dbo=new DBOperations();

    /**
     * @return the itemID
     */
    public String getItemID() {
        return itemID;
    }

    /**
     * @param itemID the itemID to set
     */
    public void setItemID(String table,String colomn,String type) {
        this.itemID =dbo.checkItemID(table,colomn,type);
        //this.itemID = itemID;
    }
    
    public void setItemId(String id) {
        this.itemID = id;
        //this.itemID = itemID;
    }

    /**
     * @return the itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * @param itemName the itemName to set
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * @return the suplierID
     */
    public String getSuplier() {
        return suplier;
    }

    /**
     * @param suplierID the suplierID to set
     */
    public void setSuplierID(String suplierID) {
        this.setSuplier(suplierID);
    }

    /**
     * @return the itemType
     */
    public String getItemType() {
        return itemType;
    }

    /**
     * @param itemType the itemType to set
     */
    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    /**
     * @return the getPrice
     */
    public double getGetPrice() {
        return getPrice;
    }

    /**
     * @param getPrice the getPrice to set
     */
    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;
    }

    /**
     * @return the lblPrice
     */
    public double getLblPrice() {
        return lblPrice;
    }

    /**
     * @param lblPrice the lblPrice to set
     */
    public void setLblPrice(double lblPrice) {
        this.lblPrice = lblPrice;
    }

    /**
     * @return the companyDisc
     */
    public double getCompanyDisc() {
        return companyDisc;
    }

    /**
     * @param companyDisc the companyDisc to set
     */
    public void setCompanyDisc(double companyDisc) {
        this.companyDisc = companyDisc;
    }

    /**
     * @return the salesDisc
     */
    public double getSalesDisc() {
        return salesDisc;
    }

    /**
     * @param salesDisc the salesDisc to set
     */
    public void setSalesDisc(double salesDisc) {
        this.salesDisc = salesDisc;
    }

    /**
     * @param dbo the dbo to set
     */
    public void setDbo(DBOperations dbo) {
        this.dbo = dbo;
    }

    /**
     * @param suplier the suplier to set
     */
    public void setSuplier(String suplier) {
        this.suplier = suplier;
    }

    /**
     * @return the selPrice
     */
    public double getSelPrice() {
        return selPrice;
    }

    /**
     * @param selPrice the selPrice to set
     */
    public void setSelPrice(double selPrice) {
        this.selPrice = selPrice;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the complin
     */
    

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the complain
     */
    public String getComplain() {
        return complain;
    }

    /**
     * @param complain the complain to set
     */
    public void setComplain(String complain) {
        this.complain = complain;
    }
    
}
