./gradlew build

docker build -t jeesample/jaxrs-ejb00 .
docker run -p 9080:9080 jeesample/jaxrs-ejb00

Access http://localhost:9080/jaxrs-ejb00/sample/hello?name=ruimo
