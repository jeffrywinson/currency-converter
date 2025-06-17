FROM openjdk:17
COPY target/currency-converter-1.0.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["100.0", "USD", "INR"]
