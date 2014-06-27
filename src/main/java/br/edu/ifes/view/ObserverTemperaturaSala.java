/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.view;

import br.edu.ifes.control.AtualizaDados;
import br.edu.ifes.model.Observer;

/**
 *
 * @author Henrique
 */
public class ObserverTemperaturaSala implements Observer{
    public static final int TEMPERATURA_MAXIMA = 25;
    
    @Override
    public void update(AtualizaDados dados) {
        double sensorExterno = dados.getTemperatura();
        if(sensorExterno < TEMPERATURA_MAXIMA){
            System.out.println("Temperatura Abaixo dos 25º ");
        }else if(sensorExterno > TEMPERATURA_MAXIMA){
            System.out.println("Temperatura Acima dos 25º ");
        }else if(sensorExterno == TEMPERATURA_MAXIMA){
            System.out.println("Temperatura Ideal");
        }
    }
    
}
