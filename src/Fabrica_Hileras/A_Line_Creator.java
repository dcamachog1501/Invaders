/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_Hileras;

import Hileras.A_Line;
import Ventanas.Gestor2;

/**
 *Clase encargada de instanciar fabricas de hileras tipo A.
 * @author Daniel Camacho
 */
public class A_Line_Creator implements Line_Creator
{
     @Override
    public A_Line createLine(Gestor2 gest,int lvl) 
    {
       A_Line hilera=new A_Line();
       hilera.Init(gest,lvl);
       hilera.createLine();
       return hilera;
    }
    
}
