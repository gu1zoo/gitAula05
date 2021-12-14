/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * @author IFSC
 */
public class Calculadora {
    public int somar(int n1, int n2){
        int soma = n1 + n2;
        return soma;
    }
    public int somar(int n1, int n2, int n3){
        int soma = n1 + n2 + n3;
        return soma;
    }
    public double somar(double n1, double n2){
        double soma = n1 + n2;
        return soma;
    }

}
