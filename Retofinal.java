
package retofinal;

import javax.swing.JOptionPane;
public class Retofinal {

    
    public static void main(String[] args) {
      int mago=10,casas=0,aux=0,aux2=0,Gromard,usuario=10;
       String juego,nombre;
       boolean jugada=false ;
      nombre= JOptionPane.showInputDialog(null,"Bienvenido a  nuevo asgard, ingresa tu nombre: ");
       JOptionPane.showMessageDialog(null,"Hola "+nombre+" En esta villa tienes un gran enemigo llamado zhailord y ataca a las hadas de tu villa, por diez hadas "
               + "que el capture su poder aumenta en uno, pero que crees¡¡¡ puedes ayudar ,una casa que construyas ayudas a un hada y por 10 hadas que salves aumentas una unidad ");
       JOptionPane.showMessageDialog(null,"No tan rapido!!! ,Zhailord tiene un ayudante llamado Gromard ,y cada vez que te golpee te restara 1 unidad ");
       
       do{
       aux=(int)(Math.random()*100);
       aux2=(int)(Math.random()*2);
       Gromard=(int)(Math.random()*4);
       JOptionPane.showMessageDialog(null,"Zhailord tiene "+mago+" unidades y tu "+usuario+" unidades");
         if(Gromard==2){
         JOptionPane.showMessageDialog(null,"Has sido atacado por Gromard ,te ha restado un punto y se lo ha dado a Zhailord ");
         mago+=1;
         usuario-=1;
         } 
           if(aux<=49){
                 
             if(aux<=10){
             mago+=1;
             }
             if(aux>=20){
             mago+=1;
             }
             if(aux>=30){
             mago+=1;
             }
             if(aux>=40){
             mago+=1;
             }
             if(aux>=50){
             mago+=1;
             }
             if(aux>=60){
             mago+=1;
             }
             if(aux>=70){
             mago+=1;
             }
             if(aux>=80){
             mago+=1;
             }
             if(aux>=90){
             mago+=1;
             }
             if(aux>=100){
             mago+=1;
             }
               JOptionPane.showMessageDialog(null,"Zhialord capturo "+aux+" hadas y ahora tiene "+mago+" unidades");
            }else if (aux>=50){
             
             if(aux<=10){
             usuario+=1;
             }
             if(aux>=20){
             usuario+=1;
             }
             if(aux>=30){
             usuario+=1;
             }
             if(aux>=40){
             usuario+=1;
             }
             if(aux>=50){
             usuario+=1;
             }
             if(aux>=60){
             usuario+=1;
             }
             if(aux>=70){
             usuario+=1;
             }
             if(aux>=80){
             usuario+=1;
             }
             if(aux>=90){
             usuario+=1;
             }
             if(aux>=100){
             usuario+=1;
             }
       JOptionPane.showMessageDialog(null,"Salvaste hadas!!!! ,construiste "+aux+" casas ,ahora tienes "+usuario+" unidades");
            
         } 
              if(mago<=0){
              JOptionPane.showMessageDialog(null,"Has ganado con "+usuario+" unidades---juego terminado exitosamente :D ");
              jugada=false;
               }else if(usuario<=0){
               JOptionPane.showMessageDialog(null,"Has perdido....,Zhailord te derroto por "+mago+" unidades!!! ---juego terminado exitosamente :D");
               jugada=false;
               }
              
              if((mago>=1)&&(usuario>=1)){
              juego=JOptionPane.showInputDialog(null,"Tienes "+usuario+" unidades "+"y Zhailord "+mago+" unidades ,otra partida si/no?: ");
                switch(juego){
                    case "si":
                        jugada=true;
                    break;        
                    default:
                    jugada=false;    
                    break;
                }
              }
              
           }while(jugada);
       
    }
}
