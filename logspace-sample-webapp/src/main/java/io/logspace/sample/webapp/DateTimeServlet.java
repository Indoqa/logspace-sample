/**
 * Logspace
 * Copyright (c) 2015 Indoqa Software Design und Beratung GmbH. All rights reserved.
 * This program and the accompanying materials are made available under the terms of
 * the Eclipse Public License Version 1.0, which accompanies this distribution and
 * is available at http://www.eclipse.org/legal/epl-v10.html.
 */
package io.logspace.sample.webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.logspace.sample.service.DateTimeService;

@WebServlet(name = "DateTimeServlet", displayName = "DateTime Servlet", urlPatterns = "/", loadOnStartup = 1)
public class DateTimeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private DateTimeService dateTimeService = new DateTimeService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write(this.dateTimeService.getDateTime(this.getTimezone(req)));
    }

    private String getTimezone(HttpServletRequest req) {
        String timezone = req.getParameter("timezone");
        if (timezone == null) {
            return "UTC";
        }
        return timezone;
    }
}
