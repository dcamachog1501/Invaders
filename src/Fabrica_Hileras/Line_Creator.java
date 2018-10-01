/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_Hileras;

import Hileras.Line;
import Ventanas.Gestor2;

/**
 *Interfaz base para la creacion de fabricas de hileras.
 * @author Daniel Camacho
 */
public interface Line_Creator 
{
    /**
     * Metodo encargado de instanciar hileras del tipo especificado
     * @param gest Objeto gestor de la hilera.
     * @param lvl Nivel actual.
     * @return Objeto Line instanciado.
     */
    public Line createLine(Gestor2 gest,int lvl);
}
