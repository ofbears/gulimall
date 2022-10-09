package top.bearsof.gulimall.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.product.entity.CategoryBrandRelation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 品牌分类关联 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@Mapper
public interface CategoryBrandRelationMapper extends BaseMapper<CategoryBrandRelation> {

}
