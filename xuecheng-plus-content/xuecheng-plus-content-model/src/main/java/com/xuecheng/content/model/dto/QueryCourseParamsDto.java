package com.xuecheng.content.model.dto;


import lombok.Data;

/**
 * 查询课程dto
 */
@Data
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;

    //课程名称
    private String courseName;

    //发布状态
    private String publishStatus;
}
