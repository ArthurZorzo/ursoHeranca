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
public class Urso extends Mamifero{
    private double altura;
    private double peso;
    
    public Urso(){
        
    }
    
    public void imprimeUrso(){
        System.out.println("Altura: "+altura);
        System.out.println("Peso: "+peso);
        System.out.println("Familia: "+familia); 
    }
    
    public void atacar(){
        System.out.println("Atacando");
    }
    
    public void hibernar(){
        System.out.println("Dormindo");
    }
    
    public void comer(){
        System.out.println("Comendo");
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
