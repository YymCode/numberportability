package com.talkweb.numberportability.sys.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author yym
 * @since 2020-05-28
 */
@TableName("TA_RP_US_NP_BUSI_DEAL_D")
public class TaRpUsNpBusiDealD implements Serializable {

    private static final Long serialVersionUID = 1L;

    @TableField("STATIS_DATE")
    @ExcelProperty("测试字段1")
    private Integer statisDate;

    @TableField("CITY_CODE")
    @ExcelProperty("测试字段2")
    private Integer cityCode;

    @TableField("CITY_NAME")
    @ExcelProperty("测试字段3")
    private String cityName;

    @TableField("CNTY_CODE")
    @ExcelProperty("测试字段4")
    private String cntyCode;

    @TableField("CNTY_NAME")
    @ExcelProperty("测试字段4")
    private String cntyName;

    @TableField("GRID_CODE")
    @ExcelProperty("测试字段4")
    private String gridCode;

    @TableField("GRID_NAME")
    @ExcelProperty("测试字段4")
    private String gridName;

    @TableField("DATA_LVL")
    @ExcelProperty("测试字段4")
    private String dataLvl;

    @TableField("CURD_COND_QUERY_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCondQueryCustNum;

    @TableField("CURD_CARRYOUT_APPLY_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCarryoutApplyCustNum;

    @TableField("CURD_ACCOWI_QUALITY_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdAccowiQualityCustNum;

    @TableField("CURD_DIRECT_ACCOWI_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdDirectAccowiCustNum;
    
    @TableField("CANCEL_BUSI_DISC_ACCOWI_CUST")
    @ExcelProperty("测试字段4")
    private Integer cancelBusiDiscAccowiCust;

    @TableField("CURD_NACCWI_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdNaccwiCustNum;

    @TableField("CURD_SUCC_GRANT_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdSuccGrantCustNum;

    @TableField("CURD_CNCL_CARRYOUT_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCnclCarryoutCustNum;

    @TableField("CURD_CNCL_TELECOM_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCnclTelecomCustNum;

    @TableField("CURD_CNCL_UNICOM_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCnclUnicomCustNum;

    @TableField("CURD_CARRYIN_OPEN_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCarryinOpenCustNum;

    @TableField("CURD_TELECOM_OPEN_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdTelecomOpenCustNum;

    @TableField("CURD_UNICOM_OPEN_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdUnicomOpenCustNum;

    @TableField("CURD_CARRYIN_NUM")
    @ExcelProperty("测试字段4")
    private Integer curdCarryinNum;

    @TableField("CURM_COND_QUERY_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCondQueryCustNum;

    @TableField("CURM_CARRYOUT_APPLY_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCarryoutApplyCustNum;

    @TableField("CURM_ACCOWI_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmAccowiCustNum;

    @TableField("CURM_DIRECT_ACCOWI_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmDirectAccowiCustNum;

    @TableField("CURM_CANCEL_DISC_ACCOWI_CUST")
    @ExcelProperty("测试字段4")
    private Integer curmCancelDiscAccowiCust;

    @TableField("CURM_NACCWI_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmNaccwiCustNum;

    @TableField("CURM_SUCC_GRANT_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmSuccGrantCustNum;

    @TableField("CURM_CNCL_CARRYOUT_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCnclCarryoutCustNum;

    @TableField("CURM_CNCL_TELECOM_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCnclTelecomCustNum;

    @TableField("CURM_CNCL_UNICOM_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCnclUnicomCustNum;

    @TableField("CURM_CARRYIN_OPEN_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCarryinOpenCustNum;

    @TableField("CURM_TELECOM_OPEN_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmTelecomOpenCustNum;

    @TableField("CURM_UNICOM_OPEN_CUST_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmUnicomOpenCustNum;

    @TableField("CURM_CARRYIN_NUM")
    @ExcelProperty("测试字段4")
    private Integer curmCarryinNum;

    public Integer getStatisDate() {
        return statisDate;
    }

    public void setStatisDate(Integer statisDate) {
        this.statisDate = statisDate;
    }
    public Integer getCityCode() {
        return cityCode;
    }

    public void setCityCode(Integer cityCode) {
        this.cityCode = cityCode;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public String getCntyCode() {
        return cntyCode;
    }

    public void setCntyCode(String cntyCode) {
        this.cntyCode = cntyCode;
    }
    public String getCntyName() {
        return cntyName;
    }

    public void setCntyName(String cntyName) {
        this.cntyName = cntyName;
    }
    public String getGridCode() {
        return gridCode;
    }

    public void setGridCode(String gridCode) {
        this.gridCode = gridCode;
    }
    public String getGridName() {
        return gridName;
    }

    public void setGridName(String gridName) {
        this.gridName = gridName;
    }
    public String getDataLvl() {
        return dataLvl;
    }

    public void setDataLvl(String dataLvl) {
        this.dataLvl = dataLvl;
    }
    public Integer getCurdCondQueryCustNum() {
        return curdCondQueryCustNum;
    }

    public void setCurdCondQueryCustNum(Integer curdCondQueryCustNum) {
        this.curdCondQueryCustNum = curdCondQueryCustNum;
    }
    public Integer getCurdCarryoutApplyCustNum() {
        return curdCarryoutApplyCustNum;
    }

    public void setCurdCarryoutApplyCustNum(Integer curdCarryoutApplyCustNum) {
        this.curdCarryoutApplyCustNum = curdCarryoutApplyCustNum;
    }
    public Integer getCurdAccowiQualityCustNum() {
        return curdAccowiQualityCustNum;
    }

    public void setCurdAccowiQualityCustNum(Integer curdAccowiQualityCustNum) {
        this.curdAccowiQualityCustNum = curdAccowiQualityCustNum;
    }
    public Integer getCurdDirectAccowiCustNum() {
        return curdDirectAccowiCustNum;
    }

    public void setCurdDirectAccowiCustNum(Integer curdDirectAccowiCustNum) {
        this.curdDirectAccowiCustNum = curdDirectAccowiCustNum;
    }
    public Integer getCancelBusiDiscAccowiCust() {
        return cancelBusiDiscAccowiCust;
    }

    public void setCancelBusiDiscAccowiCust(Integer cancelBusiDiscAccowiCust) {
        this.cancelBusiDiscAccowiCust = cancelBusiDiscAccowiCust;
    }
    public Integer getCurdNaccwiCustNum() {
        return curdNaccwiCustNum;
    }

    public void setCurdNaccwiCustNum(Integer curdNaccwiCustNum) {
        this.curdNaccwiCustNum = curdNaccwiCustNum;
    }
    public Integer getCurdSuccGrantCustNum() {
        return curdSuccGrantCustNum;
    }

    public void setCurdSuccGrantCustNum(Integer curdSuccGrantCustNum) {
        this.curdSuccGrantCustNum = curdSuccGrantCustNum;
    }
    public Integer getCurdCnclCarryoutCustNum() {
        return curdCnclCarryoutCustNum;
    }

    public void setCurdCnclCarryoutCustNum(Integer curdCnclCarryoutCustNum) {
        this.curdCnclCarryoutCustNum = curdCnclCarryoutCustNum;
    }
    public Integer getCurdCnclTelecomCustNum() {
        return curdCnclTelecomCustNum;
    }

    public void setCurdCnclTelecomCustNum(Integer curdCnclTelecomCustNum) {
        this.curdCnclTelecomCustNum = curdCnclTelecomCustNum;
    }
    public Integer getCurdCnclUnicomCustNum() {
        return curdCnclUnicomCustNum;
    }

    public void setCurdCnclUnicomCustNum(Integer curdCnclUnicomCustNum) {
        this.curdCnclUnicomCustNum = curdCnclUnicomCustNum;
    }
    public Integer getCurdCarryinOpenCustNum() {
        return curdCarryinOpenCustNum;
    }

    public void setCurdCarryinOpenCustNum(Integer curdCarryinOpenCustNum) {
        this.curdCarryinOpenCustNum = curdCarryinOpenCustNum;
    }
    public Integer getCurdTelecomOpenCustNum() {
        return curdTelecomOpenCustNum;
    }

    public void setCurdTelecomOpenCustNum(Integer curdTelecomOpenCustNum) {
        this.curdTelecomOpenCustNum = curdTelecomOpenCustNum;
    }
    public Integer getCurdUnicomOpenCustNum() {
        return curdUnicomOpenCustNum;
    }

    public void setCurdUnicomOpenCustNum(Integer curdUnicomOpenCustNum) {
        this.curdUnicomOpenCustNum = curdUnicomOpenCustNum;
    }
    public Integer getCurdCarryinNum() {
        return curdCarryinNum;
    }

    public void setCurdCarryinNum(Integer curdCarryinNum) {
        this.curdCarryinNum = curdCarryinNum;
    }
    public Integer getCurmCondQueryCustNum() {
        return curmCondQueryCustNum;
    }

    public void setCurmCondQueryCustNum(Integer curmCondQueryCustNum) {
        this.curmCondQueryCustNum = curmCondQueryCustNum;
    }
    public Integer getCurmCarryoutApplyCustNum() {
        return curmCarryoutApplyCustNum;
    }

    public void setCurmCarryoutApplyCustNum(Integer curmCarryoutApplyCustNum) {
        this.curmCarryoutApplyCustNum = curmCarryoutApplyCustNum;
    }
    public Integer getCurmAccowiCustNum() {
        return curmAccowiCustNum;
    }

    public void setCurmAccowiCustNum(Integer curmAccowiCustNum) {
        this.curmAccowiCustNum = curmAccowiCustNum;
    }
    public Integer getCurmDirectAccowiCustNum() {
        return curmDirectAccowiCustNum;
    }

    public void setCurmDirectAccowiCustNum(Integer curmDirectAccowiCustNum) {
        this.curmDirectAccowiCustNum = curmDirectAccowiCustNum;
    }
    public Integer getCurmCancelDiscAccowiCust() {
        return curmCancelDiscAccowiCust;
    }

    public void setCurmCancelDiscAccowiCust(Integer curmCancelDiscAccowiCust) {
        this.curmCancelDiscAccowiCust = curmCancelDiscAccowiCust;
    }
    public Integer getCurmNaccwiCustNum() {
        return curmNaccwiCustNum;
    }

    public void setCurmNaccwiCustNum(Integer curmNaccwiCustNum) {
        this.curmNaccwiCustNum = curmNaccwiCustNum;
    }
    public Integer getCurmSuccGrantCustNum() {
        return curmSuccGrantCustNum;
    }

    public void setCurmSuccGrantCustNum(Integer curmSuccGrantCustNum) {
        this.curmSuccGrantCustNum = curmSuccGrantCustNum;
    }
    public Integer getCurmCnclCarryoutCustNum() {
        return curmCnclCarryoutCustNum;
    }

    public void setCurmCnclCarryoutCustNum(Integer curmCnclCarryoutCustNum) {
        this.curmCnclCarryoutCustNum = curmCnclCarryoutCustNum;
    }
    public Integer getCurmCnclTelecomCustNum() {
        return curmCnclTelecomCustNum;
    }

    public void setCurmCnclTelecomCustNum(Integer curmCnclTelecomCustNum) {
        this.curmCnclTelecomCustNum = curmCnclTelecomCustNum;
    }
    public Integer getCurmCnclUnicomCustNum() {
        return curmCnclUnicomCustNum;
    }

    public void setCurmCnclUnicomCustNum(Integer curmCnclUnicomCustNum) {
        this.curmCnclUnicomCustNum = curmCnclUnicomCustNum;
    }
    public Integer getCurmCarryinOpenCustNum() {
        return curmCarryinOpenCustNum;
    }

    public void setCurmCarryinOpenCustNum(Integer curmCarryinOpenCustNum) {
        this.curmCarryinOpenCustNum = curmCarryinOpenCustNum;
    }
    public Integer getCurmTelecomOpenCustNum() {
        return curmTelecomOpenCustNum;
    }

    public void setCurmTelecomOpenCustNum(Integer curmTelecomOpenCustNum) {
        this.curmTelecomOpenCustNum = curmTelecomOpenCustNum;
    }
    public Integer getCurmUnicomOpenCustNum() {
        return curmUnicomOpenCustNum;
    }

    public void setCurmUnicomOpenCustNum(Integer curmUnicomOpenCustNum) {
        this.curmUnicomOpenCustNum = curmUnicomOpenCustNum;
    }
    public Integer getCurmCarryinNum() {
        return curmCarryinNum;
    }

    public void setCurmCarryinNum(Integer curmCarryinNum) {
        this.curmCarryinNum = curmCarryinNum;
    }

    @Override
    public String toString() {
        return "TaRpUsNpBusiDealD{" +
            "statisDate=" + statisDate +
            ", cityCode=" + cityCode +
            ", cityName=" + cityName +
            ", cntyCode=" + cntyCode +
            ", cntyName=" + cntyName +
            ", gridCode=" + gridCode +
            ", gridName=" + gridName +
            ", dataLvl=" + dataLvl +
            ", curdCondQueryCustNum=" + curdCondQueryCustNum +
            ", curdCarryoutApplyCustNum=" + curdCarryoutApplyCustNum +
            ", curdAccowiQualityCustNum=" + curdAccowiQualityCustNum +
            ", curdDirectAccowiCustNum=" + curdDirectAccowiCustNum +
            ", cancelBusiDiscAccowiCust=" + cancelBusiDiscAccowiCust +
            ", curdNaccwiCustNum=" + curdNaccwiCustNum +
            ", curdSuccGrantCustNum=" + curdSuccGrantCustNum +
            ", curdCnclCarryoutCustNum=" + curdCnclCarryoutCustNum +
            ", curdCnclTelecomCustNum=" + curdCnclTelecomCustNum +
            ", curdCnclUnicomCustNum=" + curdCnclUnicomCustNum +
            ", curdCarryinOpenCustNum=" + curdCarryinOpenCustNum +
            ", curdTelecomOpenCustNum=" + curdTelecomOpenCustNum +
            ", curdUnicomOpenCustNum=" + curdUnicomOpenCustNum +
            ", curdCarryinNum=" + curdCarryinNum +
            ", curmCondQueryCustNum=" + curmCondQueryCustNum +
            ", curmCarryoutApplyCustNum=" + curmCarryoutApplyCustNum +
            ", curmAccowiCustNum=" + curmAccowiCustNum +
            ", curmDirectAccowiCustNum=" + curmDirectAccowiCustNum +
            ", curmCancelDiscAccowiCust=" + curmCancelDiscAccowiCust +
            ", curmNaccwiCustNum=" + curmNaccwiCustNum +
            ", curmSuccGrantCustNum=" + curmSuccGrantCustNum +
            ", curmCnclCarryoutCustNum=" + curmCnclCarryoutCustNum +
            ", curmCnclTelecomCustNum=" + curmCnclTelecomCustNum +
            ", curmCnclUnicomCustNum=" + curmCnclUnicomCustNum +
            ", curmCarryinOpenCustNum=" + curmCarryinOpenCustNum +
            ", curmTelecomOpenCustNum=" + curmTelecomOpenCustNum +
            ", curmUnicomOpenCustNum=" + curmUnicomOpenCustNum +
            ", curmCarryinNum=" + curmCarryinNum +
        "}";
    }
}
