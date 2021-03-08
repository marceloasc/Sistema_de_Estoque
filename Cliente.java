package entidades;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
    
    private Double limite;
    private String codCliente;
    private String mesNascimento;
    private String primeiraCompra;
    
    public void cadastrarCliente(){
        super.cadastrar();
        this.limite = Double.parseDouble(JOptionPane.showInputDialog("Entre com o limite"));
        this.codCliente = JOptionPane.showInputDialog("Código do cliente");
        this.mesNascimento = JOptionPane.showInputDialog("Entre com o mês de nascimento");
        this.primeiraCompra = JOptionPane.showInputDialog("Entre com a data da primeira compra");
    }
    
    public void exibirCliente(){
        JOptionPane.showMessageDialog(null, "Limite: " + this.limite +
                "\nCodigo: " + this.codCliente +
                "\nMês de Nascimento: " + this.mesNascimento +
                "\nPrimeira Compra: " + this.primeiraCompra );
        super.exibir();
    }
        
}

