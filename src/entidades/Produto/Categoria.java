package entidades.Produto;

import javax.swing.JOptionPane;

public class Categoria {
    
    private String nome;
    private String tipo;
    private String descricao;

    public Categoria() {
    }

    public Categoria(String nome, String tipo, String descricao) {
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public void cadastrarCategoria(){
        this.nome = JOptionPane.showInputDialog("Categoria:");
        this.tipo = JOptionPane.showInputDialog("Tipo da Categoria:");
        this.descricao = JOptionPane.showInputDialog("Descrição da categoria:");
        
    }
    
    public void exibirCategoria(){
        JOptionPane.showMessageDialog(null, 
                "Categoria: " + this.nome +
                "\nTipo da categoria: " + this.tipo +
                "\nDescrição da categoria: " + this.descricao );
    }
    
}
