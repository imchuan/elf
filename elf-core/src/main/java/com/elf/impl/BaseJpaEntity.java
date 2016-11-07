/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.impl;

import com.elf.Entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 基于JPA默认实体的实现.
 * 主要定义了几个公共字段的数据库字段的映射.
 * 定义了主键id的自动生成策略.
 * 约定：系统所有实体继承该类.
 *
 * @author Leon
 */
@MappedSuperclass
public class BaseJpaEntity implements Entity {
    /**
     * 主键id
     */
    private String id;
    /**
     * 创建时间
     */
    private Date creationTime;
    /**
     * 修改时间
     */
    private Date modifiedTime;

    /**
     * 版本
     */
    private Long version;


    /**
     * 定义了id的生成策略为：系统UUID.
     * 定义数据库中字段长度为50
     *
     * @return id
     */
    @Id
    @GeneratedValue(generator = "system-uuid")
    @Column(name = "id", nullable = false, insertable = true, updatable = true, length = 50)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "creationTime", nullable = true, insertable = true, updatable = true)
    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Column(name = "modifiedTime", nullable = true, insertable = true, updatable = true)
    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    @Version
    @Column(name = "version", nullable = false, insertable = true, updatable = true)
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }
}
