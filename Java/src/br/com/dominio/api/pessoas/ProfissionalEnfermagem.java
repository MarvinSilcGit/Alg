package br.com.dominio.api.pessoas;

import java.util.Date;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos imports / End of Imports;

public abstract class ProfissionalEnfermagem extends Funcionario
{
    private String coren;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public ProfissionalEnfermagem ()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public ProfissionalEnfermagem (String nome, int cpf, Date dataNascimento, Endereco endereco, float salario, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao, String coren)
    {
        super(nome, cpf, dataNascimento, endereco, salario, setor, funcao, email, sexualidade, sexo, telefone, dataAdmissao);

        //Fim do Método Super da Classe Mãe Funcionario / End of Funcionario Parent Class's Super Method

        this.coren = coren;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public String retornarCoren()
    {
        return coren;
    }
    //Fim do Métods Retornadores / End of Returners Methods;

}//Fim da classe  / End of CLass;
