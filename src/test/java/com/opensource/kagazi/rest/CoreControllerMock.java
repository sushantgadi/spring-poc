package com.opensource.kagazi.rest;

import java.util.ArrayList;
import java.util.List;

import com.opensource.kagazi.model.KagaziMst;
import com.opensource.kagazi.to.ResponseTO;

public class CoreControllerMock {

	public static ResponseTO mockKagaziMst() {

		List<KagaziMst> kagaziMst = new ArrayList<KagaziMst>();

		KagaziMst obj1 = new KagaziMst(1L, "poassport", "passport name", "passport details", "/image/url");

		kagaziMst.add(obj1);

		return new ResponseTO(kagaziMst.iterator());

	}

}
