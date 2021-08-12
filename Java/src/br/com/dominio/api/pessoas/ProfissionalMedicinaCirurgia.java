package br.com.dominio.api.pessoas;

import java.util.Date;

import br.com.dominio.api.pessoas.dados.*;

//Fim dos Imports / End of Imports;

public  abstract class ProfissionalMedicinaCirurgia extends ProfissionalMedicina
{
    private float valorCirurgia;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;

    public ProfissionalMedicinaCirurgia()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;

    public ProfissionalMedicinaCirurgia(String nome,long cpf, Date dataNascimento, Endereco endereco, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao, String crm, float valorConsulta, float valorCirurgia)
    {
        super(nome, cpf, dataNascimento, endereco, setor, funcao, email, sexualidade, sexo, telefone, dataAdmissao, crm, valorConsulta);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;

        this.valorCirurgia = valorCirurgia;
    }//Fim do Construtor Personalizado / End of Personalized Constructor;

    public final float retornarValorCirurgia()
    {
        return valorCirurgia;
    }
    //Fim dos Métodos Retornadores / End of Getters Methods;

}//Fim da Classe / End of Class;
