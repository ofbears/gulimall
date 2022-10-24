package top.bearsof.gulimall.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import top.bearsof.gulimall.common.utils.Result;
import top.bearsof.gulimall.product.entity.Category;
import top.bearsof.gulimall.product.service.CategoryService;

import java.util.List;

/**
 * <p>
 * 商品三级分类 前端控制器
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@RestController
@RequestMapping("/product/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list/tree")
    public Result<Category> list(){
        List<Category> categoryList = categoryService.listWithTree();
        return Result.success(200,categoryList);
    }

}
