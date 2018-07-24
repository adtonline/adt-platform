FROM java:8-jre

ADD ./build/libs/config-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-1.0.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:9999/health || exit 1

EXPOSE 9999