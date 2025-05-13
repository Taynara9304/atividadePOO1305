package Escola;
public enum Enum_NivelEnsino {
    FUNDAMENTAL("Entre 6 e 13 anos"), MÉDIO("Entre 14 e 17 anos"), SUPERIOR("Maior que 17 anos");

    private String descricao;

    Enum_NivelEnsino(String descricao) {
        this.descricao =  descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}