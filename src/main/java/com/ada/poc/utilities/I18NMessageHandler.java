package com.ada.poc.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class I18NMessageHandler {

	private I18NMessageHandler() {
		super();
	}

	@Autowired
	public I18NMessageHandler(final MessageSource messageSource) {
		super();
		this.messageSource = messageSource;
	}

	private MessageSource messageSource;

	public String getMessage(final String messageKey) {
		return this.getMessage(messageKey, null);
	}

	public String getMessage(final String messageKey, final Object[] args) {
		Locale currentLocale = LocaleContextHolder.getLocale();
		return this.messageSource.getMessage(messageKey, args, currentLocale);
	}
}