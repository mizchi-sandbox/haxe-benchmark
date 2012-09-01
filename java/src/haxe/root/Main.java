package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Main extends haxe.lang.HxObject
{
	public static void main(String[] args)
	{
		
		main();
	}
	public    Main()
	{
		super();
	}
	
	
	public static   void main()
	{
		haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, "Hello World !", new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Main", "Main.hx", "main"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (8) )})));
		haxe.root.Array<haxe.root.Array> arr = new haxe.root.Array<haxe.root.Array>(new haxe.root.Array[]{((haxe.root.Array) (new haxe.root.Array(new java.lang.Object[]{})) )});
		haxe.root.Main.showExecTime("array insertion", new haxe.root.Fun_a5b54c32(((haxe.root.Array<haxe.root.Array>) (arr) )));
		haxe.root.Main.showExecTime("quicksort", new haxe.root.Fun_771935a6(((haxe.root.Array<haxe.root.Array>) (arr) )));
		haxe.root.Main.showExecTime("lambda sum", new haxe.root.Fun_e9ba5e94(((haxe.root.Array<haxe.root.Array>) (arr) )));
	}
	
	
	public static   double measureExecTime(haxe.lang.Function func)
	{
		haxe.root.Date start_time = haxe.root.Date.now();
		func.__hx_invoke0_o();
		haxe.root.Date end_time = haxe.root.Date.now();
		return ( ((double) (end_time.date.getTime()) ) - ((double) (start_time.date.getTime()) ) );
	}
	
	
	public static   void showExecTime(java.lang.String explain, haxe.lang.Function func)
	{
		double time = haxe.root.Main.measureExecTime(func);
		haxe.Log.trace.__hx_invoke2_o(0.0, 0.0, ( ( ( explain + " : " ) + time ) + "ms" ), new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"className", "fileName", "methodName"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{"Main", "Main.hx", "showExecTime"}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{"lineNumber"}), new haxe.root.Array(new java.lang.Object[]{((java.lang.Object) (36) )})));
	}
	
	
	public static   haxe.root.Array<java.lang.Object> qsort(haxe.root.Array<java.lang.Object> array)
	{
		if (( array.length == 0 )) 
		{
			return new haxe.root.Array(new java.lang.Object[]{});
		}
		
		java.lang.Object pivot = array.shift();
		haxe.root.Array<java.lang.Object> b = new haxe.root.Array(new java.lang.Object[]{});
		haxe.root.Array<java.lang.Object> a = new haxe.root.Array(new java.lang.Object[]{});
		{
			int _g = 0;
			while (( _g < array.length ))
			{
				int i = haxe.lang.Runtime.toInt(array.__get(_g));
				 ++ _g;
				if (( haxe.lang.Runtime.compare(i, pivot) < 0 )) 
				{
					b.push(i);
				}
				 else 
				{
					a.push(i);
				}
				
			}
			
		}
		
		return ((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (haxe.root.Main.qsort(b).concat(((haxe.root.Array) (((haxe.root.Array) (new haxe.root.Array(new java.lang.Object[]{pivot})) )) ))) )) ).concat(((haxe.root.Array) (((haxe.root.Array) (haxe.root.Main.qsort(a)) )) ))) )) );
	}
	
	
	public static   int sum(haxe.root.Array<java.lang.Object> array)
	{
		return haxe.lang.Runtime.toInt(haxe.root.Lambda.fold(array, ( (( haxe.root.Fun_a9815d1c.__hx_current != null )) ? (haxe.root.Fun_a9815d1c.__hx_current) : (haxe.root.Fun_a9815d1c.__hx_current = ((haxe.root.Fun_a9815d1c) (new haxe.root.Fun_a9815d1c()) )) ), 0));
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Main(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Main();
	}
	
	
	public    Main(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


