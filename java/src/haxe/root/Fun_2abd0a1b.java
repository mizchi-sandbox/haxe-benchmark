package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_2abd0a1b extends haxe.lang.Function
{
	public    Fun_2abd0a1b()
	{
		super(2, 1);
	}
	
	
	public static  haxe.root.Fun_2abd0a1b __hx_current;
	
	@Override public   double __hx_invoke2_f(double __fn_float1, double __fn_float2, java.lang.Object __fn_dyn1, java.lang.Object __fn_dyn2)
	{
		int b = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float2) )) : (haxe.lang.Runtime.toInt(__fn_dyn2)) );
		int a = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (haxe.lang.Runtime.toInt(__fn_dyn1)) );
		return ( a + b );
	}
	
	
}


