/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.model;

import br.edu.ifes.control.AtualizaDados;

/**
 *
 * @author Henrique
 */
//Classe que 
public class Sensores extends AtualizaDados{
    private double mediaSensor;
    
    public Sensores(){
        mediaSensor = 0;
    }    
    public void setSensores(int s1, int s2, int s3){
        this.mediaSensor = (s1 + s2 + s3)/3;
        notifyObserversInteressados(this.mediaSensor);
    }
    public double getSensores(){
        return this.mediaSensor;
    }
}
