# HaXe Test

```
haxelib install hxcpp
haxelib install hxjava
haxe build.xml
```

## Code

```
package;
import Math;

class Main {
  static function main() {
    trace("Hello World !");
  	var arr = [];
    for(i in 1...100000){
      var num: Int = cast Math.random() * 1000;
      arr.push(num);
    }
  	var sorted: Array<Int> = qsort(arr);
    // trace(sorted);
  }

  static function qsort(array: Array<Int>): Array<Int> {
  	if(array.length == 0)
  	  return [];
    var pivot = array.shift();
  	var b = [], a = [];
  	for(i in array)
  	  if(i < pivot)
  	  	b.push(i);
  	  else
  	  	a.push(i);
  	return qsort(b).concat([pivot]).concat(qsort(a));
  }
}
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

## Java

```
$ time java -jar java.jar
Main.hx:8: Hello World !
Main.hx:36: array insertion : 27.0ms
Main.hx:36: quicksort : 348.0ms
Main.hx:36: lambda sum : 76.0ms
java -Dfile.encoding=utf-8 -jar java.jar  1.05s user 0.08s system 167% cpu 0.672 total
```