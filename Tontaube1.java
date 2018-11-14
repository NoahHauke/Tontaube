/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomppermoritztontauben;

import static java.lang.Math.sin;

/**
 *
 * @author Moritz.Gompper
 */
public class Tontaube1 extends Tontaube {
    public Tontaube1(){
        
    }
    @Override
    public void berechnePosition() {
        xPos++;
        
        yPos= (int) (Math.sin(xPos) + tempY) *2;
    }
    
}
