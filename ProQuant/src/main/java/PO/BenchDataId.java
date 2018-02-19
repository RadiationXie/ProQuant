package PO;
// Generated 2017-5-28 13:12:39 by Hibernate Tools 5.2.1.Final

import java.util.Date;

/**
 * BenchDataId generated by hbm2java
 */
public class BenchDataId implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1090402243215879430L;
	private String code;
	private Date date;

	public BenchDataId() {
	}

	public BenchDataId(String code, Date date) {
		this.code = code;
		this.date = date;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BenchDataId))
			return false;
		BenchDataId castOther = (BenchDataId) other;

		return ((this.getCode() == castOther.getCode()) || (this.getCode() != null && castOther.getCode() != null
				&& this.getCode().equals(castOther.getCode())))
				&& ((this.getDate() == castOther.getDate()) || (this.getDate() != null && castOther.getDate() != null
						&& this.getDate().equals(castOther.getDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCode() == null ? 0 : this.getCode().hashCode());
		result = 37 * result + (getDate() == null ? 0 : this.getDate().hashCode());
		return result;
	}

}