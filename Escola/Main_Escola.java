package Escola;

import java.util.ArrayList;
import java.util.List;

public class Main_Escola {
    public static void main(String[] args) {
        List<Enum_NivelEnsino> listaNiveis = new ArrayList<>();

        Enum_NivelEnsino aluno1 = Enum_NivelEnsino.FUNDAMENTAL;
        Enum_NivelEnsino aluno2 = Enum_NivelEnsino.MÉDIO;
        Enum_NivelEnsino aluno3 = Enum_NivelEnsino.SUPERIOR;
        Enum_NivelEnsino aluno4 = Enum_NivelEnsino.FUNDAMENTAL;

        listaNiveis.add(aluno1);
        listaNiveis.add(aluno2);
        listaNiveis.add(aluno3);
        listaNiveis.add(aluno4);

        for (Enum_NivelEnsino aluno : listaNiveis) {
            System.out.println(aluno);
            System.out.println(aluno.getDescricao());
        }
    }
}
