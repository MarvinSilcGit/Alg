package br.com.dominio.api.empresa.departamento;


import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

//Fim dos Imports / End of Imports;


public final class Departamento
{
    private String nome;

    private Diretor diretor;

    private ViceDiretor viceDiretor;

    private double orcamentoTrimestral;

    private ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

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

    public final void inserirFuncionarioDepartamento(Funcionario novoFuncionario)
    {
        if (listaFuncionarios.contains(novoFuncionario))
        {
            System.out.println("Já existe esse Funcionaro / Already exists this Funcionario");
        }

        else
        {
            listaFuncionarios.add(novoFuncionario);
        }
    }

    public final void removerFuncionarioDepartamento(Funcionario removerFuncionario)
    {
        if (listaFuncionarios.contains(removerFuncionario))
        {
            listaFuncionarios.remove(removerFuncionario);
        }

        else
        {
            System.out.println("O Funcionario não existe / The Funcionario don't exists");
        }
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}//Fim da Classe / End of Class;
