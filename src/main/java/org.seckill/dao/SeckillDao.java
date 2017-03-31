package org.seckill.dao;

import org.apache.ibatis.annotations.Param;
import org.seckill.entity.Seckill;
import java.util.Date;
import java.util.List;

/**
 * Created by cheng on 2017/3/12.
 */
public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return 如果影响行数>1，表示更新的行数
     */
    int reduceNumber(@Param("seckillId") long seckillId,@Param("killTime") Date killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offset
     * @param limit
     * @return
     */
    //java没有保存形参的记录： queryAll(int offset,int limit)=> queryAll(arg0,arg1)
    //因此需要用mybatis中的@Param注解来说明
    List<Seckill> queryAll(@Param("offset") int offset,@Param("limit") int limit);
}
