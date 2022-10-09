package top.bearsof.gulimall.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.order.entity.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}
