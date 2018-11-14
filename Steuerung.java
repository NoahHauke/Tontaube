/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomppermoritztontauben;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Timer;
/**
 *
 * @author Moritz.Gompper
 */
public class Steuerung {
    
    private int dieAnzahlTreffer;
    private int anzahlBaelle;
    private Random wuerfel = new Random();
    private int Intervall = 10;
    private Oberflaeche o;
    
    private Timer t = new javax.swing.Timer(Intervall,new ActionListener() {
     
            public void actionPerformed(ActionEvent ae) {
                for(int i = 0; i <= 5; i++){
                    dieTontaube[i].berechnePosition();
                    System.out.println(""+o.getHeight());
                }
                o.repaint();
            }
        }
        );
    
    Tontaube[]dieTontaube = new Tontaube[6];
    
    public Steuerung(Oberflaeche o){
        this.o = o;
        initObjekte();
        t.start();
        
    }
    public void zeichneObjekte(Graphics g){
        
        for(int i = 0; i <= 5; i++){
            dieTontaube[i].zeichne(g);
        }
        
    }
    
    public void initObjekte(){
        for(int i = 0; i <= 5; i++){
            dieTontaube[i] = new Tontaube1();
            dieTontaube[i].setzteYPos(wuerfel.nextInt(300));
            System.out.println(""+dieTontaube[i].gibYPos());
            dieTontaube[i].setzeSichtbar(true);
        }
        
    }
    
    
    
    
    public void feuer(){

    }
    
    public boolean pruefeObGetroffen(){
        return true;
    }
    public void verarbeiteTick(){
        
    }
    
    
}
