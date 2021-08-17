package br.com.dominio.reguladorprofissao.crm;


import br.com.dominio.api.empresa.Empresa;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaJuridica;


public class Crm extends Empresa
{
    public Crm()
    {

    }

    public Crm(String razaoSocial, String nomeFantasia, double capitalSocial, long cnpj, Funcionario presidente, Funcionario vicePresidente,

               Endereco endereco, TelefonePessoaJuridica telefone)

    {
        super(razaoSocial, nomeFantasia, capitalSocial, cnpj, presidente, vicePresidente, endereco, telefone);

        //Fim do Método Super da classe mãe / End of Parent Class's Super Method;

    }


}//Fim da Classe / End of Class;
