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
public class Sensores extends AtualizaDados{
    double mediaSensor;
    
    public void setSensores(int s1, int s2, int s3){
        this.mediaSensor = (s1 + s2 + s3)/3;
    }
    public double getSensores(){
        return mediaSensor;
    }
}
