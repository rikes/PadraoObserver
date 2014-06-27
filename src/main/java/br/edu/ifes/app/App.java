/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.app;

import br.edu.ifes.control.AtualizaDados;
import br.edu.ifes.view.ObserverTemperaturaSala;
import br.edu.ifes.model.Sensores;
import java.util.Random;

/**
 *
 * @author Henrique
 */
public class App {

    public static void main(String[] args) {
        Random gerador = new Random();
        Sensores sensores = new Sensores();
        ObserverTemperaturaSala tempSala = new ObserverTemperaturaSala();  
        
        int s1 = gerador.nextInt(50);
        int s2 = gerador.nextInt(50);
        int s3 = gerador.nextInt(50);       
        
        sensores.addObserverInteressado(tempSala);
        sensores.setSensores(s1, s2, s3);
        
        
        
        
        
        System.out.println(sensores.getSensores());
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
 
        
        
    }
    
}
