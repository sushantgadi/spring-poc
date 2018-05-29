package com.opensource.kagazi;

import java.util.concurrent.TimeUnit;

import org.springframework.cache.Cache;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.guava.GuavaCache;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.cache.CacheBuilder;

@Configuration
@EnableCaching
public class CacheConfig {

	public final static String KAGAZI_MST = "kagazimst";
	public final static String KAGAZI_MST_DTL = "kagaziMstDtl";

	@Bean
	public Cache cacheKagaziMst() {
		return new GuavaCache(KAGAZI_MST, CacheBuilder.newBuilder().expireAfterWrite(720, TimeUnit.HOURS).build());
	}

	@Bean
	public Cache cacheKagaziMstDtl() {
		return new GuavaCache(KAGAZI_MST_DTL, CacheBuilder.newBuilder().expireAfterWrite(720, TimeUnit.HOURS).build());
	}
}
