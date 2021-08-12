package br.com.dominio.api.empresa.departamento;

import java.util.ArrayList;

import java.util.Date;

import br.com.dominio.api.pessoas.Funcionario;

import br.com.dominio.api.pessoas.dados.Endereco;

import br.com.dominio.api.pessoas.dados.TelefonePessoaFisica;

//Fim dos Imports / End of Imports;


public final class Diretor extends Funcionario
{
    private ArrayList<Gerente> listaGerentes = new ArrayList<>(10);

    //Fim do Campo de Declaração de Atributos / End of Attributes Declaration Field;


    public Diretor()
    {

    }//Fim do Construtor Padrão / End of Default Constructor;


    public Diretor(String nome, long cpf, Date dataNascimento, Endereco endereco,

                   float salario, String setor, String funcao, String email, String sexualidade, String sexo, Date dataAdmissao, TelefonePessoaFisica telefone)

    {
        super(nome, cpf, dataNascimento, endereco,

                salario, setor, funcao, email, sexualidade, sexo, dataAdmissao, telefone);

        //Fim do Método Super da Classe Mãe / End of Parent Class's Super Method;


    }//Fim do Construtor Personalizado / End of Personalized Constructor;


    public final ArrayList<Gerente> retornarListaGerentes()
    {
        return listaGerentes;
    }
    //Fim do Métodos Retornadores / End of Getter Methods;


    public final void inseriGerenteLista(Gerente novoGerente)
    {
        listaGerentes.add(novoGerente);
    }

    public void removerGerentesLista(Gerente removerGerente)
    {
        listaGerentes.remove(removerGerente);
    }

}//Fim da Classe / End of Class;
