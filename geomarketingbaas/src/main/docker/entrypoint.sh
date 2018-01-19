#!/usr/bin/env bash

export JAVA_OPTS="--server.port=$PORT0"

java -jar GeoMarketingBaaS.jar $JAVA_OPTS