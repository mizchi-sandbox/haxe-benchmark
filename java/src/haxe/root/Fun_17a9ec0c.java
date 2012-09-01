package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_17a9ec0c extends haxe.lang.Function
{
	public    Fun_17a9ec0c(haxe.root.Array pivot)
	{
		super(1, 0);
		this.pivot = pivot;
	}
	
	
	@Override public   java.lang.Object __hx_invoke1_o(double __fn_float1, java.lang.Object __fn_dyn1)
	{
		int i = ( (( __fn_dyn1 == haxe.lang.Runtime.undefined )) ? (((int) (__fn_float1) )) : (haxe.lang.Runtime.toInt(__fn_dyn1)) );
		return ( haxe.lang.Runtime.compare(i, this.pivot.__get(0)) < 0 );
	}
	
	
	public  haxe.root.Array pivot;
	
}


