FROM maven:3.8.3-openjdk-17 AS build
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17.0.1-jdk-slim
COPY --from=build /target/Blood_Bank-0.0.1-SNAPSHOT.jar Blood_Bank.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","Blood_Bank.jar"]
