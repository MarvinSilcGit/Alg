package br.com.dominio.api.pessoas;


import java.util.Date;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public abstract class ProfissionalFisioterapia extends Funcionario
{
    private String crefito;

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;


    public ProfissionalFisioterapia()
    {

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public ProfissionalFisioterapia(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                    float salarioFixo, short expedienteSemanal, String setor, String funcao, String cargo, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone,

                                    String crefito)

    {
        super(nome, cpf, dataNascimento, endereco,

                salarioFixo, expedienteSemanal, setor, funcao, cargo, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.crefito = crefito;
    }
    //Fim do Construtor Personalizado / End of Personalized Constructor;

}
//Fim da Classe / End of Class;