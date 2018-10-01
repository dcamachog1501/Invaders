/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enemigos;

import Ventanas.Gestor2;
import java.awt.*;

/**
 * Interfaz base para los enemigos.
 * @author Daniel Camacho 
 */
public interface Enemy 
{
    /**
     * Mètodo encargado de inicializar el tipo de enemigo.
     */
    public void setType();
    
    /**
     * Metodo encargado de inicializar la imagen del enemigo.
     */
    public void setFace();
    
    /**
     * Metodo encargado de etsablecer la vida de un enemigo.
     * @param h Cantidad de vidas del enemigo.
     */
    public void setHealth(int h);
    
    /**
     * Metodo encargado de indicar la direccion del enemigo;
     * @param dir Numero que indica la direccion del movimiento del enemigo(1 o 0).
     */
    public void setDir(int dir);
    
    /**
     * Metodo que establece el enemigo que le sigue al enemigo actual.
     * @param enm Objeto Enemy  
     */
    public void setNext(Enemy enm);
    
    /**
     * Metodo que establece el limite superior hasta el que puede moverse la hilera en caso de que este enemigo sea la cabeza de la misma.
     * @param sup Coordenada en X.
     */
    public void setSup(int sup);
    
    /**
     * Metodo que establece la velocidad predeterminada del enemigo a la hora de moverse.
     * @param x Velocidad que recibe el enemigo.
     */
    public void setSpeed(int x);
    
    /**
     * Metodo que establece el puntaje que devuelve cada enemigo.
     */
    public void setPunt();
    
    /**
     * Metodo que asigna la posicion en X del enemigo.
     * @param x Coordenada en X
     */
    public void setX(int x);
    
    /**
     * Metodo que asigna la posicion en Y del enemigo.
     * @param y Coordenada en Y
     */
    public void setY(int y);
    
    /**
     * MEtodo que retorna el limite superior del enemigo.
     * @return Limite superior del enemigo.
     */
    public int getSup();
    
    /**
     * Metodo que retorna el enemigo que le sigue al enemigo en cuestion.
     * @return Objeto Enemy.
     */
    public Enemy getNext();
    
    /**
     * Metodo que retorna la posicion en Y del enemigo.
     * @return Coordenada en X
     */
    public int getX();
    
    /**
     * Metodo que retorna la coordenada en Y del enemigo.
     * @return Coordenada en Y
     */
    public int getY();
    
    /**
     * Metodo que retorna la imagen del enemigo 
     * @return Imagen del enemigo.
     */
    public Image getFace();
    
    /**
     * Metodo que incrementa la posicion en X del enemigo para generar el movimiento.
     */
    public void chnX();
    
    /**
     * Metodo que incrementa la posicion en Y del enemigo para generar el movimiento.
     */
    public void chnY();
    
    /**
     * Metodo que cambia la direccion del enemigo durante el movimiento.
     */
    public void chnDir();
    
    /**
     * Metodo que retorna el puntaje almacenado por un enemigo.
     * @return puntaje del enemigo.
     */
    public int getPunt();  
    
    /**
     * Metodo que inicializa las variables del enemigo.
     * @param x Coordenada en X.
     * @param y Coordenada en Y.
     * @param sup Limite superior.
     * @param dir Direccion(1 o 0).
     * @param gest Objeto Gestor2.
     * @param lvl Nivel actual.
     * @param h Vida del enemigo.
     */
    public void Init(int x,int y,int sup,int dir, Gestor2 gest,int lvl,int h,int s);
    
    /**
     * Metodo que retorna a salud actual del enemigo.
     * @return Valor de la salud del enemigo.
     */
    public int getHealth();
    
    /**
     * Metodo que decrementa el valor de la salud del enemigo.
     * @param x Cantidda de salud a restar.
     */
    public void chnHealth(int x);
    /**
     * Metodo que retorna el avlos de la velocidad del enemigo.
     * @return int speed
     */
    public int getSpeed();
    
    /**
     * Metodo que estbalece el objeto gestor del enemigo.
     * @param gest Objeto gestor
     */
    public void setGest(Gestor2 gest);
    
    /**
     * Metodo que verifica si el enemigo es un jefe
     * @return booleano.
     */
    public Boolean isBoss();
    
    /**
     * Metodo que altera el valor de las coordenadas en X de un enemigo.
     * @param x Valor entero de se resta o suma a la coordenada en X del enemigo.
     */
    public void newx(int x);
    
    /**
     * Metodo que retorna el valor de la direccion 
     * @return int dir
     */
    public int getDir();
}