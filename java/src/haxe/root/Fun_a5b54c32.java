package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_a5b54c32 extends haxe.lang.Function
{
	public    Fun_a5b54c32(haxe.root.Array<haxe.root.Array> arr)
	{
		super(0, 0);
		this.arr = arr;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		int _g = 1;
		while (( _g < 100000 ))
		{
			int i = _g++;
			int num = ((int) (( java.lang.Math.random() * 1000 )) );
			((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (this.arr.__get(0)) )) ).push(num);
		}
		
		return null;
	}
	
	
	public  haxe.root.Array<haxe.root.Array> arr;
	
}


