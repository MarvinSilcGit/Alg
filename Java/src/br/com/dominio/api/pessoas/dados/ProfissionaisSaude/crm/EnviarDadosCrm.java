package br.com.dominio.api.pessoas.dados.ProfissionaisSaude.crm;


import br.com.dominio.api.pessoas.dados.regulador.IRecebeDadosCrm;

//Fim dos Imports / End of Imports;


public final class EnviarDadosCrm implements IRecebeDadosCrm
{
    private ProfissionalMedicina profissionalMedicina;

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    @Override
    public String nomeProfissional()
    {
        return profissionalMedicina.retornarNome();
    }
}
