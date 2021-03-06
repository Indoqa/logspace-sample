/**
 * Logspace
 * Copyright (c) 2015 Indoqa Software Design und Beratung GmbH. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License Version 1.0, which accompanies this distribution and
 * is available at http://www.eclipse.org/legal/epl-v10.html.
 */
package io.logspace.sample.service;

import io.logspace.agent.api.event.AbstractEventBuilder;
import io.logspace.agent.api.event.EventBuilderData;

/*default*/ class DateTimeUsageEventBuilder extends AbstractEventBuilder {

    private static final String TYPE = "date-time";

    private static final String PROPERTY_SERVICE_RESPONSE_TIME = "response_time";
    private static final String PROPERTY_TIMEZONE = "timezone";

    public DateTimeUsageEventBuilder(EventBuilderData eventBuilderData) {
        super(eventBuilderData);
    }

    public DateTimeUsageEventBuilder addServiceResponseTime(final long responseTime) {
        this.addProperty(PROPERTY_SERVICE_RESPONSE_TIME, responseTime);
        return this;
    }

    public DateTimeUsageEventBuilder addTimeZone(final String timezone) {
        this.addProperty(PROPERTY_TIMEZONE, timezone);
        return this;
    }

    @Override
    protected String getType() {
        return TYPE;
    }
}
