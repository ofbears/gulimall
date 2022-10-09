package top.bearsof.gulimall.coupon.service.impl;

import top.bearsof.gulimall.coupon.entity.HomeSubject;
import top.bearsof.gulimall.coupon.mapper.HomeSubjectMapper;
import top.bearsof.gulimall.coupon.service.IHomeSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class HomeSubjectServiceImpl extends ServiceImpl<HomeSubjectMapper, HomeSubject> implements IHomeSubjectService {

}
