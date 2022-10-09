package top.bearsof.gulimall.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.member.entity.MemberLoginLog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员登录记录 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface MemberLoginLogMapper extends BaseMapper<MemberLoginLog> {

}
