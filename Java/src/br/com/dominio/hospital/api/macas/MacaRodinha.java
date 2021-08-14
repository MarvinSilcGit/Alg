package br.com.dominio.hospital.api.macas;


public class MacaRodinha extends Maca
{
    private static final byte quantidadeRodinhas = 4;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public MacaRodinha()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public MacaRodinha(float altura, float largura, float comprimento, float profundidade, String cor, String material, String marca, byte quantidadeBarrasLaterais)
    {
        super(altura, largura, comprimento, profundidade, cor, material, marca, quantidadeBarrasLaterais);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;