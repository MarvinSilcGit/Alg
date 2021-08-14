package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.ArrayList;

import br.com.dominio.api.empresa.departamento.Departamento;

import br.com.dominio.api.empresa.Empresa;

import br.com.dominio.api.pessoas.Funcionario;

//Fim dos Imports / End of Imports;


public final class Equipe
{
    private final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    private String funcao,
            nome;

    private float tetoGastos;

    private Empresa empresa;

    private Departamento departamento;

    //Fim dos Imports / End of Imports;


    public Equipe()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public void erer()
    {
        //fazer o teto de gastos de acordo com o número de departamento e o número de equipes da empresa;
    }

    public Equipe(String funcao, String nome)
    {
        this.funcao = funcao;

        this.nome = nome;
    }

    public String retornarFuncao()
    {
        return funcao;
    }

    public String retornarNome()
    {
        return nome;
    }

    public double retornarTetoGastos()
    {
        return tetoGastos;
    }

    public ArrayList<Funcionario> retornarListaFuncionarios()
    {
        return listaFuncionarios;
    }
    //Fim do Métodos Retornadores / End of Getters Methods;


    public void inserirFuncionarioEquipe(Funcionario novoFuncionario)
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

    public void removerFuncionarioEquipe(Funcionario removerFuncionario)
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
    //Fim dos Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
