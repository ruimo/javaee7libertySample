EJBとWARを別モジュールとして、EARにパッケージングし、WARからEARをJNDIルックアップする例。

./gradlew build

docker build -t jeesample/acrossmodulejndi .
docker run -p 9080:9080 jeesample/acrossmodulejndi

Access http://localhost:9080/war/sample/hello?name=ruimo

/war の部分は、application.xmlのapplication/module/web/context-root

Hell.java:
        HelloEjb ejb = InitialContext.doLookup("java:app/ejb/hellobean");

/ejbの部分は、application.xmlのapplication/module/ejbの、ejb.jarから.jarを取った部分。

