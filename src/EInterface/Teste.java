/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EInterface;

/**
 *
 * @author W4ND3K0
 */
public class Teste {
    
    public static void main(String[] args) {
        
        //Triangulo
        
        Triangulo t1 = new Triangulo(10, 5, 3, 4, 5);
        System.out.println(t1.NomeFigura());
        System.out.println(t1.Area());
        System.out.println(t1.Perimetro());
        
        //Quadrado
        
        Quadrado q1 = new Quadrado(5);
        System.out.println(q1.NomeFigura());
        System.out.println(q1.Area());
        System.out.println(q1.Perimetro());
    }
    
}
