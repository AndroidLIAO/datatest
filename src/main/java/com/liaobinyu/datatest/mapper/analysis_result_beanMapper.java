package com.liaobinyu.datatest.mapper;

import com.liaobinyu.datatest.bean.analysis_result_bean;
import com.liaobinyu.datatest.bean.analysis_result_beanKey;

public interface analysis_result_beanMapper {
    int deleteByPrimaryKey(analysis_result_beanKey key);

    int insert(analysis_result_bean record);

    int insertSelective(analysis_result_bean record);

    analysis_result_bean selectByPrimaryKey(analysis_result_beanKey key);

    int updateByPrimaryKeySelective(analysis_result_bean record);

    int updateByPrimaryKey(analysis_result_bean record);
}