package br.com.dominio.api.empresa.departamento;



public class Equipamento
{
    private String forma,
            funcao,
            profundidade,
            altura,
            largura,
            caracteristicaPrincipal;

    private float valor;

    private int quantidade;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Equipamento()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Equipamento(String forma, String funcao, String profundidade, String altura, String largura, String caracteristicaPrincipal, float valor, int quantidade)
    {
        this.forma = forma;

        this.funcao = funcao;

        this.profundidade = profundidade;

        this.altura = altura;

        this.largura = largura;

        this.caracteristicaPrincipal = caracteristicaPrincipal;

        this.valor = valor;

        this.quantidade = quantidade;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;




}
//Fim da Classe / End of Class;