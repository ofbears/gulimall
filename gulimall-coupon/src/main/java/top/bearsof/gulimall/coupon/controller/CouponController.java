package top.bearsof.gulimall.coupon.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import top.bearsof.gulimall.common.utils.Result;
import top.bearsof.gulimall.coupon.entity.Coupon;
import top.bearsof.gulimall.coupon.service.ICouponService;

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

    @Autowired
    private ICouponService iCouponService;
    @GetMapping("/get/coupon")
    public Result<List<String>> getDemo(){
        List<Coupon> list = iCouponService.list();
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
