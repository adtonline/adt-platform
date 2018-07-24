FROM java:8-jre

ADD ./build/libs/service-discovery-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/service-discovery-1.0.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:9191/health || exit 1

EXPOSE 9191