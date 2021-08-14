package br.com.dominio.hospital.alas.funcionarios.crp;


import java.util.Date;

import br.com.dominio.api.pessoas.ProfissionalPsicologia;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public final class Psiquiatra extends ProfissionalPsicologia
{

    public Psiquiatra()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;

    public Psiquiatra(String nome, long cpf, Date dataNascimento, Endereco endereco,

                      float salarioFixo, short expedienteSemanal, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone,

                      String crp)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone, crp);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;