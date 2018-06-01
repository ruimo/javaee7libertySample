EJBを、JNDIルックアップする例。
仕様上は同一モジュール名の場合には、java:app 直後のモジュール名は省略できるはずだが、Libertyではモジュール名を省略すると見つからない。

./gradlew build

docker build -t jeesample/innapp-jndi .
docker run -p 9080:9080 jeesample/innapp-jndi

Access http://localhost:9080/inapp-jndi/sample/hello?name=ruimo
