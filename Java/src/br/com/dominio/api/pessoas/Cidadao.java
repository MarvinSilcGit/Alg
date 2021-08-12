package br.com.dominio.api.pessoas;

import br.com.dominio.api.pessoas.dados.Endereco;

import java.util.Date;

//Fim dos Imports / End of Imports;

public abstract class Cidadao
{
    private String nome;

    private int cpf;

    private Date dataNascimento;

    private Endereco endereco;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public Cidadao ()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Cidadao (String nome, int cpf, Date dataNascimento, Endereco endereco)
    {
        this.nome = nome;

        this.cpf = cpf;

        this.dataNascimento = dataNascimento;

        this.endereco = endereco;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public final String retornarNome()
    {
        return nome;
    }

    public final int retornarCpf()
    {
        return cpf;
    }

    public final Date retornarDataNascimento()
    {
        return dataNascimento;
    }

    public final String retornarEndereco()
    {
        return endereco.retornarEnderecoCompleto();
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}//Fim da classe / End of Class;
