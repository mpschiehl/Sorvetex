/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Produto {
    private String nome,marca,unidade,capacidade,local,grupo,password;
    private float custo,atacado,varejo;
    private boolean atacadista;

    public String getPassword() {
        return "615036gc";
    }

    public void setPassword(String password) {
        this.password ="615036gc";
    }
    private int codigo,id,quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(String capacidade) {
        this.capacidade = capacidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getAtacado() {
        return atacado;
    }

    public void setAtacado(float atacado) {
        this.atacado = atacado;
    }

    public float getVarejo() {
        return varejo;
    }

    public void setVarejo(float varejo) {
        this.varejo = varejo;
    }

    public boolean isAtacadista() {
        return atacadista;
    }

    public void setAtacadista(boolean atacadista) {
        this.atacadista = atacadista;
    }
}
