package br.com.dominio.api.pessoas.dados;

public final class Endereco
{
    private String estado,
    cidade,
    bairro,
    rua,
    complemento;

    private int numero,
    cep;

    public Endereco()
    {

    }

    public Endereco(String estado, String cidade, String bairro, String rua, String complemento, int numero, int cep)
    {
        this.estado = estado;

        this.cidade = cidade;

        this.bairro = bairro;

        this.rua = rua;

        this.complemento = complemento;

        this.numero = numero;

        this.cep = cep;
    }

    public final String retornarEnderecoCompleto()
    {
        return "Estado: " + estado + ", Cidade:" + cidade +  ", Rua: " + rua + ", Complemento: " + complemento + ", Número: " + numero + ", Bairro: " + bairro + ", CEP: " + cep;
    }

    public final String retornarEstado()
    {
        return estado;
    }

    public final String retornarCidade()
    {
        return cidade;
    }

    public final String retornarBairro()
    {
        return bairro;
    }

    public final String retornarRua()
    {
        return rua;
    }

    public final String retornarComplemento()
    {
        return complemento;
    }

    public final int retornarNumero()
    {
        return numero;
    }

    public final int retornarCep()
    {
        return cep;
    }

}
