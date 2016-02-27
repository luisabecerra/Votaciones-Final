/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votaciones.pkgfinal;

/**
 *
 * @author Luisa Paola Becerra Pleáez--Juan Camilo Mora Tinoco
 */
public class VotacionesFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner num= new java.util. Scanner(System.in);
    int p,s;
        System.out.println ("ingrese el numero de municipios");
        p = num.nextInt();
        System.out.println ("ingrese el numero de candidatos");
        s = num.nextInt();
        int [][] Votos = new int [p][s];
        for( int i = 0; i <p; i++){
            for(int q=0;q<s;q++){
                System.out.print(" ingrese el numero de votos del municipio"+(i+1));
                System.out.println("para el candidato "+(q+1));
                int r=num.nextInt();
                Votos[i][q]=r; 
            }
        }
        for( int b = 0; b <p; b++){
            for(int k=0;k<s;k++){                
                System.out.print(Votos[b][k]+ "\t");
                }
        System.out.println();
       }
        double porcentaje;
        int total1=0, mayor=0, ganador=0,total=0;
        int sumcandidatos []=new int [s];
        for(int c=0;c<s;c++){         
            int suma=0;            
            for(int x=0;x<p;x++){
                suma= Votos [x][c]+suma;        
            }
                total=suma+total;       
                System.out.print("el total de votos para el candidato "+ ""+(c+1)+"es :"+suma );        
            if (mayor<suma){
                mayor=suma;
                ganador=c;            
            } 
        sumcandidatos [c]=suma;
        }      
        for(int u=0;u<s;u++){
            porcentaje=(sumcandidatos[u]*100)/total;
            System.out.println("El porcentaje del candidato "+ (u+1)+" es "+ porcentaje+"%");
        }
        System.out.println ("El ganador es el candidato: " +(ganador+1));
        System.out.println ("El total de votos de todos los candidatos es: " +total);        
    }   
}

