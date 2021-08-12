package br.com.dominio.api.empresa;

import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.TelefonePessoaJuridica;

import br.com.dominio.api.pessoas.dados.Endereco;

//Fim dos Imports / End of Imports;

public abstract class Empresa
{
    private String razaoSocial,
    nomeFantasia;

    private ArrayList listaDepartamentos = new ArrayList(10);

    private ArrayList listaFundadores = new ArrayList(20);

    private double capitalSocial;

    private long cnpj;

    private Funcionario presidente,
    vicePresidente;

    private Endereco endereco;

    private TelefonePessoaJuridica telefone;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public Empresa()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Empresa(String razaoSocial, String nomeFantasia, double capitalSocial, long cnpj, Funcionario presidente, Funcionario vicePresidente, Endereco endereco, TelefonePessoaJuridica telefone)
    {
        this.razaoSocial = razaoSocial;

        this.nomeFantasia = nomeFantasia;

        this.capitalSocial = capitalSocial;

        this.cnpj = cnpj;

        this.presidente =  presidente;

        this.vicePresidente = vicePresidente;

        this.endereco = endereco;

        this.telefone = telefone;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public final String retornarRazaoSocial()
    {
        return razaoSocial;
    }

    public final String retornarNomeFantasia()
    {
        return nomeFantasia;
    }

    public final double retornarCapitalSocial()
    {
        return capitalSocial;
    }

    public final long retornarCnpj()
    {
        return cnpj;
    }

    public final String retornarPresidente()
    {
        return presidente.retornarNome();
    }

    public final String retornarVicePresidente()
    {
        return vicePresidente.retornarNome();
    }

    public final String retornarEndereco()
    {
        return endereco.retornarEnderecoCompleto();
    }

    public final String retornarTelefone()
    {
        return telefone.retornarNumeroCompleto();
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}//Fim da Classe / End of Class;
