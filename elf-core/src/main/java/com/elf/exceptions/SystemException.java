/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.exceptions;

/**
 * 系统异常
 *
 * @author Leon
 */
public class SystemException extends RuntimeException {

    private static final long serialVersionUID = -4573258541087279220L;

    public SystemException() {
    }

    public SystemException(String message) {
        super(message);
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
