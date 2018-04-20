package com.yisi.business.util;

/** 
 * 账户流水类型
 * @author parudy
 * @date 2018年3月26日 
 * @version v1.0
 */
public enum IncomeType {
    /**
     * 静态释放
     */
    TYPE_STATIC(1, "静态释放"),
    /** 
     * 购买订单
     * @return  
     */
    TYPE_PURCHASE(12, "购买订单"),
    /** 
     * 卖出订单
     * @return  
     */
    TYPE_SELL(11, "卖出订单"),
    /** 
     * 充值
     * @return  
     */
    TYPE_RECHARGE(21, "充值"),
    /**
     * 提现
     */
    TYPE_WITHDRAW(22, "提现"),
    /**
     * 推荐奖励
     */
    TYPE_AWARD_REFEREE(311, "推荐奖励"),
    /**
     * 领导奖励
     */
    TYPE_AWARD_LEADER(321, "领导奖励"),
    /**
     * 量碰奖励
     */
    TYPE_AWARD_TOUCH(331, "量碰奖励"),
    /**
     * 报单
     */
    TYPE_AWARD_BAODAN(401, "报单"),
    /**
     * 加金
     */
    TYPE_AWARD_JIAJIN(411, "加金"),
    /**
     * 复投
     */
    TYPE_AWARD_FUTOU(421, "复投"),
	TYPE_USER_CHANTE(601, "管理员调整");

    private int incomeType;
    private String remark;

    private IncomeType(int incomeType, String remark) {
        this.incomeType = incomeType;
        this.remark = remark;
    }

    public int getIncomeType() {
        return incomeType;
    }

    public void setIncomeType(int incomeType) {
        this.incomeType = incomeType;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static IncomeType getByType(int type) {
        for (IncomeType t : IncomeType.values()) {
            if (t.getIncomeType() == type) {
                return t;
            }
        }
        return IncomeType.TYPE_STATIC;
    }
    public static String getTypeStByType(int type) {
    	for (IncomeType t : IncomeType.values()) {
    		if (t.getIncomeType() == type) {
    			return t.getRemark();
    		}
    	}
    	return "";
    }
}
