FROM eclipse-temurin:17
COPY target/devopstest.jar dev.jar
CMD ["java","-jar","dev.jar"]