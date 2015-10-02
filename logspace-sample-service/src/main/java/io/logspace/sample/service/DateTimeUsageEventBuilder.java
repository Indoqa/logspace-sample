package io.logspace.sample.service;

import io.logspace.agent.api.event.AbstractEventBuilder;
import io.logspace.agent.api.event.Optional;

/*default*/ class DateTimeUsageEventBuilder extends AbstractEventBuilder {

    private static final String TYPE = "date-time";

    private static final String PROPERTY_SERVICE_RESPONSE_TIME = "query_string";
    private static final String PROPERTY_TIMEZONE = "timezone";

    private Optional<String> type = Optional.of(TYPE);

    public DateTimeUsageEventBuilder(String agentId, String system) {
        super(agentId, system);
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
    protected Optional<String> getType() {
        return this.type;
    }
}
