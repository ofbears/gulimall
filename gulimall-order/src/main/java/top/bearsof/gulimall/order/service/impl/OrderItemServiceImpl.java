package top.bearsof.gulimall.order.service.impl;

import top.bearsof.gulimall.order.entity.OrderItem;
import top.bearsof.gulimall.order.mapper.OrderItemMapper;
import top.bearsof.gulimall.order.service.IOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements IOrderItemService {

}
