package br.com.dominio.hospital.api.macas;


public abstract class Maca
{
    private float altura,
            largura,
            comprimento,
            profundidade;

    private String cor,
            material,
            marca;

    private byte quantidadeBarrasLaterais;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Maca()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Maca(float altura, float largura, float comprimento, float profundidade, String cor, String material, String marca, byte quantidadeBarrasLaterais)
    {
        this.altura = altura;

        this.largura = largura;

        this.comprimento = comprimento;

        this.profundidade = profundidade;

        this.cor = cor;

        this.material = material;

        this.marca = marca;

        this.quantidadeBarrasLaterais = quantidadeBarrasLaterais;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public String retornarDadosMaca()
    {
        return "Altura: " + altura + ", Largura: " + largura + ", Comprimento: " + comprimento + ", Profundidade: " + profundidade +

                ", Cor: " + cor + ", Mateial: " + material + ", Marca: " + marca +

                ", Quantidade Barras Laterais: " + quantidadeBarrasLaterais;
    }

    public float retornarAltura()
    {
        return altura;
    }

    public float retornarLargura()
    {
        return largura;
    }

    public float retornarComprimento()
    {
        return comprimento;
    }

    public float retornarProfundidade()
    {
        return profundidade;
    }

    public String retornarCor()
    {
        return cor;
    }

    public String retornarMaterial()
    {
        return material;
    }

    public String retonarMarca()
    {
        return marca;
    }

    public byte retornarQuantidadeBarrasLaterais()
    {
        return quantidadeBarrasLaterais;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}
//Fim da Classe / End of Class;