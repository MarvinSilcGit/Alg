package br.com.dominio.api.pessoas;


import java.util.Date;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public abstract class ProfissionalPsicologia  extends Funcionario
{
    private String crp;

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;


    public ProfissionalPsicologia()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public ProfissionalPsicologia(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                  float salario, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone,

                                  String crp)

    {
        super(nome, cpf, dataNascimento, endereco,

                salario, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.crp = crp;
    }
    //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

    public final String retornarCrp()
    {
        return crp;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}
//Fim da Classe / End of Class;
