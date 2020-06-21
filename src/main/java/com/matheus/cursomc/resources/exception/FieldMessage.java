package com.matheus.cursomc.resources.exception;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author Matheus
 */
@Data
public class FieldMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String message;

    public FieldMessage() {
    }

    @Builder
    public FieldMessage(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

}
