/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomppermoritztontauben;
import java.awt.Graphics;
import java.math.*;
/**
 *
 * @author Moritz.Gompper
 */
public abstract class Tontaube {
    private static int dieAnzahlTontauben;
    protected int dieGroesse;
    protected int xPos;
    protected int yPos;
    protected int tempY;
    protected boolean sichtbar;
    
    public int gibGroesse(){
        return dieGroesse;
    }
    public int gibXPos(){
        return xPos;
    }
    
    public int gibYPos(){
        return yPos;
    }
    public void setzteXPos(int x){
       xPos = x; 
    }
    public void setzteYPos(int y){
       yPos = y; 
       tempY = y;
    }  
    public void setzeSichtbar(boolean pWert){
        pWert = sichtbar;
    }
    
    public boolean gibSichtbar(){
        return sichtbar;
    }
    
    public int gibAnzahlTontauben(){
        return dieAnzahlTontauben;
    }
    
    public void zeichne(Graphics g){
        g.fillOval( xPos, yPos, 30, 30);
        
    }
    
    public abstract void berechnePosition();     
    
}
