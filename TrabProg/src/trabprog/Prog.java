/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabprog;

/**
 *
 * @author Paula Costa
 */
public class Prog {
    
    private String codJogador;
    private String nomeJogador;
    private String dataNascimento; // Pode ser do tipo `Date` se preferir
    private String sexo;
    private double altura;
    private String codPais;
    private String codAgente;
    private String codPosicao;

    // Getters e Setters
    public String getCodJogador() {
        return codJogador;
    }

    public void setCodJogador(String codJogador) {
        this.codJogador = codJogador;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCodPais() {
        return codPais;
    }

    public void setCodPais(String codPais) {
        this.codPais = codPais;
    }

    public String getCodAgente() {
        return codAgente;
    }

    public void setCodAgente(String codAgente) {
        this.codAgente = codAgente;
    }

    public String getCodPosicao() {
        return codPosicao;
    }

    public void setCodPosicao(String codPosicao) {
        this.codPosicao = codPosicao;
    }
}
