package br.com.dominio.api.empresa.departamento;


import br.com.dominio.api.empresa.departamento.funcionarios.Diretor;

import br.com.dominio.api.empresa.departamento.funcionarios.ViceDiretor;

//Fim dos Imports / End of Imports;


public final class Departamento
{
    private String nome;

    private Diretor diretor;

    private ViceDiretor viceDiretor;

    private double orcamentoTrimestral;



    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Departamento()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;


    public Departamento(String nome, Diretor diretor, ViceDiretor viceDiretor, double orcamentoTrimestral)
    {
        this.nome = nome;

        this.diretor = diretor;

        this.viceDiretor = viceDiretor;

        this.orcamentoTrimestral = orcamentoTrimestral;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;


    public final String retornarNome()
    {
        return nome;
    }

    public final String retornarDiretor()
    {
        return diretor.retornarNome();
    }

    public final String retornarViceDiretor()
    {
        return viceDiretor.retornarNome();
    }

    public final double retornarOrcamentoTrimestral()
    {
        return orcamentoTrimestral;
    }
    //Fim do Métodos Retornadores / End of Getter Methods;


    public final void alterarNome(String novoNome)
    {
        nome = novoNome;
    }

    public final void alterarDiretor(Diretor novoDiretor)
    {
        diretor = novoDiretor;
    }

    public final void alterarViceDiretor(ViceDiretor novoViceDiretor)
    {
        viceDiretor = novoViceDiretor;
    }

    public final void alterOrcamentoTrimestral(double novoOrcamentoTrimestral)
    {
        orcamentoTrimestral = novoOrcamentoTrimestral;
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}//Fim da Classe / End of Class;
