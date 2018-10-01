/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hileras;

import Fabrica_Hileras.Line_Creator;
import Ventanas.Gestor2;

/**
 *Clase encargada de instanciar superfabricas de hileras
 * @author Daniel Camacho
 */
public class Hileras_GUI 
{
    /**
     * Metodo encargado de instanciar hileras dependiendo del tipo requerido.
     * @param linefactory Fabrica de enemigos.
     * @param gest Objeto Gestor2.
     * @param lvl Nivel actual.
     * @return Line hilera
     */
    public Line buildHilera(Line_Creator linefactory,Gestor2 gest, int lvl)
    {
        Line hilera=linefactory.createLine(gest,lvl);
        return hilera;
    }
}
