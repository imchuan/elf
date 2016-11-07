/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.exceptions;


/**
 * @author Leon
 */
public class ServiceException extends SystemException {

    public ServiceException() {
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(Throwable cause) {
        super(cause);
    }
}
