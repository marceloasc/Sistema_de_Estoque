package entidades.Produto;

import entidades.Endereco;
import javax.swing.JOptionPane;

public class Fornecedor {
    
    private String nome, telefone, contato;
    
    private Endereco end = new Endereco();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    public void cadastrarFornecedor(String nome, String endereco, String telefone, String contato){
        this.nome = nome;
        this.telefone = telefone;
        this.contato = contato;
        end.cadastrarEndereco();
    }
    
    public void exibirFornecedor(){
        JOptionPane.showMessageDialog(null, "Nome Fornecedor: " + this.nome +
                "\nTelefone Fornecedor: " + this.telefone +
                "\nContato Fornecedor: " + this.contato);
        end.exibirEndereco();
    }
    
}
