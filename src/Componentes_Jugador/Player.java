/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes_Jugador;

/**
 *Clase encargada de instanciar los objetos Player para el leaderboard.
 * @author Daniel Camacho
 */
public class Player 
{
 private String name;
 private Player next;
 private int punt;
 /**
  * Metodo que inicializa las variables del objeto Player.
  * @param name Nombre del jugador. 
  * @param punt Puntuacion alcanzada en la partida.
  */
 public void Init(String name,int punt)
 {
     this.name=name;
     this.punt=punt;
     this.next=null;
 }
 /**
  * Metodo que retorna el objeto jugador enlazado al puntero next.
  * @return objeto Player.
  */
 public Player getNext()
 {
     return this.next;
 }/**
  * Metodo que establece el objeto que va a ser enlazado al puntero next.
  * @param pl Objeto player.
  */
 public void setNext(Player pl)
 {
     this.next=pl;
 }
 /**
  * Metodo que establece la variable nombre del objeto Player.
  * @param n String nombre.
  */
 public void setName(String n)
 {
     this.name=n;
 }
 /**
  * Metodo que establece la variable punt del objeto Player.
  * @param punt int puntaje.
  */
 public void setPunt(int punt)
 {
     this.punt=punt;
 }
 /**
  * Metodo que retorna la variable punt del objeto Player.
  * @return int puntaje.
  */
 public int getPunt()
 {
     return this.punt;
 }
 /**
  * Metodo que retorna el atributo nombre del objeto player.
  * @return String nombre.
  */
 public String getName()
 {
     return this.name;
 }
}
