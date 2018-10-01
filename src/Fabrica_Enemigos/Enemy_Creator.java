/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_Enemigos;

import Enemigos.Enemy;
import Ventanas.Gestor2;

/**
 *Interfaz base de las fabricas de enemigos
 * @author Daniel Camacho
 */
public interface Enemy_Creator
{
    /**
     * Metodo encargado de generar enemigos del tipo especificado.
     * @param x Coordenada en X del enemigo.
     * @param y Coordenada en Y del enemigo.
     * @param sup Valor del limite superior del enemigo.
     * @param dir Valor de la direccion del enemigo(0 o 1).
     * @param gest Objeto gestor del enemigo.
     * @param lvl Nivel actual.
     * @param h Valor de la salud del enemigo.
     * @return Objeto Enemy instanciado.
     */
    public Enemy createEnemy(int x, int y, int sup,int dir,Gestor2 gest, int lvl, int h,int s);
}
