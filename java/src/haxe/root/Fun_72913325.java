package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_72913325<T> extends haxe.lang.Function
{
	public    Fun_72913325(haxe.root.Array<haxe.root.Array> _g, haxe.root.Array<java.lang.Object> i)
	{
		super(0, 0);
		this._g = _g;
		this.i = i;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		T[] __temp_stmt40 = ((haxe.root.Array<T>) (((haxe.root.Array) (this._g.__get(0)) )) ).__a;
		int __temp_stmt41 = 0;
		{
			int __temp_arrIndex12 = 0;
			int __temp_arrVal10 = haxe.lang.Runtime.toInt(this.i.__get(__temp_arrIndex12));
			int __temp_arrRet11 = __temp_arrVal10++;
			int __temp_expr42 = haxe.lang.Runtime.toInt(this.i.__set(__temp_arrIndex12, __temp_arrVal10));
			__temp_stmt41 = __temp_arrRet11;
		}
		
		return __temp_stmt40[__temp_stmt41];
	}
	
	
	public  haxe.root.Array<haxe.root.Array> _g;
	
	public  haxe.root.Array<java.lang.Object> i;
	
}


