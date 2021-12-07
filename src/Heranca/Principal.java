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
public class Principal {
    public static void main(String[] args) {
        Urso urso = new Urso();
        
        urso.setAltura(1.90);
        urso.setPeso(90.5);
        urso.setFamilia("teste");
        urso.atacar();
        urso.comer();
        urso.respirar();
        urso.mamar();
        urso.hibernar();
        
        System.out.println("\n");
        System.out.println("Informações sobre o Urso: ");
        urso.imprimeUrso();
    }
}
