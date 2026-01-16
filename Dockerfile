# 도커 이미지 지정
FROM amazoncorretto:21-alpine-jdk

# 빌드된 파일의 위치를, 이미지 내부의 app.jar로 복사
COPY ./build/libs/swypTest-0.0.1-SNAPSHOT.jar app.jar

# 컨테이너 시작시 명령어. 즉 해당 jar파일을 실행하겠다는 것
ENTRYPOINT [ "java", "-jar",  "/app.jar" ]