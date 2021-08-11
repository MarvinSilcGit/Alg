package br.com.dominio.api.pessoas;

import br.com.dominio.api.pessoas.dados.*;

import java.util.Date;

//Fim dos imports / End of imports;

public abstract class Funcionario extends Cidadao
{
    private float salario;

    private String setor,
    funcao,
    email,
    sexualidade,
    sexo;

    private Date dataAdmissao;

    //Fim do campo de declaração de atributos / End of attribute Declaration Field

    public Funcionario ()
    {

    }//Fim do método construtor padrão / End of Default Constructor;

    public Funcionario (float salario, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Endereco endereco, Date dataAdmissao)
    {
        super ();

        //Fim do Método Super da classe mãe Cidado / End of Cidadao's Parent Class Super Method;

        this.salario = salario;

        this.setor = setor;

        this.funcao = funcao;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;
    }//Fim do Primeiro Método Construtor Personalizado / End of the First Constructor Method;

    public Funcionario (String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Endereco endereco, Date dataAdmissao)
    {
        this.setor = setor;

        this.funcao = funcao;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;
    }//Fim do Segundo Método Construtor / End of the Second Constructor Method;

}//Fim da Classe Funcionario / End of Funcionario Class;
