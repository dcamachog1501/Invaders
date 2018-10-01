/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes_Jugador;

import Ventanas.Gestor2;
import java.awt.*;

/**
 * Clase encargada de instanciar la nave del jugador. 
 * @author Daniel Camacho
 */
public class Nave 
{
   private Gestor2 gestor;

   //Coordenadas de la nave
    private  int Navx=460;
    private  int Navy=605;
    /**
     * Constructor del objeto Nave.
     * @param gest Objeto gestor.
     */
   public Nave(Gestor2 gest)
   {
       this.gestor=gest;
   }
   /**
     * Metodo que permite dibujar la bala en el canvas de la ventana juego.
     * @param g parametro graficos.
     */
   public void render(Graphics g)
   {
    g.drawImage(gestor.getDatos().getNav(),Navx,Navy,gestor.getGame().getCanvas());
   }
   /**
    * Metodo que retorna el valor e la coordenada en X de la nave.
    * @return Coordenada en X de la nave.
    */
   public int getNavx()
   {
       return Navx;
   }
   /**
    * Metodo que retorna el valor de la coordenad en Y de la nave.
    * @return int Navy
    */
   public int getNavy()
   {
       return Navy;
   }
   /**
    * Metodo que cambia el valor de la coordenada en X por el valor X indicado. 
    * @param x Nueva posicion en X de la nave.
    */
   public void chnNavx(int x)
   {
       Navx=x;
   }
}
