package top.bearsof.gulimall.coupon.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.coupon.entity.Coupon;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 优惠券信息 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */

@Mapper
public interface CouponMapper extends BaseMapper<Coupon> {

}
