#!/bin/bash

# Logspace
# Copyright (c) ${project.inceptionYear} Indoqa Software Design und Beratung GmbH. All rights reserved.
# This program and the accompanying materials are made available under the terms of
# the Eclipse Public License Version 1.0, which accompanies this distribution and
# is available at http://www.eclipse.org/legal/epl-v10.html.

logspaceHqRunnable=$1
currentDir=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
baseDir=$currentDir/logspace-sample-hq

$JAVA_HOME/bin/java \
   -Dport=9300 \
   -Dlog-path=$baseDir/logs \
   -Dlogspace.solr.base-url=http://localhost:9301/solr/logspace \
   -Dlogspace.hq-webapp.orders-directory=$baseDir/orders \
   -Dlogspace.hq-webapp.capabilities-directory=$baseDir/capabilities \
   -Dlogspace.hq-webapp.space-tokens-directory=$baseDir/space-tokens \
   -jar $logspaceHqRunnable
