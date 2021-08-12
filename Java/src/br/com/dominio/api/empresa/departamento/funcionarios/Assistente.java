package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.Date;

import java.util.Dictionary;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public class Assistente extends Funcionario
{
    public Assistente()
    {

    }//Fim do Construtor Padrão / End of Personalized Constructor;

    public Assistente(String nome, long cpf, Date dataNascimento, Endereco endereco,

                      float salario, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco, salario, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


    }//Fim do Construtor Personalizado / End of Personalized Constructor;

}//Fim da Classe / End of Class;
