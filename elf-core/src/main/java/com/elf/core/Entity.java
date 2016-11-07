/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core;

import java.io.Serializable;
import java.util.Date;

/**
 * 实体
 *
 * @author Leon
 */
public interface Entity {

    /**
     * 获取id(主键)
     *
     * @return id
     */
    Serializable getId();

    /**
     * 获取创建时间
     *
     * @return 创建时间
     */
    Date getCreationTime();

    /**
     * 获取修改时间
     *
     * @return 修改时间
     */
    Date getModifiedTime();
}
