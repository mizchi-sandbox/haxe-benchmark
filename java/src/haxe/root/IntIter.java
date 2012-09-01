package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class IntIter extends haxe.lang.HxObject
{
	public    IntIter(int min, int max)
	{
		super();
		haxe.root.IntIter.__hx_ctor(this, min, max);
	}
	
	
	public static   void __hx_ctor(haxe.root.IntIter __temp_me4, int min, int max)
	{
		__temp_me4.min = min;
		__temp_me4.max = max;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.IntIter(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.IntIter(haxe.lang.Runtime.toInt(arr.__get(0)), haxe.lang.Runtime.toInt(arr.__get(1)));
	}
	
	
	public    IntIter(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public   int next()
	{
		return this.min++;
	}
	
	
	public   boolean hasNext()
	{
		return ( this.min < this.max );
	}
	
	
	public  int max;
	
	public  int min;
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef57 = true;
			switch (field.hashCode())
			{
				case 108114:
				{
					if (field.equals("min")) 
					{
						__temp_executeDef57 = false;
						return this.min = ((int) (value) );
					}
					
					break;
				}
				
				
				case 107876:
				{
					if (field.equals("max")) 
					{
						__temp_executeDef57 = false;
						return this.max = ((int) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef57) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef58 = true;
			switch (field.hashCode())
			{
				case 108114:
				{
					if (field.equals("min")) 
					{
						__temp_executeDef58 = false;
						return this.min = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 107876:
				{
					if (field.equals("max")) 
					{
						__temp_executeDef58 = false;
						return this.max = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef58) 
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
			boolean __temp_executeDef59 = true;
			switch (field.hashCode())
			{
				case 108114:
				{
					if (field.equals("min")) 
					{
						__temp_executeDef59 = false;
						return this.min;
					}
					
					break;
				}
				
				
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef59 = false;
						return new haxe.lang.Closure(this, "next");
					}
					
					break;
				}
				
				
				case 107876:
				{
					if (field.equals("max")) 
					{
						__temp_executeDef59 = false;
						return this.max;
					}
					
					break;
				}
				
				
				case 696759469:
				{
					if (field.equals("hasNext")) 
					{
						__temp_executeDef59 = false;
						return new haxe.lang.Closure(this, "hasNext");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef59) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef60 = true;
			switch (field.hashCode())
			{
				case 108114:
				{
					if (field.equals("min")) 
					{
						__temp_executeDef60 = false;
						return this.min;
					}
					
					break;
				}
				
				
				case 107876:
				{
					if (field.equals("max")) 
					{
						__temp_executeDef60 = false;
						return this.max;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef60) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
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
			boolean __temp_executeDef61 = true;
			switch (field.hashCode())
			{
				case 696759469:
				{
					if (field.equals("hasNext")) 
					{
						__temp_executeDef61 = false;
						return this.hasNext();
					}
					
					break;
				}
				
				
				case 3377907:
				{
					if (field.equals("next")) 
					{
						__temp_executeDef61 = false;
						return this.next();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef61) 
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
		baseArr.push("min");
		baseArr.push("max");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


