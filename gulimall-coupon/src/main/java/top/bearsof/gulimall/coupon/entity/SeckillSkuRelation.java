package top.bearsof.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 秒杀活动商品关联
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@TableName("sms_seckill_sku_relation")
public class SeckillSkuRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 活动id
     */
    private Long promotionId;

    /**
     * 活动场次id
     */
    private Long promotionSessionId;

    /**
     * 商品id
     */
    private Long skuId;

    /**
     * 秒杀价格
     */
    private BigDecimal seckillPrice;

    /**
     * 秒杀总量
     */
    private BigDecimal seckillCount;

    /**
     * 每人限购数量
     */
    private BigDecimal seckillLimit;

    /**
     * 排序
     */
    private Integer seckillSort;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(Long promotionId) {
        this.promotionId = promotionId;
    }
    public Long getPromotionSessionId() {
        return promotionSessionId;
    }

    public void setPromotionSessionId(Long promotionSessionId) {
        this.promotionSessionId = promotionSessionId;
    }
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
    public BigDecimal getSeckillPrice() {
        return seckillPrice;
    }

    public void setSeckillPrice(BigDecimal seckillPrice) {
        this.seckillPrice = seckillPrice;
    }
    public BigDecimal getSeckillCount() {
        return seckillCount;
    }

    public void setSeckillCount(BigDecimal seckillCount) {
        this.seckillCount = seckillCount;
    }
    public BigDecimal getSeckillLimit() {
        return seckillLimit;
    }

    public void setSeckillLimit(BigDecimal seckillLimit) {
        this.seckillLimit = seckillLimit;
    }
    public Integer getSeckillSort() {
        return seckillSort;
    }

    public void setSeckillSort(Integer seckillSort) {
        this.seckillSort = seckillSort;
    }

    @Override
    public String toString() {
        return "SeckillSkuRelation{" +
            "id=" + id +
            ", promotionId=" + promotionId +
            ", promotionSessionId=" + promotionSessionId +
            ", skuId=" + skuId +
            ", seckillPrice=" + seckillPrice +
            ", seckillCount=" + seckillCount +
            ", seckillLimit=" + seckillLimit +
            ", seckillSort=" + seckillSort +
        "}";
    }
}
