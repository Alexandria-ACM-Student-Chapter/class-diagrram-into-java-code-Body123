/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoiceitem;

/**
 *
 * @author Sakr
 */
public class InvoiceItem1 {
    private String id;
    private String desc;
    private int qty;
    private double unitprice;

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the unitprice
     */
    public double getUnitprice() {
        return unitprice;
    }

    /**
     * @param unitprice the unitprice to set
     */
    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }
    public double total() {
        return this.unitprice*this.qty;
    }
    public String tostring() {
        String s="\"InvoiceItem1 [id"+this.getId()+"desc"+this.getDesc()+"qty"+this.getQty()+"unitprice"+this.getUnitprice()+" ]" ;
        
        return s;
    
    }
    
    
    
}
