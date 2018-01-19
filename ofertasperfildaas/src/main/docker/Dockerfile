FROM qa.stratio.com/stratio/java-microservice-dockerbase:0.2.0

VOLUME /tmp

ADD OfertasPerfilDaaS.jar OfertasPerfilDaaS.jar

ADD entrypoint.sh entrypoint.sh

RUN sh -c 'touch OfertasPerfilDaaS.jar' && chmod +x entrypoint.sh

ENTRYPOINT ["bash", "entrypoint.sh" ]