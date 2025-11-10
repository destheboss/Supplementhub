FROM gradle:jdk17 AS build

WORKDIR /app

COPY build/libs/*.jar app.jar

RUN useradd -m appuser

USER appuser

EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app/app.jar"]