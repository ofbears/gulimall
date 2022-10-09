package top.bearsof.gulimall.order.service.impl;

import top.bearsof.gulimall.order.entity.OrderOperateHistory;
import top.bearsof.gulimall.order.mapper.OrderOperateHistoryMapper;
import top.bearsof.gulimall.order.service.IOrderOperateHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单操作历史记录 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryMapper, OrderOperateHistory> implements IOrderOperateHistoryService {

}
