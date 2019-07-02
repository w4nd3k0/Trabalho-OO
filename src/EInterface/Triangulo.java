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
public class Triangulo implements FiguraGeometrica {
 
    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;
 
    //get's
 
    public int getBase() {
        return base;
    }
    
    public int getAltura() {
        return altura;
    }
    
    public int getLadoA() {
        return ladoA;
    }
     
    public int getLadoB() {
        return ladoB;
    } 
    
    public int getLadoC() {
        return ladoC;
    }
    
    //Set's
    
    public void setBase(int s) {
        this.base = s;
    }
    
    public void setAltura(int l) {
        this.altura = l;
    }
 
    public void setLadoA(int a) {
        this.ladoA = a;
    }
 
    public void setLadoB(int b) {
        this.ladoB = b;
    }
  
    public void setLadoC(int c) {
        this.ladoC = c;
    }
    
    //Construtor
    
    public Triangulo(int s, int l, int a, int b, int c){
        this.setBase(s);
        this.setAltura(l);
        this.setLadoA(a);
        this.setLadoB(b);
        this.setLadoC(c);
    }
    
    //metódos da Interface
    
    //Nome da Figura
    public String NomeFigura() {
        return "Triangulo";
    }
    
    //Calcular Area
    public int Area() {
        int area = 0;
        area = (this.getBase() * this.getAltura()) / 2;
        return area;
    }
    
    //Calcular Perimetro
    public int Perimetro() {
        int perimetro = 0;
        perimetro = (this.getLadoA()+this.getLadoB()+this.getLadoC());
        return perimetro;
    }
}
