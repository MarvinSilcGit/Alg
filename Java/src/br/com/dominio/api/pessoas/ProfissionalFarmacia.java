package br.com.dominio.api.pessoas;

import java.util.Date;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos Imports / End of Import;

public abstract class ProfissionalFarmacia extends Funcionario
{
    private String crf;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public ProfissionalFarmacia()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public ProfissionalFarmacia(String nome, long cpf, Date dataNascimento, Endereco endereco, float salario, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao, String crf)
    {
        super(nome, cpf, dataNascimento, endereco, salario, setor, funcao, email, sexualidade, sexo, telefone, dataAdmissao);

        //Fim do Método Super da Classe Mãe Funcionario / End of Funcionario Parent Class's Super Method;

        this.crf = crf;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public final String retornarCrf()
    {
        return crf;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}//Fim da Classe / End of Class;
