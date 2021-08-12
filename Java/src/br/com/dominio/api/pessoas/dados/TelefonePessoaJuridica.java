package br.com.dominio.api.pessoas.dados;


public final class TelefonePessoaJuridica extends Telefone
{
    private long cpfVinculado;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public TelefonePessoaJuridica()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;


    public TelefonePessoaJuridica(short ddd, short ddi, long numero, String operadora,

                                  long cpfVinculado)

    {
        super(ddi, ddd, numero, operadora);

        //Fim do Método Super da Classe Mãe / Enf of Parent Class's Super Method;


        this.cpfVinculado = cpfVinculado;
    }//Fim do Construtor personalizado / End of Personalized Constructor;


}//Fim da Classe  / End of Class;
