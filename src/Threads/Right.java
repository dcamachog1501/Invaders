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
public class Right implements Runnable
{
private final Gestor2 gestor;
private Boolean cond;
private boolean bool;
/**
 * Constructor de la clase Right.
 * @param gest Gestor2 gest. 
 */
public Right(Gestor2 gest)
{
    this.gestor=gest;
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
        if(gestor.getDatos().getNave().getNavx()<920)
                {
                 gestor.getDatos().getNave().chnNavx(gestor.getDatos().getNave().getNavx()+5);
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
                gestor.getDatos().getNave().chnNavx(920);
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
     * Metodo encargado de modificar el valor de la variable cond.
     */
    public void chnCond()
    {
        cond=!cond;
    }
    /**
     * Metodo encargado de cambiar el valor de la variable bool.
     */
    public void chnBool()
    {
        bool = !bool;
    }
}
