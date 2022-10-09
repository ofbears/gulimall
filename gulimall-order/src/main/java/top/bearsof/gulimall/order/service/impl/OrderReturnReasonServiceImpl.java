package top.bearsof.gulimall.order.service.impl;

import top.bearsof.gulimall.order.entity.OrderReturnReason;
import top.bearsof.gulimall.order.mapper.OrderReturnReasonMapper;
import top.bearsof.gulimall.order.service.IOrderReturnReasonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 退货原因 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements IOrderReturnReasonService {

}
