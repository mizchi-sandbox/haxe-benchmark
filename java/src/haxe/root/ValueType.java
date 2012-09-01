package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class ValueType extends haxe.lang.Enum
{
	static 
	{
		haxe.root.ValueType.constructs = new haxe.root.Array<java.lang.String>(new java.lang.String[]{"TNull", "TInt", "TFloat", "TBool", "TObject", "TFunction", "TClass", "TEnum", "TUnknown"});
		haxe.root.ValueType.TNull = new haxe.root.ValueType(0, null);
		haxe.root.ValueType.TInt = new haxe.root.ValueType(1, null);
		haxe.root.ValueType.TFloat = new haxe.root.ValueType(2, null);
		haxe.root.ValueType.TBool = new haxe.root.ValueType(3, null);
		haxe.root.ValueType.TObject = new haxe.root.ValueType(4, null);
		haxe.root.ValueType.TFunction = new haxe.root.ValueType(5, null);
		haxe.root.ValueType.TUnknown = new haxe.root.ValueType(8, null);
	}
	public    ValueType(int index, haxe.root.Array<java.lang.Object> params)
	{
		super(index, params);
	}
	
	
	public static  haxe.root.Array<java.lang.String> constructs;
	
	public static  haxe.root.ValueType TNull;
	
	public static  haxe.root.ValueType TInt;
	
	public static  haxe.root.ValueType TFloat;
	
	public static  haxe.root.ValueType TBool;
	
	public static  haxe.root.ValueType TObject;
	
	public static  haxe.root.ValueType TFunction;
	
	public static   haxe.root.ValueType TClass(java.lang.Class c)
	{
		return new haxe.root.ValueType(6, new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{c}));
	}
	
	
	public static   haxe.root.ValueType TEnum(java.lang.Class e)
	{
		return new haxe.root.ValueType(7, new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{e}));
	}
	
	
	public static  haxe.root.ValueType TUnknown;
	
}


