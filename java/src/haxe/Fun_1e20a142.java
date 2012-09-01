package haxe;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_1e20a142 extends haxe.lang.Function
{
	public    Fun_1e20a142()
	{
		super(2, 0);
	}
	
	
	public static  haxe.Fun_1e20a142 __hx_current;
	
	@Override public   java.lang.Object __hx_invoke2_o(double __fn_float1, double __fn_float2, java.lang.Object __fn_dyn1, java.lang.Object __fn_dyn2)
	{
		java.lang.Object infos = ( (( __fn_dyn2 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float2) )) : (( (( __fn_dyn2 == null )) ? (null) : (((java.lang.Object) (__fn_dyn2) )) )) );
		java.lang.Object v = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((java.lang.Object) (__fn_float1) )) : (((java.lang.Object) (__fn_dyn1) )) );
		java.lang.String str = ( ( ( ( haxe.lang.Runtime.toString(haxe.lang.Runtime.getField(infos, "fileName", true)) + ":" ) + ((int) (haxe.lang.Runtime.getField_f(infos, "lineNumber", true)) ) ) + ": " ) + haxe.lang.Runtime.toString(v) );
		java.lang.System.out.println(str);
		return null;
	}
	
	
}


