/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf;

/**
 * 分页，封装请求时分页数据
 *
 * @author Leon
 */
public interface Pageable {
    int getPage();

    int getSize();
}
