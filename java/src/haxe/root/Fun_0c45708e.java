package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_0c45708e extends haxe.lang.Function
{
	public    Fun_0c45708e(haxe.root.Array<haxe.root.Array> arr)
	{
		super(0, 0);
		this.arr = arr;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		int _g = 1;
		while (( _g < 1000000 ))
		{
			int i = _g++;
			int num = ((int) (( java.lang.Math.random() * 1000 )) );
			((haxe.root.Array<java.lang.Object>) (((haxe.root.Array) (this.arr.__get(0)) )) ).push(num);
		}
		
		return null;
	}
	
	
	public  haxe.root.Array<haxe.root.Array> arr;
	
}


