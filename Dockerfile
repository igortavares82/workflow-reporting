FROM gradle:7-jdk11 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle shadowJar --no-daemon

FROM openjdk:11 as BUILD_IMAGE
EXPOSE 8082:8082
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/reporting.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","/app/reporting.jar"]