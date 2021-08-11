package br.com.dominio.api.pessoas.dados;

import br.com.dominio.api.pessoas.Cidadao;

//Fim dos imports / End of Imports;

public final class Telefone
{
    private int ddi,
    ddd,
    numero;

    private String operadora;

    private Cidadao cpfUsuarioVinculado;

    //Fim do campo de declaração de atributos / End of attributes Declaration Field

    public Telefone()
    {

    }//Fim do Construtor Padrão / End of Default's Constructor;

    public Telefone(int ddi, int ddd, int numero, Cidadao cpfUsuarioVinculado, String operadora)
    {
        this.ddi = ddi;

        this.ddd = ddd;

        this.numero = numero;

        this.cpfUsuarioVinculado = cpfUsuarioVinculado;

        this.operadora = operadora;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public final String retornarNumeroCompleto()
    {
        return "DDI: " + ddi + ", DDD: " + ddd + ", Número: " + numero;
    }

    public final int retornarCpfUsuario()
    {
        return cpfUsuarioVinculado.retornarCpf();
    }

    public final String retornarOperadora()
    {
        return operadora;
    }
    //Fim dos Métodos retornadores / Ends of Returners Methods;

}//Fim da Classe / End of Class;

