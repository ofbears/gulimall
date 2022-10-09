package top.bearsof.gulimall.order.service.impl;

import top.bearsof.gulimall.order.entity.Order;
import top.bearsof.gulimall.order.mapper.OrderMapper;
import top.bearsof.gulimall.order.service.IOrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements IOrderService {

}
