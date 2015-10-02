/**
 * Logspace
 * Copyright (c) 2015 Indoqa Software Design und Beratung GmbH. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License Version 1.0, which accompanies this distribution and
 * is available at http://www.eclipse.org/legal/epl-v10.html.
 */
package io.logspace.sample.service;

import io.logspace.agent.api.AbstractApplicationAgent;
import io.logspace.agent.api.event.Event;

/*
 * explain {@link AbstractApplicationAgent} usage here
 */
public class UsageAgent extends AbstractApplicationAgent {

    /**
     * explain id and type here
     */
    public UsageAgent() {
        super("usage-agent", "usage");
    }

    public void logDateTimeUsage(String timezone, long serviceResponseTime) {
        Event event = new DateTimeUsageEventBuilder(this.getId(), this.getSystem()).addTimeZone(timezone)
            .addServiceResponseTime(serviceResponseTime)
            .toEvent();
        this.sendEvent(event);
    }
}
