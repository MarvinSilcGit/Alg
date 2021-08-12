package br.com.dominio.api.pessoas.dados;


public final class TelefonePessoaFisica extends Telefone
{
    private long cpfVinculado;

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;

    public TelefonePessoaFisica()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public TelefonePessoaFisica(short ddi, short ddd, long numero, String operadora,

                                long cpfVinculado)

    {
        super(ddi, ddd, numero, operadora);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

        this.cpfVinculado = cpfVinculado;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

}//Fim da Classe / End of Class;
