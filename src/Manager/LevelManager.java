/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

import Hileras.Hileras_GUI;
import Hileras.Line;
import Level_Creator.Level;
import Level_Creator.Level_Creator;
import Ventanas.Gestor2;

/**
 *Clase encargada de instanciar administradores de niveles.
 * @author Daniel Camacho
 */
public class LevelManager 
{
 int Level;
 Gestor2 gestor;
 Hileras_GUI gui;
 Line currentL;
 Level currentLvl;
 Object currentM;
 Level_Creator leveler;
 /**
  * Constructor de la clase LevelManager. 
  * @param gest Objeto Gestor2 
  */
 public LevelManager(Gestor2 gest)
 {
     this.Level=0;
     this.gestor=gest;
     this.leveler= new Level_Creator(gestor);
     this.currentLvl=leveler.createLevel(Level);
     this.currentL=currentLvl.getHead();
 }
 /**
  * Metodo que retorna la hilera actual.
  * @return Line hilera.
  */
 public Line getCurrent()
 {
     return currentL;
 }
 /**
  * Metodo que rellena el nivel en caso de estar vacio.
  */
 public void lvlUP()
 {
     this.currentLvl=leveler.createLevel(Level);
     this.currentL=currentLvl.getHead();
     this.Level+=1;
 }
 /**
  * Metodo que retorna el nivel.
  * @return Level nivel
  */
 public Level getLevel()
 {
     return this.currentLvl;
 }
 /**
  * Metodo que pasa la hilera siguiente a ser la cabeza.
  */
 public void nextLine()
 {
     this.currentL=currentL.getNext();
     this.currentLvl.chnLen(1);
 }
 /**
  * Metodo que retorna el nivel actual.
  * @return Level nivel
  */
 public int getLeveln()
 {
     return this.Level;
 }
}
