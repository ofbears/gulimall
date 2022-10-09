package top.bearsof.gulimall.ware.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.ware.entity.Purchase;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 采购信息 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface PurchaseMapper extends BaseMapper<Purchase> {

}
