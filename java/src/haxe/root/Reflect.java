package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Reflect extends haxe.lang.HxObject
{
	public    Reflect()
	{
		super();
	}
	
	
	public static   boolean hasField(java.lang.Object o, java.lang.String field)
	{
		
		if (o instanceof haxe.lang.IHxObject)
		return ((haxe.lang.IHxObject) o).__hx_getField(field, false, true, false) != haxe.lang.Runtime.undefined;
		
		return haxe.lang.Runtime.slowHasField(o, field);
	
	}
	
	
	public static   java.lang.Object field(java.lang.Object o, java.lang.String field)
	{
		
		if (o instanceof haxe.lang.IHxObject)
			return ((haxe.lang.IHxObject) o).__hx_getField(field, false, false, false);
		
		return haxe.lang.Runtime.slowGetField(o, field, false);
	
	}
	
	
	public static   void setField(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		
		if (o instanceof haxe.lang.IHxObject)
			((haxe.lang.IHxObject) o).__hx_setField(field, value, false);
		else
			haxe.lang.Runtime.slowSetField(o, field, value);
	
	}
	
	
	public static   java.lang.Object getProperty(java.lang.Object o, java.lang.String field)
	{
		
		if (o instanceof haxe.lang.IHxObject)
			return ((haxe.lang.IHxObject) o).__hx_getField(field, false, false, true);
		
		return haxe.lang.Runtime.slowGetField(o, field, false);
	
	}
	
	
	public static   void setProperty(java.lang.Object o, java.lang.String field, java.lang.Object value)
	{
		
		if (o instanceof haxe.lang.IHxObject)
			((haxe.lang.IHxObject) o).__hx_setField(field, value, true);
		else
			haxe.lang.Runtime.slowSetField(o, field, value);
	
	}
	
	
	public static   java.lang.Object callMethod(java.lang.Object o, java.lang.Object func, haxe.root.Array args)
	{
		
		return ((haxe.lang.Function) func).__hx_invokeDynamic(args);
	
	}
	
	
	public static   haxe.root.Array<java.lang.String> fields(java.lang.Object o)
	{
		
		if (o instanceof haxe.lang.IHxObject)
		{
			Array<String> ret = new Array<String>();
				((haxe.lang.IHxObject) o).__hx_getFields(ret);
			return ret;
		} else if (o instanceof java.lang.Class) {
			return Type.getClassFields( (java.lang.Class) o);
		} else {
			return new Array<String>();
		}
	
	}
	
	
	public static   boolean isFunction(java.lang.Object f)
	{
		
		return f instanceof haxe.lang.Function;
	
	}
	
	
	public static  <T> int compare(T a, T b)
	{
		
		return haxe.lang.Runtime.compare(a, b);
	
	}
	
	
	public static   boolean compareMethods(java.lang.Object f1, java.lang.Object f2)
	{
		
		if (f1 == f2) 
			return true;
		
		if (f1 instanceof haxe.lang.Closure && f2 instanceof haxe.lang.Closure)
		{
			haxe.lang.Closure f1c = (haxe.lang.Closure) f1;
			haxe.lang.Closure f2c = (haxe.lang.Closure) f2;
			
			return haxe.lang.Runtime.refEq(f1c.obj, f2c.obj) && f1c.field.equals(f2c.field);
		}
		
		
		return false;
	
	}
	
	
	public static   boolean isObject(java.lang.Object v)
	{
		
		return v instanceof haxe.lang.DynamicObject;
	
	}
	
	
	public static   boolean deleteField(java.lang.Object o, java.lang.String f)
	{
		
		return (o instanceof haxe.lang.DynamicObject && ((haxe.lang.DynamicObject) o).__hx_deleteField(f));
	
	}
	
	
	public static  <T> T copy(T o)
	{
		java.lang.Object o2 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array(new java.lang.Object[]{}));
		{
			int _g = 0;
			haxe.root.Array<java.lang.String> _g1 = haxe.root.Reflect.fields(o);
			while (( _g < _g1.length ))
			{
				java.lang.String f = _g1.__get(_g);
				 ++ _g;
				haxe.root.Reflect.setField(o2, f, haxe.root.Reflect.field(o, f));
			}
			
		}
		
		return ((T) (o2) );
	}
	
	
	public static   java.lang.Object makeVarArgs(haxe.lang.Function f)
	{
		return new haxe.lang.VarArgsFunction(((haxe.lang.Function) (f) ));
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Reflect(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Reflect();
	}
	
	
	public    Reflect(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


