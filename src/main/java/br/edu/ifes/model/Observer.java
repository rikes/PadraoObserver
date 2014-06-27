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
public interface Observer {
    public void update(AtualizaDados dados);
}
