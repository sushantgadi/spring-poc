package com.opensource.kagazi.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.opensource.kagazi.model.KagaziMst;

@Repository
public interface KagaziMstRepository extends CrudRepository<KagaziMst, Long> {

}