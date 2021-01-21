/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

/**
 *
 * @author hcadavid
 */
public class CountThreadsMain {
    
    public static void main(String a[]){
        
    	CountThread primerRango = new CountThread(0,99);
    	CountThread segundoRango = new CountThread(99,199);
    	CountThread tercerRango = new CountThread(199,299);
    	
    	primerRango.run();
    	segundoRango.run();
    	tercerRango.run();
    }
    
}
