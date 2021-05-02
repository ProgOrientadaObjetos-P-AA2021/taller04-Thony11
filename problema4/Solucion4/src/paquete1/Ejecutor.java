/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Lenovo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nom = "Anthony Celi";
        String nomBan = "Banco Pichincha";
        double valChe = 4000.45;

        String nom2 = "Gabriel Villalta";
        String nomBan2 = "Banco del Austro";
        double valChe2 = 5300.45;

        Cheque cheq1 = new Cheque(nom, nomBan, valChe);
        cheq1.establecerNombreCliente(nom);
        cheq1.establecerNombreBanco(nomBan);
        cheq1.establecerValorCheque(valChe);
        cheq1.establecerComisionCobrar();
        System.out.printf("%s\n", cheq1);

        Cheque cheq2 = new Cheque(nom2, nomBan2, valChe2);
        cheq2.establecerNombreCliente(nom2);
        cheq2.establecerNombreBanco(nomBan2);
        cheq2.establecerValorCheque(valChe2);
        cheq2.establecerComisionCobrar();
        System.out.printf("\n%s\n", cheq2);

    }

}
