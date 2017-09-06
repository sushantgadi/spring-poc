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
	
	private String code;

	private Long kagazi_mst_id;

	private String html_data;

	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getKagazi_mst_id() {
		return kagazi_mst_id;
	}

	public void setKagazi_mst_id(Long kagazi_mst_id) {
		this.kagazi_mst_id = kagazi_mst_id;
	}

	public String getHtml_data() {
		return html_data;
	}

	public void setHtml_data(String html_data) {
		this.html_data = html_data;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	

}
