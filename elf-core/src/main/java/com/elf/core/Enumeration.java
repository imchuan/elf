/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core;

import java.io.Serializable;

/**
 * 枚举
 *
 * @author Leon
 */
public interface Enumeration extends Serializable {

    /**
     * 获取代码
     *
     * @return 枚举值代码
     */
    String getCode();
}
