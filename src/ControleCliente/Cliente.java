package ControleCliente;
// Generated 20/12/2016 16:53:10 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Cliente generated by hbm2java
 */
public class Cliente  implements java.io.Serializable {


     private String cliId;
     private String nome;
     private String sobrenome;
     private String cpf;
     private String rg;
     private Date dataNascimento;
     private String endereco;
     private String numero;
     private String complemento;
     private String cidade;
     private String estado;
     private String telFixo;
     private String telMovel;
     private String email;
     private String nomeMae;
     private String nomePai;
     private String sexo;
     private String bairro;
     private String estadoCivil;
     private Set vendases = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(String cliId, String nome, String sobrenome, String cpf, String endereco) {
        this.cliId = cliId;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public Cliente(String cliId, String nome, String sobrenome, String cpf, String rg, Date dataNascimento, String endereco, String numero, String complemento, String cidade, String estado, String telFixo, String telMovel, String email, String nomeMae, String nomePai, String sexo, String bairro, String estadoCivil) {
       this.cliId = cliId;
       this.nome = nome;
       this.sobrenome = sobrenome;
       this.cpf = cpf;
       this.rg = rg;
       this.dataNascimento = dataNascimento;
       this.endereco = endereco;
       this.numero = numero;
       this.complemento = complemento;
       this.cidade = cidade;
       this.estado = estado;
       this.telFixo = telFixo;
       this.telMovel = telMovel;
       this.email = email;
       this.nomeMae = nomeMae;
       this.nomePai = nomePai;
       this.sexo = sexo;
       this.bairro = bairro;
       this.estadoCivil = estadoCivil;
       this.vendases = null;
    }
   
    public String getCliId() {
        return this.cliId;
    }
    
    public void setCliId(String cliId) {
        this.cliId = cliId;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return this.sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getRg() {
        return this.rg;
    }
    
    public void setRg(String rg) {
        this.rg = rg;
    }
    public Date getDataNascimento() {
        return this.dataNascimento;
    }
    
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNumero() {
        return this.numero;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public String getCidade() {
        return this.cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getTelFixo() {
        return this.telFixo;
    }
    
    public void setTelFixo(String telFixo) {
        this.telFixo = telFixo;
    }
    public String getTelMovel() {
        return this.telMovel;
    }
    
    public void setTelMovel(String telMovel) {
        this.telMovel = telMovel;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNomeMae() {
        return this.nomeMae;
    }
    
    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }
    public String getNomePai() {
        return this.nomePai;
    }
    
    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getBairro() {
        return this.bairro;
    }
    
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getEstadoCivil() {
        return this.estadoCivil;
    }
    
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Set getVendases() {
        return this.vendases;
    }
    
    public void setVendases(Set vendases) {
        this.vendases = vendases;
    }




}


