package top.bearsof.gulimall.coupon.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.coupon.entity.MemberPrice;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品会员价格 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface MemberPriceMapper extends BaseMapper<MemberPrice> {

}
