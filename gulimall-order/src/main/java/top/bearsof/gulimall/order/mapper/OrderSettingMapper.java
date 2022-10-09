package top.bearsof.gulimall.order.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.order.entity.OrderSetting;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 订单配置信息 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface OrderSettingMapper extends BaseMapper<OrderSetting> {

}
