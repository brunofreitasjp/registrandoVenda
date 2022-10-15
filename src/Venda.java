/*
• Atributos
– produto (Tipo definido pela classe Produto)
– vendedor (Tipo definido pela classe Produto)
– desconto (em reais R$)
– quantidadeItens
– valor

• Metodos
– Os get e set para todos os atributos produto, vendedor e quantidadeItens
– calcularValor
– calcularComissao
– efetuarDesconto
– imprimir
– efetuarDesconto
• Recebe como parâmetro a porcentagem de desconto. O
desconto é sobre o valorVenda do produto. O valor de um
produto após o desconto não pode ficar abaixo do
valorCusto do produto.

– calcularValor
• Leva em consideração a quantidadeItens, o valorVenda do produto e o desconto
– calcularComissao
• Leva em considera a comissao do vendedor e o valor da
venda. Entretanto se o produto estiver em promocao o valor
da comissão deve ser dividido por dois.

• Imprimir
– Exibe:
• O vendedor (codigo,nome e a comissao pela venda)
• Quantidade de itens vendidos
• O código e descrição do produto
• O valor de venda do produto
• Se o produto está em promoção ou não
• O valor do desconto sobre o produto
• O valor total da venda
 */
public class Venda {
    private Produto produto;
    private Vendedor vendedor;
    private float desconto;
    private int quantidadeItens;
    private float valor;

    public Venda() {
        this.produto = produto;
        this.vendedor = vendedor;
        this.desconto = desconto;
        this.quantidadeItens = quantidadeItens;
        this.valor = valor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }


    /* public float calcularValor (){
         return (quantidadeItens * produto.getValorVenda() ) - (quantidadeItens * produto.getValorVenda() * desconto / 100);
     }*/
    public void efetuarDesconto() {
        float porcetagemDesconto = produto.getValorVenda() / (desconto * 100);

        if (produto.getValorCusto() < porcetagemDesconto) {
            produto.setValorVenda(desconto - produto.getValorVenda());
        }

    }

    public float calcularValor() {
        return quantidadeItens * produto.getValorVenda() - desconto;
    }

    public float calcularComissao() {
        if (produto.isPromocao() == true) {
            return (valor - (valor * vendedor.getComissao() / 100)) / 2;
        } else {
            return valor - (valor * vendedor.getComissao() / 100);
        }
    }


    public void imprimir(){

        System.out.println("o nome do vendedor é :" + vendedor.getNome() + "o codigo do vendedor  é :" + vendedor.getCodigo() + "a comisao pela venda é :" + vendedor.getComissao());
        System.out.println("a quantidade de itens vendidos é : " + quantidadeItens);
        System.out.println("o codigo  do produto : " + produto.getCodigo() + "a descricao do produto : " + produto.getDescricao());
        System.out.println("o valor de venda do produto : " + produto.getValorVenda());
        System.out.println("promocao: " + produto.isPromocao());
        System.out.println("O valor do desconto sobre o produto: " + desconto);
        System.out.println("O valor total da venda: " + calcularValor());
    }



}