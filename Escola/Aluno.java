package Escola;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    private String nome;
    private String matricula;
    private LocalDate dataNascimento;
    private Enum_NivelEnsino nivelEscolar; 

    public Aluno() {
        this.nome = null;
        this.matricula = null;
        this.dataNascimento = null;
        this.nivelEscolar = null;
    }

    public Aluno(String nome, String matricula, String dataNascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.dataNascimento = LocalDate.parse(dataNascimento);
        this.nivelEscolar = atribuirNivelEscolar();
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

    public void imprimirTudo() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        System.out.println(this.dataNascimento);
        System.out.println(this.nivelEscolar);
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
}
