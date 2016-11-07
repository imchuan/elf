/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.exceptions;

/**
 * 业务异常
 *
 * @author Leon
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = -8638659936570202620L;

    public BusinessException(final String message) {
        super(message);
    }


    public BusinessException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BusinessException(final Throwable e) {
        super(e);
    }
}
