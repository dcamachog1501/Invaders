/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigos;

import Fabrica_Enemigos.Enemy_Creator;
import Ventanas.Gestor2;

/**
 *Clase encargada de instanciar una super fabrica de enemigos.
 * @author Daniel_Camacho
 */
public class Enemy_GUI 
{
    /**
     * Metodo encargado de insatnciar enemigos de todos los tipos implementados.
     * @param enemyfactory Fabrica de enemigos.
     * @param x Coordenada en X del enemigo.
     * @param y Coordenada en Y del enemigo.
     * @param sup Limite superior del enemigo.
     * @param dir Direccion del enemigo(0 o 1)
     * @param gest Objeto gestor del enemigo. 
     * @param lvl Nivel actual.
     * @param h Vida asignada del enemigo.
     * @return Objeto enemigo.
     */
    public Enemy buildEnemy(Enemy_Creator enemyfactory, int x, int y,int sup,int dir,Gestor2 gest,int lvl, int h,int s)
    {
        Enemy enm= enemyfactory.createEnemy(x, y, sup,dir,gest,lvl,h,s);
        return enm;
    }
}