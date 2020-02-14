package com.ada.poc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingFilterConfig {

	private static final int MAX_PAYLOAD_LENGTH = 10000;

	@Bean
	public CommonsRequestLoggingFilter logFilter() {
		CommonsRequestLoggingFilter filter = new CommonsRequestLoggingFilter();
		filter.setIncludeQueryString(true);
		filter.setIncludePayload(false);
		filter.setMaxPayloadLength(MAX_PAYLOAD_LENGTH);
		filter.setIncludeHeaders(false);
		filter.setAfterMessagePrefix("Exit request [");
		filter.setBeforeMessageSuffix("]");
		filter.setBeforeMessagePrefix("Enter request [");
		filter.setAfterMessageSuffix("]");
		filter.setIncludeClientInfo(true);
		return filter;
	}
}