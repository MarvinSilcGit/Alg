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

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public Endereco()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Endereco(String estado, String cidade, String bairro, String rua, String complemento, int numero, int cep)
    {
        this.estado = estado;

        this.cidade = cidade;

        this.bairro = bairro;

        this.rua = rua;

        this.complemento = complemento;

        this.numero = numero;

        this.cep = cep;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public String retornarEnderecoCompleto()
    {
        return "Estado: " + estado + ", Cidade:" + cidade + ", Bairro: " + bairro + ", Rua: " + rua + ", Complemento: " + complemento + ", Número: " + numero + ", CEP: " + cep;
    }

    public String retornarEstado()
    {
        return estado;
    }

    public String retornarCidade()
    {
        return cidade;
    }

    public String retornarBairro()
    {
        return bairro;
    }

    public String retornarRua()
    {
        return rua;
    }

    public String retornarComplemento()
    {
        return complemento;
    }

    public int retornarNumero()
    {
        return numero;
    }

    public int retornarCep()
    {
        return cep;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

    public void alterarEstado()
    {

    }

}//Fim da Classe / End of Class;
