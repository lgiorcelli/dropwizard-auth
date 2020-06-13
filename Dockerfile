FROM maven:3.5.4-jdk-8-alpine as builder

VOLUME ["/data"]

ARG USER_HOME_DIR="/root"
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

WORKDIR /app
COPY pom.xml .
COPY usecases/pom.xml usecases/pom.xml
COPY delivery/pom.xml delivery/pom.xml
# RUN mvn dependency:go-offline

COPY delivery/src/ /app/delivery/src
COPY usecases/src/ /app/usecases/src
RUN mvn package


# Step : runnable image
#FROM openjdk:8-jre-alpine
FROM adoptopenjdk/openjdk11
COPY --from=builder /app/delivery/target/delivery-1.0.0.jar /var/www/app/server.jar
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "/var/www/app/server.jar", "server"]
#ENTRYPOINT ["/bin/sh", "-c", "jar", "tvf", "/var/www/app/server.jar"]
#ENTRYPOINT ["tail", "-f", "/dev/null"]
#CMD exec java $JAVA_OPTS -jar /var/www/app/server.jar
