package top.bearsof.gulimall.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.member.entity.GrowthChangeHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 成长值变化历史记录 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */

@Mapper
public interface GrowthChangeHistoryMapper extends BaseMapper<GrowthChangeHistory> {

}
