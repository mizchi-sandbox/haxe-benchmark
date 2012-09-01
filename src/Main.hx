package;
import Math;
import Date;
import Lambda;

class Main {
  static function main() {
    trace("Hello World !");
  	var arr = [];

    showExecTime("array insertion", function(){
      for(i in 1...100000){
        var num: Int = cast Math.random() * 1000;
        arr.push(num);
      }
    });

    showExecTime("quicksort", function(){
      qsort(arr);
    });

    showExecTime("lambda sum", function(){
      sum(arr);
    });
  }

  static function measureExecTime(func): Float{
    var start_time : Date = Date.now();
    func();
    var end_time : Date = Date.now();
    return (end_time.getTime() - start_time.getTime());
  }

  static function showExecTime(explain:String, func): Void {
    var time = measureExecTime(func);
    trace(explain + " : " + time + "ms");
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

  static function sum(array: Array<Int>):Int {
    return Lambda.fold(array, function(a,b){
      return a+b;
    }, 0);
  }
}
