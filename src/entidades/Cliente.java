package entidades;

import javax.swing.JOptionPane;

public class Cliente extends Pessoa{
    
    private String limite;
    private String codCliente;
    private String mesNascimento;
    private String primeiraCompra;

    public Cliente() {
    }

    public Cliente(String limite, String codCliente, String mesNascimento, String primeiraCompra) {
        super();
        this.limite = limite;
        this.codCliente = codCliente;
        this.mesNascimento = mesNascimento;
        this.primeiraCompra = primeiraCompra;
    }
    
    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getMesNascimento() {
        return mesNascimento;
    }

    public void setMesNascimento(String mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public String getPrimeiraCompra() {
        return primeiraCompra;
    }

    public void setPrimeiraCompra(String primeiraCompra) {
        this.primeiraCompra = primeiraCompra;
    }


    // Remover depois
    public void cadastrarCliente(){
        super.cadastrar();
        this.limite = JOptionPane.showInputDialog("Entre com o limite");
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

