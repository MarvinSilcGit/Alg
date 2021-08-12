package br.com.dominio.api.empresa.departamento;

import java.util.ArrayList;

//Fim dos Imports / End of Imports;

public class Departamento
{
    private String nome;

    private ArrayList listaFuncionários = new ArrayList(50);

    //

    public Departamento()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Departamento(String nome)
    {
        this.nome = nome;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;


}//Fim da Classe / End of Class;
