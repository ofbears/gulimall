package top.bearsof.gulimall.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import top.bearsof.gulimall.common.utils.Result;
import top.bearsof.gulimall.member.feign.CouponFeignService;

import java.util.List;

/**
 * <p>
 * 会员收藏的商品 前端控制器
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@RestController
@RequestMapping("/member/memberCollectSpu")
public class MemberCollectSpuController {

    @Autowired
    private CouponFeignService couponFeignService;

    @GetMapping("/list")
    public Result<String> list() {
        Result<List<String>> demo = couponFeignService.getDemo();
        List<String> data = demo.getData();
        String s = data.get(1);
        return Result.error(200, s);
    }

}
