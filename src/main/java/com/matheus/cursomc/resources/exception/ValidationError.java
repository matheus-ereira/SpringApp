package com.matheus.cursomc.resources.exception;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Matheus
 */
public class ValidationError extends StandardError {
    private static final long serialVersionUID = 1L;

    private final List<FieldMessage> errors = new ArrayList<>();

    public ValidationError(Integer status, String msg, long timeStamp) {
        super(status, msg, timeStamp);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }

}
