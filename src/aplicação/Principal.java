package aplicação;

import entidades.Cliente;
import entidades.Funcionario.Funcionario;
import entidades.Produto.Produto;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        
        Produto produto = new Produto();
        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();
        
        Integer menu;
        
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog("[1] - Cadastrar Produto "
                    + "\n[2] - exibir Produto"
                    + "\n[3] - Cadastrar Cliente"
                    + "\n[4] - Exibir Cliente"
                    + "\n[5] - Cadastrar Funcionario"
                    + "\n[6] - Exibir Funcionario"
                    + "\n[0] - Sair"));
            
            switch(menu){
                case 0: 
                    JOptionPane.showMessageDialog(null, "FIM DO PROGAMA");
                    break;
                case 1:
                    produto.cadastrarProduto();
                    break;
                case 2:
                    produto.exibirProduto();
                    break;
                case 3: 
                    cliente.cadastrarCliente();
                    break;
                case 4: 
                    cliente.exibirCliente();
                    break;
                case 5: 
                    funcionario.cadastrarFuncionario();
                    break;
                case 6: 
                    funcionario.exibirFuncionario();
                    break;
            }
        
        } while (menu != 0);
        
    }
    
}
