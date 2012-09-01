package haxe.java;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Lib extends haxe.lang.HxObject
{
	public    Lib()
	{
		super();
	}
	
	
	public static  <T> T[] nativeArray(haxe.root.Array<T> arr, boolean equalLengthRequired)
	{
		T[] _native = arr.__a;
		if (( _native.length == arr.length )) 
		{
			return _native;
		}
		 else 
		{
			return null;
		}
		
	}
	
	
	public static  <T> java.lang.Class<T> nativeType(T obj)
	{
		
		return (java.lang.Class<T>) obj.getClass();
	
	}
	
	
	public static  <T> haxe.root.Array<T> array(T[] _native)
	{
		return haxe.root.Array.ofNative(_native);
	}
	
	
	public static  <T> haxe.root.Array<T> arrayAlloc(int size)
	{
		return ((haxe.root.Array<T>) (((haxe.root.Array) (haxe.root.Array.alloc(size)) )) );
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.java.Lib(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.java.Lib();
	}
	
	
	public    Lib(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


