package net.biancheng.c.mapper;

import net.biancheng.c.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    Dept selectByPrimaryKey(Integer deptNo);
    //获取表中的全部数据
    List<Dept> GetAll();
}
