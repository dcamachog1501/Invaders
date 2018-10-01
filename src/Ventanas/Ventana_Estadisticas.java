/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Componentes_Jugador.Player;
import Componentes_Jugador.Puntaje;
import java.io.FileReader;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *Clase encargada de instanciar Ventanas de Estadisticas.
 * @author Daniel Camacho
 */
public class Ventana_Estadisticas extends JFrame
{
    private String title;
    private Image back;
    private Image icono;
    private Color color;
    private Font fuentem;
    private Gestor2 gest;
    private Image back2;
    private FileReader reader;
    private Puntaje leaderboards;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;
    public Ventana_Estadisticas()
    {
        
    }
    /**
     * Constructor de la clase Ventana_Estadisticas
     * @param title String titulo
     * @param Fuente Font fuente
     * @param back Image background
     * @param Icono Icon icono
     * @param Btn Color color de los botones.
     * @param back2 Image Background 2
     * @param gest Gestor2 gestor
     * @throws IOException 
     */
    public Ventana_Estadisticas(String title,Font Fuente,Image back,Image Icono, Color Btn, Image back2,Gestor2 gest) throws IOException
    {
        this.title=title;
        this.back=back;
        this.color=Btn;
        this.icono=Icono;
        this.color=Btn;
        this.fuentem=Fuente;
        this.gest=gest;
        this.back2=back2;
        this.leaderboards=getMarc();
        Label4= new JLabel();
        Label5= new JLabel();
        Label6= new JLabel();
        Label7= new JLabel();
        Label8= new JLabel();
        Init();
    }
    /**
     * Metodo encargado de incializar la ventana.
     * @throws IOException 
     */
    public void Init() throws IOException
    {
        setTitle(title);
        setSize(1050,700);
        setResizable(false);
        setUndecorated(true);
        setIconImage(icono);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4,Color.BLACK));

        JPanel Panel1= new JPanel();
        Panel1.setBackground(Color.DARK_GRAY);
        Panel1.setPreferredSize(new Dimension(200,1000));
        Panel1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4,Color.BLACK));
        Panel1.setLayout(null);
        add(Panel1,BorderLayout.WEST);

        JPanel Panel2= new JPanel();
        Panel2.setBackground(Color.DARK_GRAY);
        Panel2.setPreferredSize(new Dimension(225,1000));
        Panel2.setBorder(BorderFactory.createMatteBorder(0, 4, 0, 0,Color.BLACK));
        Panel2.setLayout(null);
        add(Panel2,BorderLayout.EAST);

        JPanel Panel3= new JPanel();
        Panel3.setBackground(Color.DARK_GRAY);
        Panel3.setPreferredSize(new Dimension(200,2000));
        Panel3.setLayout(null);
        add(Panel3,BorderLayout.CENTER);

        JLabel Label1= new JLabel();
        Label1.setOpaque(true);
        Label1.setBackground(color);
        Label1.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 4,Color.BLACK));
        Label1.setBounds(0,0,25,700);
        Panel3.add(Label1);

        JLabel Label2= new JLabel();
        Label2.setOpaque(true);
        Label2.setBackground(color);
        Label2.setBorder(BorderFactory.createMatteBorder(0, 4, 0, 0,Color.BLACK));
        Label2.setBounds(593,0,25,700);
        Panel3.add(Label2);
        //Titulo principal de la ventana
        JLabel Label3= new JLabel("GALAXY'S BEST PILOTS");
        Label3.setFont(fuentem.deriveFont(Font.PLAIN, 40));
        Label3.setForeground(Color.GREEN);
        Label3.setBounds(60,0,1000,100);
        Panel3.add(Label3);

        Label4.setText("1. "+ leaderboards.getPos(0).getName()+" "+
        leaderboards.getPos(0).getPunt());
        Label4.setFont(fuentem.deriveFont(Font.PLAIN, 30));
        Label4.setForeground(Color.GREEN);
        Label4.setBounds(40,100,1000,100);
        Panel3.add(Label4);

        Label5.setText("2. "+ leaderboards.getPos(1).getName()+" "+
        leaderboards.getPos(1).getPunt());
        Label5.setFont(fuentem.deriveFont(Font.PLAIN, 30));
        Label5.setForeground(Color.GREEN);
        Label5.setBounds(40,200,1000,100);
        Panel3.add(Label5);

        Label6.setText("3. "+ leaderboards.getPos(2).getName()+" "+
        leaderboards.getPos(2).getPunt());
        Label6.setFont(fuentem.deriveFont(Font.PLAIN, 30));
        Label6.setForeground(Color.GREEN);
        Label6.setBounds(40,300,1000,100);
        Panel3.add(Label6);

        Label7.setText("4. "+ leaderboards.getPos(3).getName()+" "+
        leaderboards.getPos(3).getPunt());
        Label7.setFont(fuentem.deriveFont(Font.PLAIN, 30));
        Label7.setForeground(Color.GREEN);
        Label7.setBounds(40,400,1000,100);
        Panel3.add(Label7);

        Label8.setText("5. "+ leaderboards.getPos(4).getName()+" "+
        leaderboards.getPos(4).getPunt());
        Label8.setFont(fuentem.deriveFont(Font.PLAIN, 30));
        Label8.setForeground(Color.GREEN);
        Label8.setBounds(40,500,1000,100);
        Panel3.add(Label8);
        //Boton para volver al menu principal 
        JButton Menu= new JButton("MAIN MENU");
        Menu.setForeground(Color.GREEN);
        Menu.setBackground(color);
        Menu.setFont(fuentem.deriveFont(Font.PLAIN,20));
        Menu.setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.BLACK));
        Menu.setFocusPainted(false);
        Menu.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Menu.setBounds(20,550, 200, 70);
        Menu.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) 
            {
                dispose();
                gest.gestInicial();
            }

        });
        Panel1.add(Menu);
        //Boton para salir del juego 
        JButton Abort = new JButton("ABORT");
        Abort.setForeground(Color.GREEN);
        Abort.setBackground(color);
        Abort.setFont(fuentem.deriveFont(Font.PLAIN,20));
        Abort.setBorder(BorderFactory.createMatteBorder(4,0,4,4,Color.BLACK));
        Abort.setFocusPainted(false);
        Abort.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Abort.setBounds(0,75, 200, 70);
        Abort.addActionListener(new ActionListener()
        {


            @Override
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        }
        );
        Panel2.add(Abort);

        JLabel Back3=new JLabel();
        Back3.setIcon(new ImageIcon(back2));
        Back3.setBounds(0,0,200,700);
        Back3.setBorder(BorderFactory.createMatteBorder(0,0,0,4,Color.BLACK));
        Panel1.add(Back3);

        JLabel Back4=new JLabel();
        Back4.setIcon(new ImageIcon(back2));
        Back4.setBounds(0,0,250,700);
        Back4.setBorder(BorderFactory.createMatteBorder(0,4,0,0,Color.BLACK));
        Panel2.add(Back4);
    }
    /**
     * Metodo que retorna el leaderboard.
     * @return Puntaje p.
     * @throws IOException 
     */
    public Puntaje getMarc() throws IOException
    {
       Puntaje p= new Puntaje();
       p.Init();
       p.createPunt();
       return p;
    }
    /**
     * Metodod que guarda el leaderboard.
     * @param p Puntaje p.
     */
    public void saveMarc(Player p)
    {
       leaderboards.save(p);
    }
    public void update() throws IOException
    {
        this.leaderboards=getMarc();
        Label4.setText("1. "+ leaderboards.getPos(0).getName()+" "+
        leaderboards.getPos(0).getPunt());
        Label5.setText("2. "+ leaderboards.getPos(1).getName()+" "+
        leaderboards.getPos(1).getPunt());
        Label6.setText("3. "+ leaderboards.getPos(2).getName()+" "+
        leaderboards.getPos(2).getPunt());
        Label7.setText("4. "+ leaderboards.getPos(3).getName()+" "+
        leaderboards.getPos(3).getPunt());
        Label8.setText("5. "+ leaderboards.getPos(4).getName()+" "+
        leaderboards.getPos(4).getPunt());
    }
}
