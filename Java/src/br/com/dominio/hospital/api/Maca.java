package br.com.dominio.hospital.api;


public class Maca
{
    private float altura,
            largura,
            comprimento,
            profundidade;

    private String funcionamento,
            cor,
            material,
            marca;

    private boolean barrasLaterais,
            rodinhas,
            pes;

    private byte quantidadeBarrasLaterais,
            quantidadeRodinhas,
            quantidadePes;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Maca()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Maca(float altura, float largura, float comprimento, float profundidade, String funcionamento, String cor, String material, String marca, boolean barrasLaterais, boolean rodinhas, boolean pes, byte quantidadeBarrasLaterais, byte quantidadeRodinhas, byte quantidadePes)
    {
        this.altura = altura;

        this.largura = largura;

        this.comprimento = comprimento;

        this.profundidade = profundidade;

        this.funcionamento = funcionamento;

        this.cor = cor;

        this.material = material;

        this.marca = marca;

        this.barrasLaterais = barrasLaterais;

        this.rodinhas = rodinhas;

        this.pes = pes;

        this.quantidadeBarrasLaterais = quantidadeBarrasLaterais;

        this.quantidadeRodinhas = quantidadeRodinhas;

        this.quantidadePes = quantidadePes;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

    public Maca(float altura, float largura, float comprimento, float profundidade)
    {
        this.altura = altura;

        this.largura = largura;

        this.comprimento = comprimento;

        this.profundidade = profundidade;
    }


    public String retonarCaracteristicasMaca()
    {
        return "Altura:" + altura + ", Largura: " + largura + ", Comprimento: " + comprimento + ", Profundidade: " + profundidade + ", Funcionamento: " + funcionamento + "";
    }

    @Override
    public String toString()
    {
        return "Maca{" +
                "altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", profundidade=" + profundidade +
                '}';
    }
}
//Fim da Classe / End of Class;