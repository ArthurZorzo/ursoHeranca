/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca;

/**
 *
 * @author IFSC
 */
public class Mamifero {
    protected String familia;
    
    public Mamifero(){
        
    }
    
    public void respirar(){
        System.out.println("respirando");
    }
    
    public void mamar(){
        System.out.println("mamando");
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }
}
