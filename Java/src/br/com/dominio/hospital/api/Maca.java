package br.com.dominio.hospital.api;


public abstract class Maca
{
    private float altura,
            largura,
            comprimento,
            profundidade;

    private String funcionamento;

    private boolean barrasLaterais,
            rodinhas;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Maca()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Maca(float altura, float largura, float comprimento, float profundidade, String funcionamento, boolean barrasLaterais, boolean rodinhas)
    {
        this.altura = altura;

        this.largura = largura;

        this.comprimento = comprimento;

        this.profundidade = profundidade;

        this.funcionamento = funcionamento;

        this.barrasLaterais = barrasLaterais;

        this.rodinhas = rodinhas;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;