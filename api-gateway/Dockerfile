FROM java:8-jre

ADD ./build/libs/api-gateway-1.0.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/api-gateway-1.0.jar"]

HEALTHCHECK --interval=10s --timeout=3s CMD curl -f http://localhost:9090/health || exit 1

EXPOSE 9090