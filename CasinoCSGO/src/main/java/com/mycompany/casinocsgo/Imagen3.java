/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.casinocsgo;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author alumno
 */
public class Imagen3 extends Thread{
boolean activo=true;
Random img = new Random();
Random tiem = new Random();
int i=0;
int tiempo=0;
int c=0;
@Override
public void run(){
while(activo==true){
i=img.nextInt(4);
tiempo=tiem.nextInt(100);
if(i==1){
Interfaz.tres.setIcon(new ImageIcon(Interfaz.img1));
c=1;
}
if(i==2){
Interfaz.tres.setIcon(new ImageIcon(Interfaz.img2));
c=2;
}
if(i==3){
Interfaz.tres.setIcon(new ImageIcon(Interfaz.img3));
c=3;
}
try{
sleep(tiempo);
}catch(InterruptedException e){}
}
}
}
