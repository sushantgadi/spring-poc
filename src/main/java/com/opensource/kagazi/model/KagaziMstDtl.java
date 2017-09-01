package com.opensource.kagazi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * detail table for the all the government documentation
 * 
 * @author sushant
 *
 */
@Entity
@Table(name = "kagazi_mst_dtl")
public class KagaziMstDtl extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private Long kagazi_mst_id;

	private String html_data;

	private String description;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the kagazi_mst_id
	 */
	public Long getKagazi_mst_id() {
		return kagazi_mst_id;
	}

	/**
	 * @param kagazi_mst_id
	 *            the kagazi_mst_id to set
	 */
	public void setKagazi_mst_id(Long kagazi_mst_id) {
		this.kagazi_mst_id = kagazi_mst_id;
	}

	/**
	 * @return the html_data
	 */
	public String getHtml_data() {
		return html_data;
	}

	/**
	 * @param html_data
	 *            the html_data to set
	 */
	public void setHtml_data(String html_data) {
		this.html_data = html_data;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
