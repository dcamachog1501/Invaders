/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Level_Creator;

import Ventanas.Gestor2;

/**
 *Clase encargada de instanciar creadores de niveles.
 * @author Daniel Camacho.
 */
public class Level_Creator 
{
  Gestor2 gestor;
  /**
   * Constructor de la clase Level_Creator.
   * @param gest Objeto Gestor2. 
   */
  public Level_Creator(Gestor2 gest)
  {
      this.gestor=gest;
  }
  /**
   * Metodo encargado de generar niveles.
   * @param x Nivel actual.
   * @return Nivel instanciado.
   */
  public Level createLevel(int x)
    {
        Level l= new Level(x,gestor);
        l.generateLevel();
        return l;
    }
}
