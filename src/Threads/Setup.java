/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

import Componentes_Jugador.Bullet;
import Componentes_Jugador.Nave;
import Manager.GameManager;
import Ventanas.Gestor2;
import java.awt.*;
import java.awt.image.BufferStrategy;

/**
 *Clase encargada de instanciar el thread principal del juego.
 * @author Daniel Camacho 
 */
public class Setup implements Runnable
{
    private GameManager manager;
    private Thread update;
    private boolean runnig;
    private Gestor2 gestor;
    private BufferStrategy buffer;
    private Graphics g;
    private Bullet bala;
    private Nave nave;
    private double TimeperTick;
    public Setup()
    {
        
    }
    /**
     * Cosntructor de la clase Setup
     * @param g Graphics g
     * @param nav Nave nav
     */
    public Setup(Gestor2 g, Nave nav)
    {
        gestor = g;
        nave=nav;
        bala= new Bullet(gestor,nave.getNavx(),nave.getNavy());
    }
    /**
     * Metodo que inicializa el Setup 
     */
    public void init()
    {
        gestor.gestJuego();
        manager=new GameManager(gestor,getBull(),getNave());
        
    }
    /**
     * Metodo que hace empezar las funciones del thread.
     */
    public synchronized void start()
    {
        if (runnig)
            return;
            runnig=true;
        if (update== null)
        {
        update= new Thread(this);
        update.start();
        }
    }
    /**
     * Metodo que detiene la ejecucion del thread.
     */
    public synchronized void stop()
    {
        runnig=false;
        if(runnig==false)
            return;
            runnig=false;
        try 
        {
            update.join();
        }
        catch (Throwable e) 
        {
            e.printStackTrace();
        }
    }
    /**
     * Metodo encargado de dibujar todo lo que refiere con el juego.
     */
    public void render()
    {
        try
        {
        buffer=gestor.getGame().getCanvas().getBufferStrategy();
        }
        catch(Exception e)
        {
            
        }
        if(buffer==null)
                {
                    gestor.getGame().getCanvas().createBufferStrategy(3);
                    return;
                }
        g=buffer.getDrawGraphics();
        g.clearRect(0,0,985,670);
        // inicio de graficacion
        
        manager.render(g);
        
        //fin de graficacion
        buffer.show();
        g.dispose();
    }
  
    @Override
    public void run()
    {
       init();
       int fps= 60;
       TimeperTick=1000000000/fps;
       double delta=0;
       long current=System.nanoTime();
       while(runnig)
       {
           delta=delta+((System.nanoTime())-current)/TimeperTick;
           current=System.nanoTime();
           if(delta>=1)
           {
              render(); 
              delta--;
           }
           
       }
    }
    /**
     * Metodo que retorna el manager del Setup
     * @return LManager manager
     */
    public GameManager getMan()
    {
        return manager;
    }
    /**
     * Metodo que devuelve el tiempo de la ejecucion.
     * @return double TimeperTick
     */
    public double getTime()
    {
        return TimeperTick;
    }
    /**
     * Metodo que retorna el objeto Bullet del Setup.
     * @return  double TimeperTick
     */
    public Bullet getBull()
    {
        return bala;
    }
    /**
     * Metodo que retorna el objeto Nave del Setup.
     * @return  Nave nave
     */
    public Nave getNave()
    {
        return nave;
    }
}
