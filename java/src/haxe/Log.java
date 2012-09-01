package haxe;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Log extends haxe.lang.HxObject
{
	static 
	{
		haxe.Log.trace = ( (( haxe.Fun_1e20a142.__hx_current != null )) ? (haxe.Fun_1e20a142.__hx_current) : (haxe.Fun_1e20a142.__hx_current = ((haxe.Fun_1e20a142) (new haxe.Fun_1e20a142()) )) );
		haxe.Log.clear = ( (( haxe.Fun_d41d8cd9.__hx_current != null )) ? (haxe.Fun_d41d8cd9.__hx_current) : (haxe.Fun_d41d8cd9.__hx_current = ((haxe.Fun_d41d8cd9) (new haxe.Fun_d41d8cd9()) )) );
	}
	public    Log()
	{
		super();
	}
	
	
	public static  haxe.lang.Function trace;
	
	public static  haxe.lang.Function clear;
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.Log(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.Log();
	}
	
	
	public    Log(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


