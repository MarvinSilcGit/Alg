package br.com.dominio.api.empresa.departamento;

public class Orcamento
{
    private float valorInicial,
            entradas,
            saidas,
            saldo;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public Orcamento()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Orcamento(float valorInicial, float entradas, float saidas, float saldo)
    {
        this.valorInicial = valorInicial;

        this.entradas = entradas;

        this.saidas = saidas;

        this.saldo = saldo;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;


}//Fim da Classe / End of Class;
