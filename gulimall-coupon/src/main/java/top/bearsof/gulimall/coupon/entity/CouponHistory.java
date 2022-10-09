package top.bearsof.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 优惠券领取历史记录
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@TableName("sms_coupon_history")
public class CouponHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 优惠券id
     */
    private Long couponId;

    /**
     * 会员id
     */
    private Long memberId;

    /**
     * 会员名字
     */
    private String memberNickName;

    /**
     * 获取方式[0->后台赠送；1->主动领取]
     */
    private Boolean getType;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 使用状态[0->未使用；1->已使用；2->已过期]
     */
    private Boolean useType;

    /**
     * 使用时间
     */
    private LocalDateTime useTime;

    /**
     * 订单id
     */
    private Long orderId;

    /**
     * 订单号
     */
    private Long orderSn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }
    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }
    public String getMemberNickName() {
        return memberNickName;
    }

    public void setMemberNickName(String memberNickName) {
        this.memberNickName = memberNickName;
    }
    public Boolean getGetType() {
        return getType;
    }

    public void setGetType(Boolean getType) {
        this.getType = getType;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public Boolean getUseType() {
        return useType;
    }

    public void setUseType(Boolean useType) {
        this.useType = useType;
    }
    public LocalDateTime getUseTime() {
        return useTime;
    }

    public void setUseTime(LocalDateTime useTime) {
        this.useTime = useTime;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(Long orderSn) {
        this.orderSn = orderSn;
    }

    @Override
    public String toString() {
        return "CouponHistory{" +
            "id=" + id +
            ", couponId=" + couponId +
            ", memberId=" + memberId +
            ", memberNickName=" + memberNickName +
            ", getType=" + getType +
            ", createTime=" + createTime +
            ", useType=" + useType +
            ", useTime=" + useTime +
            ", orderId=" + orderId +
            ", orderSn=" + orderSn +
        "}";
    }
}
