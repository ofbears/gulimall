package top.bearsof.gulimall.product.service;

import top.bearsof.gulimall.product.entity.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 商品三级分类 服务类
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
public interface CategoryService extends IService<Category> {
    List<Category> listWithTree();
}
