package com.xuecheng.base.model;


import lombok.Data;

/**
 * 分页参数
 */
@Data
public class PageParams {

    private Long pageNo = 1L;
    private Long pageSize = 10L;

    public PageParams() {
    }

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
