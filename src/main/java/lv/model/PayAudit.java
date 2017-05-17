package lv.model;

import java.util.Date;

public class PayAudit {
    private Long id;

    private Byte status;

    private Byte errorType;

    private String tradeNo;

    private Long amount;

    private Byte payStatus;

    private Date tradeTime;

    private String remark;

    private String payProvider;

    private String outData;

    private Boolean isactive;

    private Date inserttime;

    private Date updatetime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Byte getErrorType() {
        return errorType;
    }

    public void setErrorType(Byte errorType) {
        this.errorType = errorType;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public Date getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getPayProvider() {
        return payProvider;
    }

    public void setPayProvider(String payProvider) {
        this.payProvider = payProvider == null ? null : payProvider.trim();
    }

    public String getOutData() {
        return outData;
    }

    public void setOutData(String outData) {
        this.outData = outData == null ? null : outData.trim();
    }

    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}