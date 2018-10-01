/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabrica_Enemigos;

import Enemigos.Enemy;
import Enemigos.Type_C;
import Ventanas.Gestor2;

/**
 *Clase encargada de instanciar fabricas de eemigos de tipo C
 * @author Daniel Camacho
 */
public class C_Creator implements Enemy_Creator 
{

    @Override
    public Enemy createEnemy(int x, int y, int sup,int dir,Gestor2 gest, int lvl, int h ,int s) 
    {
        Type_C enm= new Type_C();
        enm.Init(x,y,sup,dir,gest,lvl, h,s);
        return enm;
    }
    
}
