package top.bearsof.gulimall.member.service.impl;

import top.bearsof.gulimall.member.entity.Member;
import top.bearsof.gulimall.member.mapper.MemberMapper;
import top.bearsof.gulimall.member.service.IMemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements IMemberService {

}
