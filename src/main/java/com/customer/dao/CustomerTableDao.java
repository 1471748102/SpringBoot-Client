package com.customer.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.customer.entity.CustomerTable;
import org.apache.ibatis.annotations.Mapper;

/**
 * (CustomerTable)表数据库访问层
 *
 * @author makejava
 * @since 2020-02-14 16:54:33
 */
@Mapper
public interface CustomerTableDao extends BaseMapper<CustomerTable> {

}