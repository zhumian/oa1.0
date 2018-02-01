package com.zhumian.mapper.sys;

import com.zhumian.entity.sys.Right;
import com.zhumian.entity.sys.RightVO;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

@Repository
public interface RightMapper extends Mapper<Right> {


    List<RightVO> queryRights(Map map);
}