FROM maven:3.5.4-jdk-8-alpine

VOLUME ["/data"]

WORKDIR /app

ADD . /app

RUN mvn package