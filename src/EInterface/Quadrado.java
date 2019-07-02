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
public class Quadrado implements FiguraGeometrica {
 
    private int lado;
    
    //Get's
    
    public int getLado() {
        return lado;
    }
 
    //Set's
    public void setLado(int l) {
        this.lado = l;
    }
    
    //Construtor
    
    public Quadrado(int l){
        this.setLado(l);
    }

    //metódos da Interface
    
    //Nome Figura
    public String NomeFigura() {
        return "quadrado";
    }
    
    //Calcular Area
    public int Area() {
        int area = 0;
        area = (this.getLado() * this.getLado());
        return area;
    }
    
    //Calcular Perimetro
    public int Perimetro() {
        int perimetro = 0;
        perimetro = (this.getLado() * 4);
        return perimetro;
    }
}
