/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core;

import java.io.Serializable;

/**
 * DTO
 *
 * @author Leon
 */
public interface Dto {

    /**
     * 获取主键
     *
     * @return 主键
     */
    Serializable getId();

    /**
     * 获取创建时间
     *
     * @return 时间字符串
     */
    String getCreationTime();

    /**
     * 获取修改时间
     *
     * @return 时间字符串
     */
    String getModifiedTime();
}
