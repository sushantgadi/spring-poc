package com.opensource.kagazi.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.opensource.kagazi.model.KagaziMst;
import com.opensource.kagazi.repository.KagaziMstRepository;
import com.opensource.kagazi.service.CoreService;
import com.opensource.kagazi.to.ResponseTO;

/**
 * core services for the application
 * 
 * @author sushant
 *
 */
@Service("coreService")
@Transactional
public class CoreServiceImpl implements CoreService {

	@Autowired
	KagaziMstRepository kagaziRepository;

	/*
	 * to get kagazi master (non-Javadoc)
	 * 
	 * @see com.opensource.kagazi.service.CoreService#kagazimst()
	 */
	@Override
	public ResponseTO kagazimst() {
		Iterable<KagaziMst> kagaziMst = kagaziRepository.findAll();
		return new ResponseTO(kagaziMst);
	}

}
