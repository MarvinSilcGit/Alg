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

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field

    public Funcionario ()
    {

    }//Fim do Construtor padrão / End of Default Constructor;

    public Funcionario (String nome, int cpf, Date dataNascimento, Endereco endereco, float salario, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao)
    {
        super (nome, cpf, dataNascimento, endereco);

        //Fim do Método Super da classe mãe Cidadoo / End of Cidadao Parent Class's Super Method;

        this.salario = salario;

        this.setor = setor;

        this.funcao = funcao;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;
    }//Fim do Construtor Personalizado, para uso das seguintes classes: ProfissionalEnfermagem / End of Personalized Constructor for using of following classes: ProfissionalEnfermagem;

    public Funcionario (String nome, int cpf, Date dataNascimento, Endereco endereco, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao)
    {
        super(nome, cpf, dataNascimento, endereco);

        //Fim do Método Super da Classe mãe Cidadao / End of Cidadao Parent Class's Super Method;

        this.setor = setor;

        this.funcao = funcao;

        this.email = email;

        this.sexualidade = sexualidade;

        this.sexo = sexo;

        this.dataAdmissao = dataAdmissao;
    }//Fim do Construtor Personalizado, para uso das seguintes classes: ProfissionalMedicina / End of Personalized Constructor for using of following classes: ProfissionalMedicina;

    public float retornarSalario()
    {
        return salario;
    }

    public String retornarSetor()
    {
        return setor;
    }

    public String retornarFuncao()
    {
        return funcao;
    }

    public String retornarEmail()
    {
        return email;
    }

    public String retornarSexualidade()
    {
        return sexualidade;
    }

    public String retornarSexo()
    {
        return sexo;
    }
    //Fim do Métodos Retornadores / End of Returners Methods;

}//Fim da Classe / End of Class;
