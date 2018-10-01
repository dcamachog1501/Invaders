/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import Ventanas.Gestor2;

/**
 *Clase de tipo Thread encargada de modificar las coordenadas en x de la nave
 * @author Daniel Camacho
 */
public class Left implements Runnable 
{
private final Gestor2 gestor;
private int Navx;
private boolean cond;
private boolean bool;
/**
 * Constructor de la clase Left
 * @param gest Gestor2 gest. 
 */
public Left(Gestor2 gest)
{
    this.gestor=gest;
    this.Navx=gestor.getDatos().getNave().getNavx();
    this.cond=false;
    this.bool=true;
}
    

    @Override
    public void run() 
    {
      while(bool)
      {
        if(cond==true)
        {
            if(gestor.getDatos().getNave().getNavx()>0)
                    {
                     gestor.getDatos().getNave().chnNavx(gestor.getDatos().getNave().getNavx()-5);
                     try
                     {
                      Thread.sleep(10);
                     }
                     catch(Throwable e)
                     {
                         e.printStackTrace();
                     }
                    }
            else
                    {
                    gestor.getDatos().getNave().chnNavx(0);
                    }
        }
        else
            {
                try 
                {
                    Thread.sleep(0);
                } 
                catch (Throwable e) 
                {
                    e.printStackTrace();
                }
            }
      }
    }
    /**
     * Metodo que cambia el valor de la variable cond.
     */
    public void chnCond()
    {
        cond=!cond;
    }
    /**
     * Metodo que cambia el valor de la varible bool.
     */
    public void chnBool()
    {
        bool = !bool;
    }
}
