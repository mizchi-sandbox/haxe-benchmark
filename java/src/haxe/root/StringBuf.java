package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class StringBuf extends haxe.lang.HxObject
{
	public    StringBuf()
	{
		super();
		haxe.root.StringBuf.__hx_ctor(this);
	}
	
	
	public static   void __hx_ctor(haxe.root.StringBuf __temp_me6)
	{
		__temp_me6.b = new java.lang.StringBuilder();
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.StringBuf(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.StringBuf();
	}
	
	
	public    StringBuf(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	@Override public   java.lang.String toString()
	{
		return this.b.toString();
	}
	
	
	public   void addChar(int c)
	{
		this.b.append(((char) (c) ));
	}
	
	
	public   void addSub(java.lang.String s, int pos, java.lang.Object len)
	{
		int l = haxe.lang.Runtime.toInt(( (( len == null )) ? (s.length()) : (len) ));
		this.b.append(s, pos, ( pos + l ));
	}
	
	
	public   void add(java.lang.Object x)
	{
		this.b.append(x);
	}
	
	
	public  java.lang.StringBuilder b;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef73 = true;
			switch (field.hashCode())
			{
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef73 = false;
						return this.b = ((java.lang.StringBuilder) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef73) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef74 = true;
			switch (field.hashCode())
			{
				case 98:
				{
					if (field.equals("b")) 
					{
						__temp_executeDef74 = false;
						return this.b;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef74 = false;
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case 96417:
				{
					if (field.equals("add")) 
					{
						__temp_executeDef74 = false;
						return new haxe.lang.Closure(this, "add");
					}
					
					break;
				}
				
				
				case -1149089897:
				{
					if (field.equals("addChar")) 
					{
						__temp_executeDef74 = false;
						return new haxe.lang.Closure(this, "addChar");
					}
					
					break;
				}
				
				
				case -1422524961:
				{
					if (field.equals("addSub")) 
					{
						__temp_executeDef74 = false;
						return new haxe.lang.Closure(this, "addSub");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef74) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef75 = true;
			switch (field.hashCode())
			{
				case 96417:
				{
					if (field.equals("add")) 
					{
						__temp_executeDef75 = false;
						this.add(dynargs.__get(0));
						return null;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef75 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case -1422524961:
				{
					if (field.equals("addSub")) 
					{
						__temp_executeDef75 = false;
						this.addSub(haxe.lang.Runtime.toString(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)), dynargs.__get(2));
						return null;
					}
					
					break;
				}
				
				
				case -1149089897:
				{
					if (field.equals("addChar")) 
					{
						__temp_executeDef75 = false;
						this.addChar(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef75) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("b");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


