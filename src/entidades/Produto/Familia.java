package entidades.Produto;

import javax.swing.JOptionPane;

public class Familia {
    
    private String nome;
    private String tipo;

    public Familia() {
    }

    public Familia(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    // Remover depois
    public void cadastrarFamilia(){
        this.nome = JOptionPane.showInputDialog("Familia do produto:");
        this.tipo = JOptionPane.showInputDialog("Tipo da familia:");
        
    }
    
    public void exibirFamilia(){
        JOptionPane.showMessageDialog(null, 
                "Familia: " + this.nome +
                "\nTipo: " + this.tipo );
    }
    
}
