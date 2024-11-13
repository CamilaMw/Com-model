package exemplo4;
//@author Camila
 
import javax.swing.JOptionPane;
import model.ContaCorrente;

public class Aula3_exercicio1 {

    public static void main(String[] args) {
        
    ContaCorrente conta = new ContaCorrente();
    
    conta.nome = JOptionPane.showInputDialog("Digite o nome do titular: ");
    conta.numeroConta = JOptionPane.showInputDialog("Digite o numero da conta: ");
    conta.agencia = JOptionPane.showInputDialog("Digite a agencia: ");
    conta.saldo = 0;
    
    int op;
    
    do{
        
        op = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Consultar Saldo;\n2- Depositar valor; \n3 - Sacar Valor; \n4- Sair. \nEscolha: "));
        
        switch(op){
            case 1:
                JOptionPane.showMessageDialog(null, conta);
                break;
            case 2:
                double dep = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser depositado"));
                conta.depositarValor(dep);
                break;
            case 3: 
                double sac = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor a ser sacado"));
                conta.sacarValor(sac);
        
            case 4:
            break;
            
            default:
            JOptionPane.showMessageDialog(null, "Opcao invalida!");
        
        }
    } while(op != 4);
        
        
        
    }
    
}
