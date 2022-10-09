package top.bearsof.gulimall.order.service.impl;

import top.bearsof.gulimall.order.entity.PaymentInfo;
import top.bearsof.gulimall.order.mapper.PaymentInfoMapper;
import top.bearsof.gulimall.order.service.IPaymentInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class PaymentInfoServiceImpl extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements IPaymentInfoService {

}
