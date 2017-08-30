package com.opensource.kagazi.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Auditable entity, will be extended by the other entities
 * 
 * @author sushant
 *
 */
@MappedSuperclass
public class Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(updatable = false, nullable = false, insertable = true)
	private String created_by;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = false, nullable = false, insertable = true)
	private Date created_date;

	@Column(updatable = true, nullable = true, insertable = true)
	private String modified_by;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(updatable = true, nullable = true, insertable = true)
	private Date modified_date;

	@PrePersist
	protected void onCreate() {
		created_date = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		modified_date = new Date();
	}

	/**
	 * @return the created_by
	 */
	public String getCreated_by() {
		return created_by;
	}

	/**
	 * @param created_by
	 *            the created_by to set
	 */
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	/**
	 * @return the created_date
	 */
	public Date getCreated_date() {
		return created_date;
	}

	/**
	 * @param created_date
	 *            the created_date to set
	 */
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}

	/**
	 * @return the modified_by
	 */
	public String getModified_by() {
		return modified_by;
	}

	/**
	 * @param modified_by
	 *            the modified_by to set
	 */
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	/**
	 * @return the modified_date
	 */
	public Date getModified_date() {
		return modified_date;
	}

	/**
	 * @param modified_date
	 *            the modified_date to set
	 */
	public void setModified_date(Date modified_date) {
		this.modified_date = modified_date;
	}

}
