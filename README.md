# HaXe CrossPlatform Test

Target is same quicksort created by src/Main.hx

```
haxelib install hxcpp
haxelib install hxjava
haxe build.xml
```


## JavaScript (V8)

```
$ time node js/main.js
Hello World !
array insertion : 11ms
quicksort : 116ms
lambda sum : 2ms

node js/main.js 0.16s user 0.03s system 99% cpu 0.184 total
```

## C++
```
$ time cpp/Main-debug
Main.hx:6: Hello World !
Main.hx:8: Hello World !
Main.hx:36: array insertion : 0ms
Main.hx:36: quicksort : 1000ms
Main.hx:36: lambda sum : 0ms
cpp/Main-debug  1.07s user 0.01s system 99% cpu 1.079 total
```

Maybe something wrong about Date... but slow indeed.

## Java

```
$ time java -jar java.jar
Main.hx:8: Hello World !
Main.hx:36: array insertion : 27.0ms
Main.hx:36: quicksort : 348.0ms
Main.hx:36: lambda sum : 76.0ms
java -Dfile.encoding=utf-8 -jar java.jar  1.05s user 0.08s system 167% cpu 0.672 total
```
