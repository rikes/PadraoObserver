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
public class ObserverTemperaturaExterna implements Observer{
    
    @Override
    
    public void update(AtualizaDados dados) {
        Sensores sensores = new Sensores();
        double sensorExterno = sensores.getSensores();
        System.out.println("Temperatura Externa "+sensorExterno +"º");
    }
}
