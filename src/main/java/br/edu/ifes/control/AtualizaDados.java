/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifes.control;


import br.edu.ifes.model.Observer;
import java.util.HashSet;
import java.util.Observable;
import java.util.Set;

/**
 *
 * @author Henrique
 */
//Classe responsanvel pelo controle de dados, faz as devidas alterações
//Eh o Subject
public class AtualizaDados {
    private double graus;
    private Set<Observer> interessados = new HashSet<Observer>();
    //Observer interessado;
    
    public void addObserverInteressado(Observer ob){
        this.interessados.add(ob);
    }
    public void deleteObserverInteressado(Observer ob){
        this.interessados.remove(ob);
    }
    public double getTemperatura(){
        return this.graus;
    }
    public void notifyObserversInteressados(double mediaSensores){
        this.graus = mediaSensores;
        for (Observer interessado : this.interessados){
            interessado.update(this);
        }
    }
}
