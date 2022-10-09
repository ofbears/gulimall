package top.bearsof.gulimall.ware.service.impl;

import top.bearsof.gulimall.ware.entity.WareInfo;
import top.bearsof.gulimall.ware.mapper.WareInfoMapper;
import top.bearsof.gulimall.ware.service.IWareInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仓库信息 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@Service
public class WareInfoServiceImpl extends ServiceImpl<WareInfoMapper, WareInfo> implements IWareInfoService {

}
