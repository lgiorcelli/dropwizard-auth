FROM maven:3.5.4-jdk-8-alpine as builder

VOLUME ["/data"]

WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline

COPY src/ /app/src
RUN mvn package


# Step : runnable image
FROM openjdk:8-jre-alpine
COPY --from=builder /app/target/dropwizard-auth-1.0.0.jar /var/www/app/
EXPOSE 8087
ENTRYPOINT ["java", "-jar", "/var/www/app/dropwizard-auth-1.0.0.jar"]
#CMD exec java $JAVA_OPTS -jar /var/www/app/dropwizard-auth-1.0.0.jar
