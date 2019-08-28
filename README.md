# Reproducer for Json encoding issue

As reported here: https://github.com/playframework/playframework/issues/9602

# How to reproduce?

In `remote-server` folder there is json payload using accentuated charachters and endoded in ISO_8859_1.

You need to start a http on this folder. Easiest way is to use python Simple Http server.

```shell
cd remote-server
python -m SimpleHTTPServer
Serving HTTP on 0.0.0.0 port 8000 ...
```

On another terminal, start the Play add on the root folder

```shell script
sbt run
```

Then call: 

```shell script
curl GET localhost:9000/json
```
Works but display wrong encoding. Uses `play.libs.Json.parse`

```shell script
curl GET localhost:9000/json/iso
```

Works and display characters correctly. Uses `play.libs.Json.parse` with a ByteString using the right encoding.

```shell script
curl GET localhost:9000/jsonWs
```

Doesn't work. Throws exception:

```java
Caused by: com.fasterxml.jackson.core.JsonParseException: Invalid UTF-8 middle byte 0x6f
 at [Source: (byte[])"{
  "people" : [
    { "name" : "Jo�o" },
    { "name" : "Fl�vio" }
  ]
}"; line: 3, column: 21]
```