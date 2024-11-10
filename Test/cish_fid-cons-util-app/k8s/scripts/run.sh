#!/bin/sh
/opt/app/rsyslog/rsyslog-configure.sh
> /opt/app/logs/server.log
exec rsyslogd -n &