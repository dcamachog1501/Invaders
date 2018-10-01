/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes_Jugador;

import Ventanas.Gestor2;
import java.awt.*;

/**
 *Clase encargada de instanciar la bala del juego.
 * @author Daniel Camacho
 */
public class Bullet
{
    private final Image Shoot=Toolkit.getDefaultToolkit().getImage(getClass().getClassLoader().getResource("Resources/Disparos/Shoot.png"));
    private final Gestor2 gestor;
    private int Bullx;
    private int Bully;
    private int cond;
    private Rectangle recb;
    /**
     * Constructor del objeto bala
     * @param gest Objeto gestor de la bala.
     * @param x Coordenadas en X de la bala.
     * @param y Coordenadas en Y de la bala.
     */
    public Bullet(Gestor2 gest,int x, int y)
    {
        this.gestor=gest;
        this.Bullx=x;
        this.Bully=y;
        this.recb= new Rectangle(Bullx,Bully,24,24);
        this.cond=0;
    }
    /**
     * Metodo que permite dibujar la bala en el canvas de la ventana juego.
     * @param g parametro graficos.
     */
    public void Render(Graphics g)
    {
      g.drawImage(Shoot, Bullx, Bully,gestor.getGame().getCanvas());
    
    }
    /**
     * Metodo que incrementa la posicion en x de la bala.
     * @param x valor del incremento en X.
     */
    public void chnBullx(int x)
    {
        Bullx+=x;
    }
    /**
     * Metodo que incrementa la posicion en Y de la bala.
     * @param y valor e incremento en Y.
     */
    public void chnBully(int y)
    {
        Bully+=y;
    }
    /**
     * Metodo que establece el valor de la coordenada en X de la bala.
     * @param x Valor de la coordenada en X de la bala.
     */
    public void setBullx(int x)
    {
        Bullx=x;
    }
    /**
     * Metodo que estabece el valor de la coordenada en Y de la bala.
     * @param y Valor de la coordenada en Y de la bala.
     */
    public void setBully(int y)
    {
        Bully=y;
    }
    
    /**
     * Metodo que retorna el valor de la coordenada en X de la bala.
     * @return Valor de la coordenada en X de la bala.
     */
    public int getBullx()
    {
        return Bullx;
    }
    /**
     * Metodo que retorn el valor de la coordenada en Y de la bala
     * @return Valor de la coordenada en Y de la bala.
     */
    public int getBully()
    {
        return Bully;
    }
    /**
     * Metodo que cambia la condicion de la bala
     */
    public void chnCond()
    {
        if(cond==0)
        {
            cond=1;
        }
        else
        {
            cond=0;
        }
    }
    /**
     * Metodo que retorna la condicin de la bala.
     * @return booleano.
     */
    public int getCond()
    {
        return cond;
    }
    /**
     * Metodo que modifica el valor de la condicion de la bala para que sea 0.
     */
    public void stnCond()
    {
        this.cond=0;
    }
}   
