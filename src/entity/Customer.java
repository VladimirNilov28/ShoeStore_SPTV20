/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author user
 */
public class Customer {
    private String custumerName;
    private String custumerPhone;
    private int cusumerMoney;

    public Customer() {
    }
    
    public String getCustumerName() {
        return custumerName;
    }

    public void setCustumerName(String custumerName) {
        this.custumerName = custumerName;
    }

    public String getCustumerPhone() {
        return custumerPhone;
    }

    public void setCustumerPhone(String custumerPhone) {
        this.custumerPhone = custumerPhone;
    }

    public int getCusumerMoney() {
        return cusumerMoney;
    }

    public void setCusumerMoney(int cusumerMoney) {
        this.cusumerMoney = cusumerMoney;
    }

    @Override
    public String toString() {
        return "Customer{" + "custumerName=" + custumerName + ", custumerPhone=" + custumerPhone + ", cusumerMoney=" + cusumerMoney + '}';
    }
    
    
}
