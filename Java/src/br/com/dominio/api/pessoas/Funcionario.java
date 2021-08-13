package br.com.dominio.api.pessoas;


import java.util.Date;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

import br.com.dominio.api.pessoas.dados.Endereco;

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

    private TelefonePessoaFisica telefone;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field


    public Funcionario ()
    {

    }
    //Fim do Construtor padrão / End of Default Constructor;


    public Funcionario (String nome, long cpf, Date dataNascimento, Endereco endereco,

                        float salario, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super (nome, cpf, dataNascimento, endereco);

        //Fim do Método Super da classe mãe / End of Parent Class's Super Method;


        this.salario = salario;

        this.setor = setor;

        this.funcao = funcao;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;

        this.telefone = telefone;
    }
    //Fim do Construtor Personalizado, para uso das seguintes classes: ProfissionalEnfermagem, ProfissionalFarmacia, Diretor e ViceDiretor / End of Personalized Constructor for using of following classes: ProfissionalEnfermagem, ProfissionialFarmacia, Diretor and ViceDiretor;


    public Funcionario (String nome, long cpf, Date dataNascimento, Endereco endereco,

                        String setor, String funcao, String email, String sexualidade, String sexo,Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.setor = setor;

        this.funcao = funcao;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;

        this.telefone = telefone;
    }//Fim do Construtor Personalizado, para uso das seguintes classes: ProfissionalMedicina / End of Personalized Constructor for using of following classes: ProfissionalMedicina;


    public final float retornarSalario()
    {
        return salario;
    }

    public final String retornarSetor()
    {
        return setor;
    }

    public final String retornarFuncao()
    {
        return funcao;
    }

    public final String retornarEmail()
    {
        return email;
    }

    public final String retornarSexualidade()
    {
        return sexualidade;
    }

    public final String retornarSexo()
    {
        return sexo;
    }

    public final Date retornarDataAdmissao()
    {
        return dataAdmissao;
    }

    public final TelefonePessoaFisica retornarTelefonePessoaFisica()
    {
        return telefone;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;


}//Fim da Classe / End of Class;
