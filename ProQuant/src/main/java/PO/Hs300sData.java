package PO;
// default package
// Generated 2017-5-25 12:54:38 by Hibernate Tools 4.0.1.Final

/**
 * Hs300sData generated by hbm2java
 */
public class Hs300sData implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6620303304731330152L;
	private long index;
	private String code;
	private String name;
	private String date;
	private Double weight;

	public Hs300sData() {
	}

	public Hs300sData(long index) {
		this.index = index;
	}

	public Hs300sData(long index, String code, String name, String date, Double weight) {
		this.index = index;
		this.code = code;
		this.name = name;
		this.date = date;
		this.weight = weight;
	}

	public long getIndex() {
		return this.index;
	}

	public void setIndex(long index) {
		this.index = index;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Double getWeight() {
		return this.weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
