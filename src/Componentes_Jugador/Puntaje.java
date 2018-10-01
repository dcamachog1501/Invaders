/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes_Jugador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Calse encargada de instanciar el objeto puntaje para el leaderboard.
 * @author Daniel Camacho
 */
public class Puntaje 
{
    private Player Head;
    private int len;
    private int lenmax;
    /**
     * Metodo que incialia las variables del objeto puntaje.
     */
    public void Init()
    {
        this.Head=null;
        this.len=0;
        this.lenmax=5;
    }
    /**
     * Metodo que añade obejtos player al puntaje.
     * @param pl objeto Player.
     */
    public void add(Player pl)
    {
     if(this.len==0)
     {
         this.Head=pl;
         len++;
     }
     else
     {
        Player temp=this.Head;
        while(temp.getNext()!=null)
        {
            temp=temp.getNext();
        }
        temp.setNext(pl);
        len++;
     }
    }
    /**
     * Metodo que permite añadir objetos player al puntaje y modificar el marcador.
     * @param ind posicion del objeto Player.
     * @param pl objeto Player.
     */
    public void modify(int ind, Player pl)
    {
        int cont=0;
        Player temp=this.Head;
        while(true)
        {
           if(cont+1==ind) 
           {
               pl.setNext(temp.getNext().getNext());
               temp.setNext(pl);
               break;
           }
           temp=temp.getNext();
           cont++;
        }
    }
   /**
    * Metodo que genera la lista de puntajes maximos.
    * @throws FileNotFoundException
    * @throws IOException 
    */
   public void createPunt() throws FileNotFoundException, IOException
   {
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("Resources/Puntaje/Puntaje.txt");
        BufferedReader reader= new BufferedReader(new InputStreamReader(is));
        int ind=0;
        String line=reader.readLine();
        while(ind<lenmax)
        {
            Player p= new Player();
            String[] stringarray = line.split(",");
            p.setName(stringarray[0]);
            int punt=Integer.parseInt(stringarray[1]);
            p.setPunt(punt);
            this.add(p);
            line=reader.readLine();
            ind++;
            
           
        }
        reader.close();
   }
   /**
    * Metodo que retorna el objeto Player que esta al inicio del puntaje.
    * @return objeto Player
    */
   public Player getHead()
   {
       return this.Head;
   }
   /**
    * Metodo que retirna el objeto Player almacenado en determinada posicion.
    * @param x posicion del objeto Player.
    * @return 
    */
   public Player getPos(int x)
   {
    int ind=0;
    Player temp=getHead();
    while(ind!=x)
    {
       temp=temp.getNext();
       ind++;
    }
    return temp; 
   }
   /**
    * Metodo que guarda la lista de punatjes maximos una vez finalizada la partida.
    * @param newP puntaje obtenido por el jugador.
    */
   public void save(Player newP)
   {
     Player temp=this.Head;
     while(temp!=null)
     {
         if(newP.getPunt()>temp.getPunt())
         {
             Player temp2= new Player();
             temp2.setName(temp.getName());
             temp2.setPunt(temp.getPunt());
             temp.setPunt(newP.getPunt());
             temp.setName(newP.getName());
             save(temp2);
             break;
         }
         temp=temp.getNext();
     }
     PrintWriter writer=null;
        try 
        {
            File f= new File("src/Resources/Puntaje/Puntaje.txt");
            writer = new PrintWriter(f);
        } catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Puntaje.class.getName()).log(Level.SEVERE, null, ex);
        }
    writer.print("");
    temp= this.Head;
    boolean cond=true;
    while(temp!=null)
    {
        {
        String puntaje=temp.getName()+","+temp.getPunt();
        writer.println(puntaje);
        temp=temp.getNext();
        }
    }
    writer.close();
   }
    
}
