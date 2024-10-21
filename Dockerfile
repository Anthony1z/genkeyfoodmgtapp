FROM amazoncorretto:11

COPY foodmgt-feature-migration-salifu/genkeyfoodmgtapp/target/foodmgt-0.0.1-SNAPSHOT.jar /foodmgt.jar

VOLUME /tmp

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "foodmgt.jar"]
