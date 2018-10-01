/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Componentes_Jugador.Nave;
import Componentes_Jugador.Bullet;
import Ventanas.Gestor2;
import java.awt.*;

/**
 *Clase encargada de instanciar administradores del juego.
 * @author Daniel Camacho 
 * 
 */
public class GameManager 
{
    private Gestor2 gestor;
    private Nave nave;
    private Bullet bala;
    
    
    
    public GameManager()
    {
        
    }
    /**
     * Constructor de la clase GameManager
     * @param gest Objeto Gestor2
     * @param bala Objeto Bullet
     * @param nave Objeto Nave
     */
    public GameManager(Gestor2 gest,Bullet bala,Nave nave)
    {
        this.gestor=gest;
        this.nave=nave;
        this.bala=bala;
        
    }
    /**
     * Metodo que permite dibujar en el canvas todos los componentes del juego.
     * @param g Graficos
     */
    public void render(Graphics g)
    {
        try{
            gestor.getGame().getLManager().getCurrent().Render(g,gestor.getGame().getCanvas());
        }catch(Exception e){
            //render(g);
        }
        try
        {
            if (!gestor.getGame().getCond())
            {
            nave.render(g);
            }
            else
            {
            nave.render(g);
            bala.Render(g);
            }
        }
        catch(Exception e)
        {
            
        }
        
    }
    /**
     * Metodo que retorna la nave del manager.
     * @return Objeto Nave.
     */
    public Nave getNav()
    {
        return nave;
    }
    /**
     * Metodo que retorna el objeto Bullet del manager.
     * @return Objeto Bullet.
     */
   public Bullet getBull()
   {
       return bala;
   }
  
   
}
