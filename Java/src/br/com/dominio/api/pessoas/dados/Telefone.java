package br.com.dominio.api.pessoas.dados;


public abstract class Telefone
{
    private short ddi,
    ddd;

    private long numero;

    private String operadora;

    //Fim do campo de declaração de atributos / End of attributes Declaration Field;

    public Telefone()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Telefone(short ddi, short ddd, long numero, String operadora)
    {
        this.ddi = ddi;

        this.ddd = ddd;

        this.numero = numero;

        this.operadora = operadora;
    }//Fim do Construtor Personalizado para uso das seguintes Classes: Cidadao / End of Personalized Constructor for use of following classes: Cidadao;

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

    //Fim dos Métodos Retornadores / End of Getters Methods;

}//Fim da Classe / End of Class;

