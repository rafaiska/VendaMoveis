package Controle;
// Generated 30/09/2016 15:49:28 by Hibernate Tools 4.3.1



/**
 * ImagemProduto generated by hbm2java
 */
public class ImagemProduto  implements java.io.Serializable {


     private String imagemId;
     private Produto produto;
     private byte[] imagem;

    public ImagemProduto() {
    }

	
    public ImagemProduto(String imagemId) {
        this.imagemId = imagemId;
    }
    public ImagemProduto(String imagemId, Produto produto, byte[] imagem) {
       this.imagemId = imagemId;
       this.produto = produto;
       this.imagem = imagem;
    }
   
    public String getImagemId() {
        return this.imagemId;
    }
    
    public void setImagemId(String imagemId) {
        this.imagemId = imagemId;
    }
    public Produto getProduto() {
        return this.produto;
    }
    
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public byte[] getImagem() {
        return this.imagem;
    }
    
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }




}

