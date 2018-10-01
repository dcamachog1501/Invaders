/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hileras;
import Enemigos.Enemy;
import Threads.BasicMove;
import Ventanas.Gestor2;
import java.awt.*;

/**
 *Interfaz base de las hileras
 * @author Daniel Camacho
 */
public interface Line 
{
    /**
     * Metodo que inicializa el valor de la cabeza de la hilera.
     */
    public void setHead();
    /**
     * Metodo que incializa el valor de la longitud de la lista.
     */
    public void setLen();
    /**
     * Metodo que inicializa el valor de la longitud maxima de la lista.
     */
    public void setMaxlen();
    /**
     * Metodo que inicializa la coordenada en X del primer valor de la lista.
     */
    public void setEnmx();
    /**
     * Metodo que inicializa la coordenada en Y del primer valor de la lista.
     */
    public void setEnmy();
    /**
     * Metodo que establece el limite superior del movimiento de las hileras.
     */
    public void setSup();
    /**
     * Metodo que inicializa la imagen que se proyecta en en lado izquierdo de la pantalla dependiendo de la hilera proyectada.
     */
    public void setCurrent();
    /**
     * Metodo que retorna si la hilera esta vacia.
     * @return booleano. 
     */
    public boolean isEmpty();
    /**
     * Metodo que agrega objetos Enemy a la hilera.
     * @param enm objeto Enemy que se agrega a la lista.
     */
    public void adder(Enemy enm);
    /**
     * Metodo que retorna la imagen que se proyecta en en lado izquierdo de la pantalla dependiendo de la hilera proyectada.
     * @return Imagen.
     */
    public Image getCurrent();
    /**
     * Metodoque llena la hilera con la cantidad maxima de obejtos Enemy que se pueda.
     */
    public void createLine();
    /**
     * Metodo que dibuja la hilera en el canvas.
     * @param g Graficos.
     * @param c Canvas donde se va a dibujar.
     */
    public void Render(Graphics g,Canvas c);
    /**
     * Metodo que retorna la coordenada en Y de la hilera.
     * @return  int enmy
     */
    public int getEnmy();
    /**
     * Metodo que retorna la coordenada en X de la hilera.
     * @return int enmx
     */
    public int getEnmx();
    /**
     * Metodo que retorna la cabeza de la hilera.
     * @return objeto Enemy.
     */
    public Enemy getHead();
    /**
     * Metodo que retorna el limite superior de la lista.
     * @return int limite superior.
     */
    public int getSup();
    /**
     * Metodo que inicializa la hilera.
     * @param gest Objeto gestor de la hilera.
     * @param lvl Nivel actual. 
     */
    public void Init(Gestor2 gest,int lvl);
    /**
     * Metodo que inicializa la favbrica de enemigos del tipo especificado de la hilera.
     */
    public void setFactory();
    /**
     * Metodo que elimina los enemigos de la hilera.
     * @param x Posicion en la lista del enemigo a eliminar.
     */
    public void eliminate(int x);
    /**
     * Metodo que inicializa el objeto gestor de la hilera.
     * @param gest Gestor2 gestor
     */
    public void setGestor(Gestor2 gest);
    /**
     * Metodo que establece el objeto Line enlazado al puntero next de la hilera.
     * @param l objeto Line.
     */
    public void setNext(Line l);
    /**
     * Metodo que retorna el objeto Line enlazado al puntero next de la hilera.
     * @return Line next
     */
    public Line getNext();
    /**
     * Metodo que retorna el movimiento asociado a la hilera.
     * @return BasicMove movimiento
     */
    public BasicMove getMove();
    /**
     * Metodo que inicializa el tipo de la hilera.
     */
    public void setType();
    /**
     * Metodo que retorna el tipo de hilera.
     * @return String type
     */
    public String getType();
    /**
     * Metodo que retorna la longitud de la hilera.
     * @return int len
     */
    public int getLen();
    /**
     * Metodo que asigna vida a los enemigos de la lista dependiendo del nivel.
     * @return int health
     */
    public int giveHealth();
    /**
     * Metodo que asigna velocidad a los enemigos de la lista dependiendo del nivel.
     * @return int speed
     */
    public int giveSpeed();
}
