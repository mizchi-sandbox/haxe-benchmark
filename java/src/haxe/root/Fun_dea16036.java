package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Fun_dea16036<T> extends haxe.lang.Function
{
	public    Fun_dea16036(haxe.root.Array<haxe.root.Hash> _g1, haxe.root.Array<java.lang.Object> i)
	{
		super(0, 0);
		this._g1 = _g1;
		this.i = i;
	}
	
	
	@Override public   java.lang.Object __hx_invoke0_o()
	{
		java.lang.String ret = ((haxe.root.Hash<T>) (((haxe.root.Hash) (this._g1.__get(0)) )) )._keys[haxe.lang.Runtime.toInt(this.i.__get(0))];
		((haxe.root.Hash<T>) (((haxe.root.Hash) (this._g1.__get(0)) )) ).cachedIndex = haxe.lang.Runtime.toInt(this.i.__get(0));
		((haxe.root.Hash<T>) (((haxe.root.Hash) (this._g1.__get(0)) )) ).cachedKey = ret;
		this.i.__set(0, ( haxe.lang.Runtime.toInt(this.i.__get(0)) + 1 ));
		return ret;
	}
	
	
	public  haxe.root.Array<haxe.root.Hash> _g1;
	
	public  haxe.root.Array<java.lang.Object> i;
	
}


