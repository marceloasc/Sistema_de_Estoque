package entidades.Produto;

import javax.swing.JOptionPane;

public class Produto {
    
    private String codigo;
    private String nome;
    private double custo;
    private Fornecedor fornecedor = new Fornecedor();
    private String unidade;
    private String marca;

    private Familia familia;
    private Categoria categoria;

    public Produto() {
        familia = new Familia();
        categoria = new Categoria();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public void cadastrarProduto(){
        
        this.codigo = JOptionPane.showInputDialog("Codigo do Produto");
        this.nome = JOptionPane.showInputDialog("Entre com o nome do produto");
        this.custo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o curto do produto em R$"));
        familia.cadastrarFamilia();
        categoria.cadastrarCategoria();
        this.unidade = JOptionPane.showInputDialog("Entre com a unidade do produto");
        this.marca = JOptionPane.showInputDialog("Entre com a marca do produto");
        fornecedor.cadastrarFornecedor("Atacadao", "Rua sei la", "79 99229922", "Joselito");
        
    }
    public void exibirProduto(){
        JOptionPane.showMessageDialog(null, "Codigo: " + this.codigo +
                "\nNome: " + this.nome +
                "\nCusto: " + this.custo +
                "\nUnidade: " + this.unidade +
                "\nMarca: " + this.marca );
       fornecedor.exibirFornecedor();
       familia.exibirFamilia();
       
    }
    
}
