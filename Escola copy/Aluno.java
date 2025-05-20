package Escola;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class Aluno {
    private String nome;
    private String matricula;
    private LocalDate dataNascimento;
    private Enum_NivelEnsino nivelEscolar;
    Boolean ativo = Boolean.TRUE;

    public Aluno() {
        this.nome = null;
        this.matricula = null;
        this.dataNascimento = null;
        this.nivelEscolar = null;
    }

    public Aluno(String nome, String matricula, String dataNascimento, String ativo) {
        this.nome = nome;
        this.matricula = matricula;

        try {
            this.dataNascimento = LocalDate.parse(dataNascimento);
            this.nivelEscolar = atribuirNivelEscolar();
            this.ativo = verificarAtivo(ativo);
        } catch (DateTimeParseException e) {
            System.out.println("Erro ao converter a data de nascimento: " + dataNascimento);
            System.out.println("Formato esperado: yyyy-MM-dd (ex: 2005-03-15)");
            this.dataNascimento = null;
            this.nivelEscolar = null;
        }
    }

    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    public Enum_NivelEnsino atribuirNivelEscolar() {
        int idade = calcularIdade();

        if (idade >= 6 && idade <= 13) {
            return nivelEscolar = Enum_NivelEnsino.FUNDAMENTAL;
        } else if (idade >= 14 && idade <= 17) {
            return nivelEscolar = Enum_NivelEnsino.MEDIO;
        } else if (idade >= 18) {
            return nivelEscolar = Enum_NivelEnsino.SUPERIOR;
        }

        return Enum_NivelEnsino.EDUCACAO_INFANTIL;
    }

    private Boolean verificarAtivo(String ativoStr) {
        if (ativoStr.equals("sim")) {
            return Boolean.TRUE;
        } else if (ativoStr.equals("não") || ativoStr.equals("nao")) {
            return Boolean.FALSE;
        } else {
            System.out.println("Valor inválido! Use 'sim' ou 'não'");
        }
    
        return null;
    }
    

    public void imprimirTudo() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Data de nascimento: " + this.dataNascimento);
        System.out.println("Nivel escolar: " + this.nivelEscolar);
        System.out.print("Situação: ");
        if (Boolean.TRUE.equals(this.ativo)) {
            System.out.print("Ativo");
        } else {
            System.out.print("Inativo");
        }
        System.out.println("\n");
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Enum_NivelEnsino getNivelEscolar() {
        return nivelEscolar;
    }

    public void setNivelEscolar(Enum_NivelEnsino nivelEscolar) {
        this.nivelEscolar = nivelEscolar;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
