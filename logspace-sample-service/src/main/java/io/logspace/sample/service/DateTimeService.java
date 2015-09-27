/**
 * Logspace
 * Copyright (c) 2015 Indoqa Software Design und Beratung GmbH. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License Version 1.0, which accompanies this distribution and
 * is available at http://www.eclipse.org/legal/epl-v10.html.
 */
package io.logspace.sample.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public final class DateTimeService {

    private UsageAgent usageAgent = new UsageAgent();

    public String getDateTime(String timezone) {
        long start = System.nanoTime();
        String dateTimeString = this.getDateTimeAsString(timezone);

        // this.usageAgent.logDateTimeUsage(timezone, System.nanoTime() - start);

        return dateTimeString;
    }

    private String getDateTimeAsString(String timezone) {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        df.setTimeZone(TimeZone.getTimeZone(timezone));
        return df.format(new Date());
    }
}
