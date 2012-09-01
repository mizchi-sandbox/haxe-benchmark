package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_3ff0e6f1<T> extends haxe.lang.Function
{
	public    Fun_3ff0e6f1(haxe.root.Array<java.lang.Object> i, haxe.root.Array<java.lang.Object> len, haxe.root.Array<haxe.root.Hash> _g1)
	{
		super(0, 0);
		this.i = i;
		this.len = len;
		this._g1 = _g1;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		{
			int _g = haxe.lang.Runtime.toInt(this.i.__get(0));
			while (( _g < haxe.lang.Runtime.toInt(this.len.__get(0)) ))
			{
				int j = _g++;
				if ( ! ((( (( ((haxe.root.Hash<T>) (((haxe.root.Hash) (this._g1.__get(0)) )) ).hashes[j] & -2 )) == 0 ))) ) 
				{
					this.i.__set(0, j);
					return true;
				}
				
			}
			
		}
		
		return false;
	}
	
	
	public  haxe.root.Array<java.lang.Object> i;
	
	public  haxe.root.Array<java.lang.Object> len;
	
	public  haxe.root.Array<haxe.root.Hash> _g1;
	
}


