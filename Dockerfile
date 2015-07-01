FROM azul/zulu-openjdk:8

RUN apt-get -y update
RUN apt-get -y upgrade
RUN apt-get -y install maven git

RUN git clone https://github.com/catalin-ilea/hello-world.git
RUN cd hello-world && mvn install
RUN cp hello-world/target/hello-world-*.jar /app.jar

EXPOSE 8080 8081
ADD config.yml /config.yaml

CMD java -jar app.jar server config.yaml
