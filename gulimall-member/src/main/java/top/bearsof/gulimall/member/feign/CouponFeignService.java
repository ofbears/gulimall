package top.bearsof.gulimall.member.feign;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import top.bearsof.gulimall.common.utils.Result;

import java.util.List;

@FeignClient("gulimall-coupon")
@Component
public interface CouponFeignService {
    @GetMapping("/coupon/coupon/get/coupon")
    public Result<List<String>> getDemo();
}
