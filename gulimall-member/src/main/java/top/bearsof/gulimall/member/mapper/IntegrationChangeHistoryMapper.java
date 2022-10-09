package top.bearsof.gulimall.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.member.entity.IntegrationChangeHistory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 积分变化历史记录 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface IntegrationChangeHistoryMapper extends BaseMapper<IntegrationChangeHistory> {

}
