package br.com.dominio.api.pessoas.dados;

import br.com.dominio.api.pessoas.Cidadao;

//Fim dos imports / End of Imports;

public final class Telefone
{
    private int ddi,
    ddd,
    numero;

    private String operadora;

    private long cpfUsuarioVinculado;

    private long cnpjEmpresaVinculada;

    //Fim do campo de declaração de atributos / End of attributes Declaration Field;

    public Telefone()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Telefone(int ddi, int ddd, int numero, long cpfUsuarioVinculado, String operadora)
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

    /*public final long retornarCpfUsuario()
    {
        return cpfUsuarioVinculado.retornarCpf();
    }*/

    public final String retornarOperadora()
    {
        return operadora;
    }

    public final long retornarCnpjEmpresaVinculada()
    {
        return cnpjEmpresaVinculada;
    }

    //Fim dos Métodos Retornadores / End of Getters Methods;

}//Fim da Classe / End of Class;

