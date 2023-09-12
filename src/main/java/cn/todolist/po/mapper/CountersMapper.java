package cn.todolist.po.mapper;

import cn.todolist.po.model.Counter;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CountersMapper extends BaseMapper<Counter> {

    Counter getCounter(@Param("id") Integer id);

    void upsertCount(Counter counter);

    void clearCount(@Param("id") Integer id);
}
