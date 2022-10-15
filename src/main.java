/*O método main deve:

– Criar um produto que não está em promoção
– Criar um vendedor
– Criar uma venda
– Setar o produto e o vendedor na venda
– Informar que a venda é referente a dois itens
– Calcular o valor da venda
– Imprimir o valor da comissão do vendedor
– Imprimir a venda
– Criar um produto que está em promoção, com valor
de custo = 80 e valor de venda = 100
– Criar outro vendedor
– Criar outra venda
– Setar o produto e o vendedor na venda
– Informar que a venda é referente a três itens
– Efetuar um desconto de 10%
– Calcular o valor da venda
– Imprimir o valor da comissão do vendedor
– Imprimir a venda
– Criar outra venda
– Setar o produto e o vendedor do slide anterior na
nova venda
– Informar que a venda é referente a dois itens
– Efetuar um desconto de 30% (perceba que esse
desconto vai fazer com que o produto seja vendido
abaixo do preço de custo!!!!!)
– Calcular o valor da venda
– Imprimir o valor da comissão do vendedor
– Imprimir a venda

 */

public class main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.setCodigo(0001);
        produto1.setDescricao("agua sanitaria");
        produto1.setPromocao(false);
        produto1.setValorVenda(12);
        produto1.setValorCusto(6);

        Produto produto2 = new Produto();
        produto2.setCodigo(0002);
        produto2.setDescricao("biscoito");
        produto2.setValorCusto(2);
        produto2.setValorVenda(4);
        produto2.setPromocao(false);

        Vendedor vendedor1 = new Vendedor();
        vendedor1.setCodigo(0021);
        vendedor1.setNome("Alfredo");
        vendedor1.setEndereco("av novais");
        vendedor1.setComissao(1);


        Venda venda1 = new Venda();
        venda1.setProduto(produto1);
        venda1.setProduto(produto2);
        venda1.setVendedor(vendedor1);
        venda1.setQuantidadeItens(2);
        venda1.setDesconto(0);
        System.out.println("o valor da venda é : " + (produto1.getValorVenda() + produto2.getValorVenda()));
        System.out.println("o valor da comissao é: " + venda1.calcularComissao());


    }
}
