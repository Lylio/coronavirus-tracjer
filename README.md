![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/thymeleaf.png?raw=true)

# Coronavirus Tracker
## Built with Spring Boot and Thymeleaf

### Description
Spring Boot app which tracks coronavirus outbreak data.  
Data source: https://github.com/CSSEGISandData/COVID-19

#### Java Version
16

#### Docker Launch
1. docker build -t coronavirus-tracker .
2. docker run -p 9002:8080 coronavirus-tracker:latest
3. Navigate browser to http://localhost:9002

#### Maven Launch
1. Ensure Java version 16 is installed
2. `mvn spring-boot:run`
3. Open browser at http://localhost:8080

