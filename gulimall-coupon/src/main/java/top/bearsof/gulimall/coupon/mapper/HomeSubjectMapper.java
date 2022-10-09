package top.bearsof.gulimall.coupon.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.coupon.entity.HomeSubject;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubject> {

}
