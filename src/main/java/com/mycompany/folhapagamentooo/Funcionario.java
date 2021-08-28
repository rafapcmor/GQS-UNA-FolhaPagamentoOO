/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.folhapagamento;

/**
 *
 * @author rafap
 */
public class Funcionario {
    
    // atributos
    private String nome;
    private int codigo;
    private float horasTrabalhadas, valorHora, salarioInicial, salarioFinal, auxilio;
    private Cargo cargo;
    private Turno turno;
    
    // construtor
    public Funcionario(String nome, float horasTrabalhadas, Cargo c, Turno t){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.cargo = c;
        this.turno = t;
    }
    // getters e setters
    public String getNome(){
       return this.nome;
    }
    
    public float getSalarioInicial(){
        return this.salarioInicial;
    }
    public void setSalarioInicial(float salario){
       this.salarioInicial = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public float getAuxilio() {
        return auxilio;
    }

    public void setAuxilio(float auxilio) {
        this.auxilio = auxilio;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Turno getTurno() {
        return turno;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\n"+ "Codigo: " + codigo + 
                "HorasTrabalhadas: " + horasTrabalhadas + "\n"
                + "ValorHora: " + valorHora + "\n" + "SalarioInicial: " + salarioInicial + "\n" + 
                "SalarioFinal: " + salarioFinal +"\n" + "Auxilio: " + auxilio + "\n" + 
                "Cargo: " + cargo + "\n" + "Turno: " + turno;
    }
   
}
