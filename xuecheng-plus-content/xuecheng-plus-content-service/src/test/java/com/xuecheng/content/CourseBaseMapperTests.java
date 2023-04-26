package com.xuecheng.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.mapper.CourseCategoryMapper;
import com.xuecheng.content.model.dto.CourseCategoryTreeDto;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseCategoryService;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
public class CourseBaseMapperTests {

    @Resource
    private CourseBaseMapper courseBaseMapper;

    @Resource
    private CourseCategoryMapper courseCategoryMapper;

    @Resource
    private CourseCategoryService courseCategoryService;
    @Test
    void testCourseBaseMapper() {
//        CourseBase courseBase = courseBaseMapper.selectById(1L);
//        System.out.println(courseBase);
//
//        List<CourseCategoryTreeDto> courseCategoryTreeDtos = courseCategoryMapper.selectTreeNodes("1");
//        System.out.println(courseCategoryTreeDtos);
        System.out.println(courseCategoryService.queryTreeNodes("1"));
//        CourseBase courseBase = courseBaseMapper.selectById(74L);
//        Assertions.assertNotNull(courseBase);
//
//        //测试查询接口
//        LambdaQueryWrapper<CourseBase> queryWrapper = new LambdaQueryWrapper<>();
//        //查询条件
//        QueryCourseParamsDto queryCourseParamsDto = new QueryCourseParamsDto();
//        queryCourseParamsDto.setCourseName("java");
//        queryCourseParamsDto.setAuditStatus("202004");
//        queryCourseParamsDto.setPublishStatus("203001");
//
//        //拼接查询条件
//        //根据课程名称模糊查询  name like '%名称%'
//        queryWrapper.like(StringUtils.isNotEmpty(queryCourseParamsDto.getCourseName()),CourseBase::getName,queryCourseParamsDto.getCourseName());
//        //根据课程审核状态
//        queryWrapper.eq(StringUtils.isNotEmpty(queryCourseParamsDto.getAuditStatus()),CourseBase::getAuditStatus,queryCourseParamsDto.getAuditStatus());
//
//
//
//        //分页参数
//        PageParams pageParams = new PageParams();
//        pageParams.setPageNo(1L);//页码
//        pageParams.setPageSize(3L);//每页记录数
//        Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());
//
//        //分页查询E page 分页参数, @Param("ew") Wrapper<T> queryWrapper 查询条件
//        Page<CourseBase> pageResult = courseBaseMapper.selectPage(page, queryWrapper);
//
//        //数据
//        List<CourseBase> items = pageResult.getRecords();
//        //总记录数
//        long total = pageResult.getTotal();
//
//        //准备返回数据 List<T> items, long counts, long page, long pageSize
//        PageResult<CourseBase> courseBasePageResult = new PageResult<>(items, total, pageParams.getPageNo(), pageParams.getPageSize());
//        System.out.println(courseBasePageResult);
    }
}
