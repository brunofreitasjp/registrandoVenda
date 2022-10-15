/*
• Atributos
– nome
– codigo
– comissao (em porcentagem – deve ser único para todos os objetos)
– endereco
• Metodos
– Os get e set para todos os atributos
• Construtor
– Recebendo o nome, o endereco e o codigo.
 */
public class Vendedor {

    private String nome;
    private int codigo;
    private int comissao;
    private String endereco;

    public Vendedor() {
        this.nome = nome;
        this.codigo = codigo;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getComissao() {
        return comissao;
    }

    public void setComissao(int comissao) {
        this.comissao = comissao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
