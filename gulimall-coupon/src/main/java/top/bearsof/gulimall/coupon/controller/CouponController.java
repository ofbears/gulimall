package top.bearsof.gulimall.coupon.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import top.bearsof.gulimall.common.utils.Result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 * 优惠券信息 前端控制器
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@RefreshScope
@RestController
@RequestMapping("/coupon/coupon")
public class CouponController {
    @GetMapping("/get/coupon")
    public Result<List<String>> getDemo(){
        List<String> list = new ArrayList<>();
        Collections.addAll(list,"王五","赵六","宋七");
        return Result.success(200,list);
    }

    @Value("${user.name}")
    private String name;

    @Value("${user.age}")
    private String age;

    @GetMapping("/test")
    public Result<String> test(){
        return Result.error(200,name+age);
    }
}
