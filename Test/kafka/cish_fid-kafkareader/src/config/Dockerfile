{% if server_env != "prod" %} 
FROM cit-rqukbharbor.fnb.co.za/baseos/grafana-loki:jdk11
{% else %}
FROM cit-rpukbharbor.fnb.co.za/baseos/grafana-loki:jdk11
{% endif %}
ENV appname={{ app_name }}
ENV environment={{ env }}
ENV lokipass={{ lookup('vault', 'secret/loki/{%if server_env == \"prod\"%}prod{%else%}stress{%endif%}/loki_pass').value }}
{% if server_env != "prod" %}
ENV grafanaserver=cit-grafana-nprd.fnb.co.za
{% else %}
ENV grafanaserver=cit-grafana-prod.fnb.co.za
{% endif %}

{% if server_env == "qa" or server_env == "stress" or server_env == "prod" %}
ENV APPDYNAMICS_CONTROLLER_HOST_NAME="{% if server_env == 'prod' %}fnb.saas.appdynamics.com{% else %}fnb-dev.saas.appdynamics.com{% endif %}"
ENV APPDYNAMICS_AGENT_ACCOUNT_NAME="{% if server_env == 'prod' %}fnb{% else %}fnb-dev{% endif %}"
ENV APPDYNAMICS_AGENT_ACCOUNT_ACCESS_KEY="{% if server_env == 'prod' %}{{ lookup('vault', 'secret/appd/prod/key').value }}{% else %}{{ lookup('vault', 'secret/appd/dev/key').value }}{% endif %}"
ENV APPDYNAMICS_AGENT_APPLICATION_NAME="{{ prdct_team }}_{{ server_env }}"
ENV APPDYNAMICS_AGENT_TIER_NAME="{{ app_name }}-docker"
ENV APPDYNAMICS_CONTROLLER_PORT="443"
ENV APPDYNAMICS_CONTROLLER_SSL_ENABLED="true"
{% endif %}

COPY {{ artifact_name }}-{{ artifact_ver }}.jar /opt/app/{{ artifact_name }}-{{ artifact_ver }}.jar
COPY application.yml /opt/app/application.yml
COPY entrypoint.sh /opt/app/entrypoint.sh
RUN chmod +x /opt/app/entrypoint.sh
ENTRYPOINT ["sh","/opt/app/entrypoint.sh"]
