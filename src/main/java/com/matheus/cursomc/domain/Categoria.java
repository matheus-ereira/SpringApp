package com.matheus.cursomc.domain;

import java.io.Serializable;
import java.util.Objects;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author Matheus
 */
@Data
public class Categoria implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String nome;

    @Builder
    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
