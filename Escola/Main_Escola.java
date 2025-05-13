package Escola;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main_Escola {
    public static void main(String[] args) {
        List<Aluno> listaAlunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("Larissa", "1223", "2010-09-10");
        Aluno aluno2 = new Aluno("Fernanda", "2444", "2001-05-01");
        Aluno aluno3 = new Aluno("Arthur", "6542", "2012-03-23");
        Aluno aluno4 = new Aluno("Amanda", "4122", "2020-12-04");

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);

        for (Aluno aluno : listaAlunos) {
            aluno.imprimirTudo();
        }
    }
}
