/*
 * Copyright (c) 2016 Elf Framework All rights reserved.
 */

package com.elf.core.impl;

import com.elf.core.Page;
import com.elf.core.Pageable;

import java.io.Serializable;
import java.util.List;

/**
 * 封装分页查询的结果集
 *
 * @author Leon
 */
public class QueryPageImpl<T> implements Page<T>, Serializable {

    private static final long serialVersionUID = 3320013827278948976L;

    /**
     * 记录
     */
    private final List<T> rows;

    private final Pageable pageInfo;

    /**
     * 总条数
     */
    private final long total;

    public QueryPageImpl(List<T> rows, Pageable pageInfo, long total) {
        this.rows = rows;
        this.pageInfo = pageInfo;
        this.total = total;
    }

    @Override
    public List<T> getRows() {
        return this.rows;
    }

    @Override
    public int getPage() {
        return this.pageInfo.getPage();
    }

    @Override
    public int getSize() {
        return this.pageInfo.getSize();
    }

    @Override
    public long getTotal() {
        return this.total;
    }

    @Override
    public int getTotalPages() {
        return (int) (this.total / (long) this.getSize()) + (this.total % (long) this.getSize() > 0L ? 1 : 0);
    }


}
