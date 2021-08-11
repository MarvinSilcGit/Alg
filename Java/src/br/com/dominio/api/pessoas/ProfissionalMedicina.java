package br.com.dominio.api.pessoas;

import java.util.Date;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos Imports / End of Imports;

public abstract class ProfissionalMedicina extends Funcionario
{
    private String crm;

    //Fim do Campo de Declaração de Atributos / End of Attribute Declaration Field;

    public ProfissionalMedicina()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public ProfissionalMedicina(String nome, int cpf, Date dataNascimento, Endereco endereco, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao, String crm)
    {
        super(nome, cpf, dataNascimento, endereco, setor, funcao, email, sexualidade, sexo, telefone, dataAdmissao);

        //Fim do Método Super da Classe Mãe Funcionario / End of Funcionario Parent Class's Super Method;

        this.crm = crm;
    }//Fim do Construtor Personalizado / Ends of Personalized Constructor;

}//Fim da Classe / End of Class;
