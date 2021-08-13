package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.Date;

import java.util.ArrayList;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public class ChefeEquipe extends Funcionario
{
    private static final ArrayList<Equipe> listaEquipe = new ArrayList<>(1);

    //Fim do Campo de Declaração de Atributos  / End of Attributes Declaration Field;


    public ChefeEquipe()
    {

    }//Fim do Construtor Padrão / End of Default Construtor;

    public ChefeEquipe(String nome, long cpf, Date dataNascimento, Endereco endereco,

                       float salario, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco, salario, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;


    public final ArrayList<Equipe> retornarListaEquipe()
    {
        return listaEquipe;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


}//Fim da Classe;
