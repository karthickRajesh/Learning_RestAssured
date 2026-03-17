package com.utils;

import org.apache.logging.log4j.Logger;

import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;

public class APILogger implements Filter {

	private static final Logger logger = LoggerUtil.getLogger(APILogger.class);

	@Override
	public Response filter(FilterableRequestSpecification requestSpec, FilterableResponseSpecification responseSpec,
			FilterContext ctx) {

		// Before Request
		logger.info("Request URI :" + requestSpec.getURI());
		logger.info("Request Method :" + requestSpec.getMethod());
		logger.info("request Headers :" + requestSpec.getHeaders());

		if (requestSpec.getBody() != null) {
			logger.info("Request Body :" + requestSpec.getBody());

		}

		// since call is stopped to filter now we must make the call
		Response response = ctx.next(requestSpec, responseSpec);

		// After call
		logger.info("Response status is :" + responseSpec.getStatusCode());
		logger.info("Response body is :" + response.getBody().asPrettyString());

		return response;
	}

}
