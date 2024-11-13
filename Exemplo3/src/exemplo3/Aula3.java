package exemplo3;
// @author Camila

import java.util.Scanner;
import model.Tempo;
        
public class Aula3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Tempo[] crono = new Tempo[6];
        
        for(int i=0;i<crono.length;i++){
        crono[i] = new Tempo();
        
        System.out.println("Digite a hora: ");
        crono[i].hora = sc.nextInt();
        
        System.out.println("Digite o minuto: ");
        crono[i].minuto = sc.nextInt();
        
        System.out.println("Digite o segundo: ");
        crono[i].segundo = sc.nextInt();
        }
                
        for(int i=0;i<crono.length;i++){
            System.out.println(crono[i]);
        }
                
                
    }
    
}
