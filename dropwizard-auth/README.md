# Prueba dropwizard
Build using Docker
---
1. Go to folder dropwizard-auth
2. Run `docker build -t {tag} .`
3. Run `docker run {tag} server|check`

How to start the Prueba dropwizard application
---

1. Run `mvn clean install` to build your application
2. Start application with `java -jar target/dropwizard-auth-1.0-SNAPSHOT.jar server config.yml`
3. To check that your application is running enter url `http://localhost:8080`

Health Check
---

To see your applications health enter url `http://localhost:8081/healthcheck`
