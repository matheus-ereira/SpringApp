package com.matheus.cursomc.domain.enums;

/**
 *
 * @author Matheus
 */
public enum TipoCliente {

    PESSOA_FISICA(1, "Pessoa Fisíca"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    private final int codigo;
    private final String descricao;

    private TipoCliente(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer codigo) {
        if (codigo == null) {
            return null;
        }

        for (TipoCliente x : TipoCliente.values()) {
            if (codigo.equals(x.getCodigo())) {
                return x;
            }
        }

        throw new IllegalArgumentException("Id inválido: " + codigo);
    }

}
