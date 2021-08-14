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

    }
    //Fim do Construtor Padrão / End of Default Constructor;


    public ProfissionalMedicina(String nome, long cpf, Date dataNascimento, Endereco endereco,

                                float valorConsulta, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone, short expedienteSemanal,

                                String crm)
    {
        super(nome, cpf, dataNascimento, endereco,

                valorConsulta, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone, expedienteSemanal);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


        this.crm = crm;
    }
    //Fim do Construtor Personalizado / Ends of Personalized Constructor;


    public final String retornarCrm()
    {
        return crm;
    }

    //Fim dos Métodos Retornadores / End of Getters Methods;


}//Fim da Classe / End of Class;
