package top.bearsof.gulimall.member.service.impl;

import top.bearsof.gulimall.member.entity.MemberLoginLog;
import top.bearsof.gulimall.member.mapper.MemberLoginLogMapper;
import top.bearsof.gulimall.member.service.IMemberLoginLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class MemberLoginLogServiceImpl extends ServiceImpl<MemberLoginLogMapper, MemberLoginLog> implements IMemberLoginLogService {

}
