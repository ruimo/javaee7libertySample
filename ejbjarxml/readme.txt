EJBを、アノテーション使わずに、ejb-jar.xmlで定義するサンプル。

./gradlew build

docker build -t jeesample/ejbjarxml .
docker run -p 9080:9080 jeesample/ejbjarxml

Access http://localhost:9080/war/sample/hello?name=ruimo

/war の部分は、application.xmlのapplication/module/web/context-root

Hell.java:
        HelloEjb ejb = InitialContext.doLookup("java:app/hello-module/hellobean");

/hello-module, hellobeanの部分は、ejb-jar.xml/module-name, ejb-jar.xml/enterprise-beans/sessin/ejb-name。
