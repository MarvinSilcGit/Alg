package br.com.dominio.api.empresa.departamento.funcionarios;


import java.util.Date;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim do Imports / End of Imports;


public final class ViceDiretor extends Funcionario
{

    public ViceDiretor()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;


    public ViceDiretor(String nome, long cpf, Date dataNascimento, Endereco endereco,

                       float salario, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)


    {
        super(nome, cpf, dataNascimento, endereco,

                salario, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class Super Method;


    }//Fim do Método Construtor Personalizado;


}//Fim da Classe / End of Class;