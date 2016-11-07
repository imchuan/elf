/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core;

/**
 * 公共字段
 *
 * @author Leon
 */
public enum CommonFieldEnum implements Enumeration {
    /**
     * id
     */
    ID("id"),
    /**
     * 创建时间
     */
    CREATION_TIME("creationTime"),
    /**
     * 修改时间
     */
    MODIFIED_TIME("modifiedTime");


    private final String code;

    CommonFieldEnum(String code) {
        this.code = code;
    }

    @Override
    public String getCode() {
        return this.code;
    }
}
