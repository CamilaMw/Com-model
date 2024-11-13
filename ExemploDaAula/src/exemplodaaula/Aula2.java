package exemplodaaula;
//@author Camila

import java.util.Scanner;
import model.Aluno;
        
public class Aula2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Aluno alunos[] = new Aluno[25]; 
        
        double somamedia = 0, mediaturma = 0;
        
        for(int i=0;i<25;i++){
            alunos[i] = new Aluno();
            
            System.out.print("Digite seu nome: ");
            alunos[i].nome = sc.next();
            
            System.out.print("Digite a primeira nota: ");
            alunos[i].nota1 = sc.nextDouble();
        
            System.out.print("Digite a segunda nota: ");
            alunos[i].nota2 = sc.nextDouble();
        
            System.out.print("Digite a terceira nota: ");
            alunos[i].nota3 = sc.nextDouble();
            
            double media = (alunos[i].nota1 + alunos[i].nota2 + alunos[i].nota3)/3;
            somamedia += media;
            
            if (media >= 6){
            System.out.println(alunos[i].nome + " Aprovado");
            } 
            else if (media >= 4 && media <= 6){
            System.out.println(alunos[i].nome + " de recuperação");
            } else {
            System.out.println(alunos[i].nome + " Reprovado");
            } 
            
        }
       
        mediaturma = somamedia/3;
        System.out.println("Media da turma:" + mediaturma);
    }
    
}
