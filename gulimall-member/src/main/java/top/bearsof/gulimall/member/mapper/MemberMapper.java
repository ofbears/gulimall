package top.bearsof.gulimall.member.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.bearsof.gulimall.member.entity.Member;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 * 会员 Mapper 接口
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}
