package br.com.dominio.hospital.api.macas;


public class MacaPes extends Maca
{
    private static final byte quantidadePes = 4;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public MacaPes()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public MacaPes(float altura, float largura, float comprimento, float profundidade, String cor, String material, String marca, byte quantidadeBarrasLaterais)
    {
        super(altura, largura, comprimento, profundidade, cor, material, marca, quantidadeBarrasLaterais);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;