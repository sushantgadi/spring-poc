package com.opensource.kagazi.to;

import java.io.Serializable;

public class ResponseTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Object response = null;
	private boolean err_ind = false;
	private String err_msg = "";

	/**
	 * @return the response
	 */
	public Object getResponse() {
		return response;
	}

	/**
	 * @param response
	 *            the response to set
	 */
	public void setResponse(Object response) {
		this.response = response;
	}

	/**
	 * @return the err_ind
	 */
	public boolean isErr_ind() {
		return err_ind;
	}

	/**
	 * @param err_ind
	 *            the err_ind to set
	 */
	public void setErr_ind(boolean err_ind) {
		this.err_ind = err_ind;
	}

	/**
	 * @return the err_msg
	 */
	public String getErr_msg() {
		return err_msg;
	}

	/**
	 * @param err_msg
	 *            the err_msg to set
	 */
	public void setErr_msg(String err_msg) {
		this.err_msg = err_msg;
	}

	public ResponseTO(Object response) {
		super();
		this.response = response;
	}

	public ResponseTO(boolean err_ind, String err_msg) {
		super();
		this.err_ind = err_ind;
		this.err_msg = err_msg;
	}

}
