package br.com.dominio.api.empresa.departamento;

import java.util.ArrayList;

//Fim dos Imports / End of Imports;

public class Departamento
{
    private String nome;

    private ArrayList listaFuncionários = new ArrayList(50);

    private Diretor diretor;

    private ViceDiretor viceDiretor;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public Departamento()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Departamento(String nome, Diretor diretor, ViceDiretor viceDiretor)
    {
        this.nome = nome;

        this.diretor = diretor;

        this.viceDiretor = viceDiretor;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

}//Fim da Classe / End of Class;
