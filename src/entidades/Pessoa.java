package entidades;

import javax.swing.JOptionPane;

public class Pessoa {
    
    private String nome, CPF, RG, telefone;
    private Endereco end;

    public Pessoa() {
        end = new Endereco();
    }
    
    public void cadastrar(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome");
        this.CPF = JOptionPane.showInputDialog("Entre com o CPF");
        this.RG = JOptionPane.showInputDialog("Entre com o RG");
        this.telefone = JOptionPane.showInputDialog("Entre com o telefone");
        end.cadastrarEndereco();
    }
    public void exibir(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nCPF: " + this.CPF +
                "\nRG: " + this.RG +
                "\nTelefone: " + this.telefone
                );
        end.exibirEndereco();
    }
    
}
