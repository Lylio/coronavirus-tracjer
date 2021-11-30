![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/thymeleaf.png?raw=true)

# Coronavirus Tracker

### Description
Spring Boot app which tracks coronavirus outbreak data and updates daily changes.  
Demo can be found hosted on Heroku: https://coronavirus-tracker-demo.herokuapp.com/

### Tech Stack
- Spring Boot (JDK 11)
- Thymeleaf

#### Docker Launch
1. `docker build -t coronavirus-tracker .`
2. `docker run -p 9002:8080 coronavirus-tracker:latest`
3. Navigate browser to http://localhost:9002

#### Maven Launch
1. Ensure Java version 11 is installed
2. `mvn spring-boot:run`
3. Open browser at http://localhost:8080

