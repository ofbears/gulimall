package top.bearsof.gulimall.order.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * <p>
 * 订单退货申请
 * </p>
 *
 * @author bears
 * @since 2022-10-09
 */
@TableName("oms_order_return_apply")
public class OrderReturnApply implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * order_id
     */
    private Long orderId;

    /**
     * 退货商品id
     */
    private Long skuId;

    /**
     * 订单编号
     */
    private String orderSn;

    /**
     * 申请时间
     */
    private LocalDateTime createTime;

    /**
     * 会员用户名
     */
    private String memberUsername;

    /**
     * 退款金额
     */
    private BigDecimal returnAmount;

    /**
     * 退货人姓名
     */
    private String returnName;

    /**
     * 退货人电话
     */
    private String returnPhone;

    /**
     * 申请状态[0->待处理；1->退货中；2->已完成；3->已拒绝]
     */
    private Boolean status;

    /**
     * 处理时间
     */
    private LocalDateTime handleTime;

    /**
     * 商品图片
     */
    private String skuImg;

    /**
     * 商品名称
     */
    private String skuName;

    /**
     * 商品品牌
     */
    private String skuBrand;

    /**
     * 商品销售属性(JSON)
     */
    private String skuAttrsVals;

    /**
     * 退货数量
     */
    private Integer skuCount;

    /**
     * 商品单价
     */
    private BigDecimal skuPrice;

    /**
     * 商品实际支付单价
     */
    private BigDecimal skuRealPrice;

    /**
     * 原因
     */
    private String reason;

    /**
     * 描述
     */
    private String description述;

    /**
     * 凭证图片，以逗号隔开
     */
    private String descPics;

    /**
     * 处理备注
     */
    private String handleNote;

    /**
     * 处理人员
     */
    private String handleMan;

    /**
     * 收货人
     */
    private String receiveMan;

    /**
     * 收货时间
     */
    private LocalDateTime receiveTime;

    /**
     * 收货备注
     */
    private String receiveNote;

    /**
     * 收货电话
     */
    private String receivePhone;

    /**
     * 公司收货地址
     */
    private String companyAddress;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }
    public Long getSkuId() {
        return skuId;
    }

    public void setSkuId(Long skuId) {
        this.skuId = skuId;
    }
    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }
    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
    public String getMemberUsername() {
        return memberUsername;
    }

    public void setMemberUsername(String memberUsername) {
        this.memberUsername = memberUsername;
    }
    public BigDecimal getReturnAmount() {
        return returnAmount;
    }

    public void setReturnAmount(BigDecimal returnAmount) {
        this.returnAmount = returnAmount;
    }
    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName;
    }
    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone;
    }
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
    public LocalDateTime getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(LocalDateTime handleTime) {
        this.handleTime = handleTime;
    }
    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }
    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }
    public String getSkuBrand() {
        return skuBrand;
    }

    public void setSkuBrand(String skuBrand) {
        this.skuBrand = skuBrand;
    }
    public String getSkuAttrsVals() {
        return skuAttrsVals;
    }

    public void setSkuAttrsVals(String skuAttrsVals) {
        this.skuAttrsVals = skuAttrsVals;
    }
    public Integer getSkuCount() {
        return skuCount;
    }

    public void setSkuCount(Integer skuCount) {
        this.skuCount = skuCount;
    }
    public BigDecimal getSkuPrice() {
        return skuPrice;
    }

    public void setSkuPrice(BigDecimal skuPrice) {
        this.skuPrice = skuPrice;
    }
    public BigDecimal getSkuRealPrice() {
        return skuRealPrice;
    }

    public void setSkuRealPrice(BigDecimal skuRealPrice) {
        this.skuRealPrice = skuRealPrice;
    }
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
    public String getDescription述() {
        return description述;
    }

    public void setDescription述(String description述) {
        this.description述 = description述;
    }
    public String getDescPics() {
        return descPics;
    }

    public void setDescPics(String descPics) {
        this.descPics = descPics;
    }
    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote;
    }
    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan;
    }
    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }
    public LocalDateTime getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(LocalDateTime receiveTime) {
        this.receiveTime = receiveTime;
    }
    public String getReceiveNote() {
        return receiveNote;
    }

    public void setReceiveNote(String receiveNote) {
        this.receiveNote = receiveNote;
    }
    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    @Override
    public String toString() {
        return "OrderReturnApply{" +
            "id=" + id +
            ", orderId=" + orderId +
            ", skuId=" + skuId +
            ", orderSn=" + orderSn +
            ", createTime=" + createTime +
            ", memberUsername=" + memberUsername +
            ", returnAmount=" + returnAmount +
            ", returnName=" + returnName +
            ", returnPhone=" + returnPhone +
            ", status=" + status +
            ", handleTime=" + handleTime +
            ", skuImg=" + skuImg +
            ", skuName=" + skuName +
            ", skuBrand=" + skuBrand +
            ", skuAttrsVals=" + skuAttrsVals +
            ", skuCount=" + skuCount +
            ", skuPrice=" + skuPrice +
            ", skuRealPrice=" + skuRealPrice +
            ", reason=" + reason +
            ", description述=" + description述 +
            ", descPics=" + descPics +
            ", handleNote=" + handleNote +
            ", handleMan=" + handleMan +
            ", receiveMan=" + receiveMan +
            ", receiveTime=" + receiveTime +
            ", receiveNote=" + receiveNote +
            ", receivePhone=" + receivePhone +
            ", companyAddress=" + companyAddress +
        "}";
    }
}
