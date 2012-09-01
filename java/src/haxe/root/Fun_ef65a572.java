package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_ef65a572 extends haxe.lang.Function
{
	public    Fun_ef65a572(haxe.root.Array<haxe.root.Array> h)
	{
		super(0, 0);
		this.h = h;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		if (( this.h.__get(0) == null )) 
		{
			return null;
		}
		
		java.lang.Object x = this.h.__get(0).__get(0);
		this.h.__set(0, ((haxe.root.Array) (this.h.__get(0).__get(1)) ));
		return x;
	}
	
	
	public  haxe.root.Array<haxe.root.Array> h;
	
}


