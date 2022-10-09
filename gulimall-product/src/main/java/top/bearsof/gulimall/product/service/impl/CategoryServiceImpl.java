package top.bearsof.gulimall.product.service.impl;

import top.bearsof.gulimall.product.entity.Category;
import top.bearsof.gulimall.product.mapper.CategoryMapper;
import top.bearsof.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
