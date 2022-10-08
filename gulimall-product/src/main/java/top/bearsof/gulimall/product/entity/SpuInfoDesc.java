package top.bearsof.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * spu信息介绍
 * </p>
 *
 * @author bears
 * @since 2022-10-08
 */
@TableName("pms_spu_info_desc")
public class SpuInfoDesc implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    private Long spuId;

    /**
     * 商品介绍
     */
    private String decript;

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }
    public String getDecript() {
        return decript;
    }

    public void setDecript(String decript) {
        this.decript = decript;
    }

    @Override
    public String toString() {
        return "SpuInfoDesc{" +
            "spuId=" + spuId +
            ", decript=" + decript +
        "}";
    }
}
