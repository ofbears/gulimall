package top.bearsof.gulimall.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.order.entity.OrderReturnReason;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 退货原因 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface OrderReturnReasonMapper extends BaseMapper<OrderReturnReason> {

}
