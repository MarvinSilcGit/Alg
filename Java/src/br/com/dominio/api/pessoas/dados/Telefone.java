package br.com.dominio.api.pessoas.dados;

import br.com.dominio.api.pessoas.Cidadao;

public final class Telefone
{
    private int ddi,
    ddd,
    numero;

    private String operadora;

    private Cidadao cpfUsuario;

    public Telefone()
    {

    }

    public Telefone(int ddi, int ddd, int numero, Cidadao cpfUsuario, String operadora)
    {
        this.ddi = ddi;

        this.ddd = ddd;

        this.numero = numero;

        this.cpfUsuario = cpfUsuario;

        this.operadora = operadora;
    }

    public final String retornarNumeroCompleto()
    {
        return "DDI: " + ddi + ", DDD: " + ddd + ", Número: " + numero;
    }

    public final int retornarCpfUsuario()
    {
        return cpfUsuario.retornarCpf();
    }

    public final String retornarOperadora()
    {
        return operadora;
    }

}

