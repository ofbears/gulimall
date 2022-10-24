package top.bearsof.gulimall.product.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import top.bearsof.gulimall.product.entity.Category;
import top.bearsof.gulimall.product.mapper.CategoryMapper;
import top.bearsof.gulimall.product.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {


    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> listWithTree() {
        //查询出所有的分类
        List<Category> categoryList = categoryMapper.selectList(null);
        //查找出所有的一级分类
        //一级分类树，避免空指针
        Long firstNum = 0L;
        List<Category> firstCategory = categoryList.stream().filter((categoryEntity) -> {
            return firstNum.equals(categoryEntity.getParentCid());
        }).map((entity) -> {
            //设置子菜单
            entity.setChildren(getChildren(entity, categoryList));
            return entity;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return firstCategory;
    }

    //递归查询所有菜单的子菜单
    private List<Category> getChildren(Category root, List<Category> all) {
        //第一调用查出二级菜单，递归查出三级菜单
        List<Category> children = all.stream().filter(category -> {
            return category.getParentCid().longValue() == root.getCatId().longValue();
        }).map((item) -> {
            //递归找下一级菜单
            item.setChildren(getChildren(item, all));
            return item;
        //菜单的排序
        }).sorted((menu1, menu2) -> {
            //排除空指针的可能性
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return children;
    }

}
