./gradlew build

docker build -t jeesample/jaxrs00 .
docker run -p 9080:9080 jeesample/jaxrs00

Access http://localhost:9080/jaxrs00/sample/hello?name=ruimo

