/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.impl;

import com.elf.Pageable;

/**
 * 分页请求数据封装
 *
 * @author Leon
 */
public class PageRequest implements Pageable {
    private final int page;
    private final int size;

    public PageRequest(int page, int size) {
        this.page = page;
        this.size = size;
    }

    @Override
    public int getPage() {
        return this.page;
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
