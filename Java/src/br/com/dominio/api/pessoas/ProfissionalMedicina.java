package br.com.dominio.api.pessoas;

import java.util.Date;

import br.com.dominio.api.pessoas.dados.*;

//

public abstract class ProfissionalMedicina extends Funcionario
{
    private String crm;

    //

    public ProfissionalMedicina()
    {

    }//

    public ProfissionalMedicina(String nome, int cpf, Date dataNascimento, Endereco endereco, String setor, String funcao, String email, String sexualidade, String sexo, Telefone telefone, Date dataAdmissao, String crm)
    {
        super(nome, cpf, dataNascimento, endereco, setor, funcao, email, sexualidade, sexo, telefone, dataAdmissao);

        //

        this.crm = crm;
    }//


}//Fim da Classe / End of Class;
