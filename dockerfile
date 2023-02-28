FROM gradle:7.4.1-jdk17-alpine AS build

WORKDIR /app

COPY . .

RUN gradle clean build

FROM amazoncorretto:17-alpine3.17 AS producion

WORKDIR /app

COPY --from=build /app/build/libs/*.jar app.jar

CMD java -jar app.jar
