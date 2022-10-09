package top.bearsof.gulimall.order.service.impl;

import top.bearsof.gulimall.order.entity.OrderSetting;
import top.bearsof.gulimall.order.mapper.OrderSettingMapper;
import top.bearsof.gulimall.order.service.IOrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements IOrderSettingService {

}
