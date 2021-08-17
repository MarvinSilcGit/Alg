package br.com.dominio.api.empresa.departamento;


import java.util.ArrayList;

import java.util.Hashtable;

import br.com.dominio.api.empresa.departamento.funcionarios.Diretor;

//Fim dos Imports / End of Imports;


public abstract class Departamento
{
    private String nome,
            funcao;

    private Diretor diretor;

    private double orcamentoTrimestral;

    private final Hashtable<String, Double> listaDespesas = new Hashtable<>();

    private ArrayList<String> listaEquipamento = new ArrayList<>();

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Departamento()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public Departamento(String nome, String funcao, Diretor diretor, double orcamentoTrimestral)
    {
        this.nome = nome;

        this.funcao = funcao;

        this.diretor = diretor;

        this.orcamentoTrimestral = orcamentoTrimestral;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final String retornarNome()
    {
        return nome;
    }

    public final String retornarFuncao()
    {
        return funcao;
    }

    public final String retornarDiretor()
    {
        return diretor.retornarNome();
    }

    public final double retornarOrcamentoTrimestral()
    {
        return orcamentoTrimestral;
    }

    public final Hashtable<String, Double> retornarListaDespesas()
    {
        return listaDespesas;
    }
    //Fim do Métodos Retornadores / End of Getter Methods;


    public final void alterarNome(String novoNome)
    {
        nome = novoNome;
    }

    public final void alterarFuncao(String novaFuncao)
    {
        funcao = novaFuncao;
    }

    public final void alterarDiretor(Diretor novoDiretor)
    {
        diretor = novoDiretor;
    }

    public final void alterOrcamentoTrimestral(double novoOrcamentoTrimestral)
    {
         orcamentoTrimestral = novoOrcamentoTrimestral;
    }

    public final void inserirDespesaLista(String titulo, Double valor)
    {
        if (listaDespesas.contains(titulo))
        {
            System.out.println("Já existe essa Depesa / Already exists this Expense");
        }

        else
        {
            listaDespesas.put(titulo, valor);
        }
    }

    public final void removerDespesaLista(String titulo)
    {
        if (listaDespesas.contains(titulo))
        {
            listaDespesas.remove(titulo);
        }

        else
        {
            System.out.println("Essa Despesa não existe / This Expense don't exists");
        }
    }
    //Fim do Métodos Modificadores / End of Setters Methods;

}
//Fim da Classe / End of Class;
