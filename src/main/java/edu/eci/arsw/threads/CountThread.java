/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.threads;

import java.util.ArrayList;

/**
 *
 * @author hcadavid
 */

//Se extiende la clase CountThread de la Clase Thread

public class CountThread extends Thread{
	
    private int A; //Se crea la variable A
	private int B; //Se crea la variable B

	public CountThread(int A, int B) {
    	this.A = A;
    	this.B = B;
	}

	public void run() {
		for (int i = A; i <= B; i++) {
			System.out.println(i);
		}
	}
}


