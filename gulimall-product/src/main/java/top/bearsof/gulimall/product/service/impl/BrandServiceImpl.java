package top.bearsof.gulimall.product.service.impl;

import top.bearsof.gulimall.product.entity.Brand;
import top.bearsof.gulimall.product.mapper.BrandMapper;
import top.bearsof.gulimall.product.service.IBrandService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 品牌 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements IBrandService {

}
