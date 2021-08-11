package br.com.dominio.api.pessoas;

import br.com.dominio.api.pessoas.dados.Endereco;

import java.util.Date;

public abstract class Cidadao
{
    private String nome;

    private int cpf;

    private Date dataNascimento;

    private Endereco endereco;

    public Cidadao ()
    {

    }

    public Cidadao (String nome, int cpf, Date dataNascimento, Endereco endereco)
    {
        this.nome = nome;

        this.cpf = cpf;

        this.dataNascimento = dataNascimento;

        this.endereco = endereco;
    }

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
}
