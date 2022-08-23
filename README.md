![](https://github.com/Lylio/image-repo/blob/master/logos/spring-boot.png?raw=true)
![](https://github.com/Lylio/image-repo/blob/master/logos/thymeleaf.png?raw=true)

# Rona Report

### Description
A coronavirus tracking app which pulls together pandemic outbreak data and updates daily changes to the figures.  
Demo can be found at: https://rona-report.lyle.app

### Tech Stack
- Spring Boot (JDK 11)
- Thymeleaf

#### Docker Launch
1. `docker build -t rona-report .`
2. `docker run -p 9002:8080 rona-report:latest`
3. Navigate browser to http://localhost:9002

#### Maven Launch
1. Ensure Java version 11 is installed
2. `mvn spring-boot:run`
3. Open browser at http://localhost:8080

