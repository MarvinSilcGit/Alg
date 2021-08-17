package br.com.dominio.hospital.alas.uti;


import java.util.ArrayList;

import br.com.dominio.api.empresa.departamento.Departamento;

import br.com.dominio.api.empresa.departamento.funcionarios.Diretor;

//Fim dos Imports / End of Imports;


public class Uti extends Departamento
{
    //private ArrayList<>


    public Uti()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public Uti(String nome, Diretor diretor, double orcamentoTrimestral)
    {
        super(nome, diretor, orcamentoTrimestral);

        //Fim do Método Super da classe mãe / End of Parent Class's Super Method;


    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;
