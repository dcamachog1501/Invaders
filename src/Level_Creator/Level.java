/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level_Creator;

import Fabrica_Hileras.A_Line_Creator;
import Fabrica_Hileras.B_Line_Creator;
import Fabrica_Hileras.Basic_Line_Creator;
import Fabrica_Hileras.C_Line_Creator;
import Fabrica_Hileras.D_Line_Creator;
import Fabrica_Hileras.E_Line_Creator;
import Hileras.Hileras_GUI;
import Hileras.Line;
import Ventanas.Gestor2;
import java.util.Random;

/**
 *Clase encargada de instanciar niveles.
 * @author Daniel Camacho
 */
public class Level 
{
    private Line Head;
    private int len;
    private int lenmax;
    private int current;
    private Gestor2 gestor;
    private Hileras_GUI GUI;
    private Basic_Line_Creator basic;
    private A_Line_Creator atype;
    private B_Line_Creator btype;
    private C_Line_Creator ctype;
    private D_Line_Creator dtype;
    private E_Line_Creator etype;
    /**
     * Constructor de la clase Level
     * @param x Entero que representa el nivel actual.
     * @param gest Objeto Gestor2 
     */
    public Level(int x,Gestor2 gest)
    {
      this.current=x;
      this.Head=null;
      this.len=0;
      this.lenmax=3;
      this.gestor=gest;
      this.GUI= new Hileras_GUI();
      this.basic= new Basic_Line_Creator();
      this.atype= new A_Line_Creator();
      this.btype=new B_Line_Creator();
      this.ctype= new C_Line_Creator();
      this.dtype= new D_Line_Creator();
      this.etype= new E_Line_Creator();
    }
    /**
     * Metodo que genera hileras al azar.
     * @return  Line hilera.
     */
    public Line getLine()
    {
        Line l=null;
        if(current>=0 && current<3)
        {
          Random r= new Random();
          int rnd=r.nextInt(3);
          if(rnd==0)
          {
           l=GUI.buildHilera(this.basic, this.gestor,this.current);
          }
          else if(rnd==1)
          {
             l=GUI.buildHilera(this.atype,this.gestor,this.current);
          }
          else if (rnd==2)
          {
              l=GUI.buildHilera(this.btype,this.gestor,this.current);
          }
        }
        else if(current>=3)
        {
          Random r= new Random();
          int rnd=r.nextInt(6);
          if(rnd==0)
          {
             l=GUI.buildHilera(this.basic, this.gestor,this.current);
          }
          else if(rnd==1)
          {
             l=GUI.buildHilera(this.atype,this.gestor,this.current);
          }
          else if (rnd==2)
          {
              l=GUI.buildHilera(this.btype,this.gestor,this.current);
          }
          else if(rnd==3)
          {
              l=GUI.buildHilera(this.ctype,this.gestor,this.current);
          }
          else if(rnd==4)
          {
              l=GUI.buildHilera(this.dtype,this.gestor,this.current);
          }
          else if(rnd==5)
          {
              l=GUI.buildHilera(this.etype, this.gestor,this.current);
          }
        }
        return l;
    }
    /**
     * Metodo que añade las hileras al nivel.
     */
    public void adder()
    {
        Line enm=this.getLine();
        if(this.Head==null)
        {
            this.Head=enm;
            len++;
        }
        else
        {
          Line temp=this.Head;
          while(temp.getNext()!=null)
          {
              temp=temp.getNext();
          }
          temp.setNext(enm);
          len++;
        }
    }
    /**
     * Metodo que genra un nivel y lo llena con 3 hileras.
     */
    public void generateLevel()
    {
      while(len<lenmax)
      {
          this.adder();
      }
    }
    /**
     * Metodo que retorna la lista en la cabeza del nivel.
     * @return Line hilera.
     */
    public Line getHead()
    {
        return this.Head;
    }
    /**
     * Metodo que retorna el valor de la longitud de la lista.
     * @return int len
     */
    public int getLen()
    {
        return this.len;
    }
    /**
     * Metodo que hace decrecer el valor de la lista.
     * @param x Entero que representa la cantidad que decrece la longitud. 
     */
    public void chnLen(int x)
    {
        this.len-=x;
    }
}
