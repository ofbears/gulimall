package top.bearsof.gulimall.product.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.product.entity.CommentReplay;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 商品评价回复关系 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@Mapper
public interface CommentReplayMapper extends BaseMapper<CommentReplay> {

}
