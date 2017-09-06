package com.opensource.kagazi.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.opensource.kagazi.model.KagaziMstDtl;

@Repository
public interface KagaziMstDtlRepository extends CrudRepository<KagaziMstDtl, Long> {

	@Query("select m from KagaziMstDtl m where m.code=:code")
	public Iterable<KagaziMstDtl> getDtlByCode(@Param("code") String code);

}