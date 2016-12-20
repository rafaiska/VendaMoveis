package ControleProduto;
// Generated 20/12/2016 16:53:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private String prodId;
     private String nomeProd;
     private int quantidadeEstoque;
     private String descricao;
     private Float precoVenda;
     private Float precoCusto;
     private Float altura;
     private Float largura;
     private Float profundidade;
     private String marca;
     private Set pedidoEstoques = new HashSet(0);
     private Set prodVendas = new HashSet(0);
     private Set imagemProdutos = new HashSet(0);

    public Produto() {
    }

	
    public Produto(String prodId, String nomeProd, int quantidadeEstoque) {
        this.prodId = prodId;
        this.nomeProd = nomeProd;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public Produto(String prodId, String nomeProd, int quantidadeEstoque, String descricao, Float precoVenda, Float precoCusto, Float altura, Float largura, Float profundidade, String marca) {
       this.prodId = prodId;
       this.nomeProd = nomeProd;
       this.quantidadeEstoque = quantidadeEstoque;
       this.descricao = descricao;
       this.precoVenda = precoVenda;
       this.precoCusto = precoCusto;
       this.altura = altura;
       this.largura = largura;
       this.profundidade = profundidade;
       this.marca = marca;
       this.pedidoEstoques = null;
       this.prodVendas = null;
       this.imagemProdutos = null;
    }
   
    public String getProdId() {
        return this.prodId;
    }
    
    public void setProdId(String prodId) {
        this.prodId = prodId;
    }
    public String getNomeProd() {
        return this.nomeProd;
    }
    
    public void setNomeProd(String nomeProd) {
        this.nomeProd = nomeProd;
    }
    public int getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Float getPrecoVenda() {
        return this.precoVenda;
    }
    
    public void setPrecoVenda(Float precoVenda) {
        this.precoVenda = precoVenda;
    }
    public Float getPrecoCusto() {
        return this.precoCusto;
    }
    
    public void setPrecoCusto(Float precoCusto) {
        this.precoCusto = precoCusto;
    }
    public Float getAltura() {
        return this.altura;
    }
    
    public void setAltura(Float altura) {
        this.altura = altura;
    }
    public Float getLargura() {
        return this.largura;
    }
    
    public void setLargura(Float largura) {
        this.largura = largura;
    }
    public Float getProfundidade() {
        return this.profundidade;
    }
    
    public void setProfundidade(Float profundidade) {
        this.profundidade = profundidade;
    }
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Set getPedidoEstoques() {
        return this.pedidoEstoques;
    }
    
    public void setPedidoEstoques(Set pedidoEstoques) {
        this.pedidoEstoques = pedidoEstoques;
    }
    public Set getProdVendas() {
        return this.prodVendas;
    }
    
    public void setProdVendas(Set prodVendas) {
        this.prodVendas = prodVendas;
    }
    public Set getImagemProdutos() {
        return this.imagemProdutos;
    }
    
    public void setImagemProdutos(Set imagemProdutos) {
        this.imagemProdutos = imagemProdutos;
    }




}


