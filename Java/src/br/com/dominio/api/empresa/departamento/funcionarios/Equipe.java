package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

//Fim dos Imports / End of Imports;


public final class Equipe
{
    private final ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();

    //Fim dos Imports / End of Imports;


    public Equipe()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public final ArrayList<Funcionario> retornarListaFuncionarios()
    {
        return listaFuncionarios;
    }
    //Fim do Métodos Retornadores / End of Getters Methods;


    public final void inserirFuncionarioEquipe(Funcionario novoFuncionario)
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

    public final void removerFuncionarioEquipe(Funcionario removerFuncionario)
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


}//Fim da Classe / End of Class;
