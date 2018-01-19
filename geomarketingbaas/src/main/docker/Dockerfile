FROM qa.stratio.com/stratio/java-microservice-dockerbase:0.2.0

VOLUME /tmp

ADD GeoMarketingBaaS.jar GeoMarketingBaaS.jar

ADD entrypoint.sh entrypoint.sh

RUN sh -c 'touch GeoMarketingBaaS.jar' && chmod +x entrypoint.sh

ENTRYPOINT ["bash", "entrypoint.sh" ]