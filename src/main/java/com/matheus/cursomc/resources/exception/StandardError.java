package com.matheus.cursomc.resources.exception;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author Matheus
 */
@Data
public class StandardError implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer status;
    private String msg;
    private long timeStamp;

    public StandardError() {
    }

    @Builder
    public StandardError(Integer status, String msg, long timeStamp) {
        this.status = status;
        this.msg = msg;
        this.timeStamp = timeStamp;
    }

}
