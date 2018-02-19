package PO.user;
// Generated 2017-6-10 0:50:46 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * UserStrategyRecord generated by hbm2java
 */
public class UserStrategyRecord implements java.io.Serializable {

	private static final long serialVersionUID = 7913517104055287584L;
	
	private int id;
	private String username;
	private Byte strategyAlgorithm;
	private Date startDate;
	private Date endDate;
	private Integer holdingPeriod;
	private Integer formativePeriod;
	private Byte stockPlate;
	private Byte baseRule;
	private Integer maxHoldStocksNum;

	public UserStrategyRecord() {
	}

	public UserStrategyRecord(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Byte getStrategyAlgorithm() {
		return strategyAlgorithm;
	}

	public void setStrategyAlgorithm(Byte strategyAlgorithm) {
		this.strategyAlgorithm = strategyAlgorithm;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getHoldingPeriod() {
		return holdingPeriod;
	}

	public void setHoldingPeriod(Integer holdingPeriod) {
		this.holdingPeriod = holdingPeriod;
	}

	public Integer getFormativePeriod() {
		return formativePeriod;
	}

	public void setFormativePeriod(Integer formativePeriod) {
		this.formativePeriod = formativePeriod;
	}

	public Byte getStockPlate() {
		return stockPlate;
	}

	public void setStockPlate(Byte stockPlate) {
		this.stockPlate = stockPlate;
	}

	public Byte getBaseRule() {
		return baseRule;
	}

	public void setBaseRule(Byte baseRule) {
		this.baseRule = baseRule;
	}

	public Integer getMaxHoldStocksNum() {
		return maxHoldStocksNum;
	}

	public void setMaxHoldStocksNum(Integer maxHoldStocksNum) {
		this.maxHoldStocksNum = maxHoldStocksNum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public UserStrategyRecord(int id, String username, Byte strategyAlgorithm, Date startDate, Date endDate,
			Integer holdingPeriod, Integer formativePeriod, Byte stockPlate, Byte baseRule, Integer maxHoldStocksNum) {
		super();
		this.id = id;
		this.username = username;
		this.strategyAlgorithm = strategyAlgorithm;
		this.startDate = startDate;
		this.endDate = endDate;
		this.holdingPeriod = holdingPeriod;
		this.formativePeriod = formativePeriod;
		this.stockPlate = stockPlate;
		this.baseRule = baseRule;
		this.maxHoldStocksNum = maxHoldStocksNum;
	}

	

}
