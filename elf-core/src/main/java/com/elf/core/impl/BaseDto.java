/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core.impl;

import com.elf.core.Dto;

/**
 * DTO 默认的实现.
 * 实现了Builder模式.
 *
 * @author Leon
 */
public class BaseDto implements Dto {
    private String id;
    private String creationTime;
    private String modifiedTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public String getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(String modifiedTime) {
        this.modifiedTime = modifiedTime;
    }


    protected BaseDto() {

    }

    protected BaseDto(Builder builder) {
        setId(builder.getId());
        setCreationTime(builder.getCreationTime());
        setModifiedTime(builder.getModifiedTime());
    }

    public abstract static class Builder<T extends Builder<T>> {
        private String id;
        private String creationTime;
        private String modifiedTime;


        /**
         * sets
         */
        public T setId(String id) {
            this.id = id;
            return self();
        }

        public String getId() {
            return id;
        }

        /**
         * sets 创建时间
         */
        public T setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return self();
        }

        private String getCreationTime() {
            return creationTime;
        }

        /**
         * sets 修改时间
         */
        public T setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return self();
        }

        private String getModifiedTime() {
            return modifiedTime;
        }

        protected abstract T self();
    }
}
