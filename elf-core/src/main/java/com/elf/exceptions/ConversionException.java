/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.exceptions;

/**
 * 对象转换异常
 *
 * @author Leon
 */
public class ConversionException extends RuntimeException {


    private static final long serialVersionUID = -7621209883083756793L;

    public ConversionException(String message) {
        super(message);
    }

    public ConversionException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConversionException(Throwable cause) {
        super(cause);
    }
}
