package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class List<T> extends haxe.lang.HxObject
{
	public    List()
	{
		super();
		haxe.root.List.__hx_ctor(this);
	}
	
	
	public static  <T1> void __hx_ctor(haxe.root.List<T1> __temp_me5)
	{
		__temp_me5.length = 0;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.List<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.List<java.lang.Object>();
	}
	
	
	public    List(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public  <X> haxe.root.List<X> map(haxe.lang.Function f)
	{
		haxe.root.List<X> b = new haxe.root.List<X>();
		haxe.root.Array l = this.h;
		while (( l != null ))
		{
			T v = ((T) (l.__get(0)) );
			l = ((haxe.root.Array) (l.__get(1)) );
			b.add(((X) (f.__hx_invoke1_o(0.0, v)) ));
		}
		
		return b;
	}
	
	
	public   haxe.root.List<T> filter(haxe.lang.Function f)
	{
		haxe.root.List<T> l2 = new haxe.root.List<T>();
		haxe.root.Array l = this.h;
		while (( l != null ))
		{
			T v = ((T) (l.__get(0)) );
			l = ((haxe.root.Array) (l.__get(1)) );
			if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, v))) 
			{
				l2.add(v);
			}
			
		}
		
		return l2;
	}
	
	
	public   java.lang.String join(java.lang.String sep)
	{
		haxe.root.StringBuf s = new haxe.root.StringBuf();
		boolean first = true;
		haxe.root.Array l = this.h;
		while (( l != null ))
		{
			if (first) 
			{
				first = false;
			}
			 else 
			{
				s.add(sep);
			}
			
			s.add(l.__get(0));
			l = ((haxe.root.Array) (l.__get(1)) );
		}
		
		return s.toString();
	}
	
	
	@Override public   java.lang.String toString()
	{
		haxe.root.StringBuf s = new haxe.root.StringBuf();
		boolean first = true;
		haxe.root.Array l = this.h;
		s.add("{");
		while (( l != null ))
		{
			if (first) 
			{
				first = false;
			}
			 else 
			{
				s.add(", ");
			}
			
			s.add(haxe.lang.Runtime.toString(l.__get(0)));
			l = ((haxe.root.Array) (l.__get(1)) );
		}
		
		s.add("}");
		return s.toString();
	}
	
	
	public   java.lang.Object iterator()
	{
		haxe.root.Array<haxe.root.Array> h = new haxe.root.Array<haxe.root.Array>(new haxe.root.Array[]{this.h});
		java.lang.Object __temp_stmt64 = null;
		{
			haxe.lang.Function __temp_odecl62 = new haxe.root.Fun_63351850(((haxe.root.Array<haxe.root.Array>) (h) ));
			haxe.lang.Function __temp_odecl63 = new haxe.root.Fun_ef65a572(((haxe.root.Array<haxe.root.Array>) (h) ));
			__temp_stmt64 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"hasNext", "next"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{__temp_odecl62, __temp_odecl63}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array(new java.lang.Object[]{}));
		}
		
		return ((java.lang.Object) (__temp_stmt64) );
	}
	
	
	public   boolean remove(T v)
	{
		haxe.root.Array prev = null;
		haxe.root.Array l = this.h;
		while (( l != null ))
		{
			if (haxe.lang.Runtime.eq(l.__get(0), v)) 
			{
				if (( prev == null )) 
				{
					this.h = ((haxe.root.Array) (l.__get(1)) );
				}
				 else 
				{
					prev.__set(1, l.__get(1));
				}
				
				if (( this.q == l )) 
				{
					this.q = prev;
				}
				
				this.length--;
				return true;
			}
			
			prev = l;
			l = ((haxe.root.Array) (l.__get(1)) );
		}
		
		return false;
	}
	
	
	public   void clear()
	{
		this.h = null;
		this.q = null;
		this.length = 0;
	}
	
	
	public   boolean isEmpty()
	{
		return ( this.h == null );
	}
	
	
	public   java.lang.Object pop()
	{
		if (( this.h == null )) 
		{
			return null;
		}
		
		java.lang.Object x = this.h.__get(0);
		this.h = ((haxe.root.Array) (this.h.__get(1)) );
		if (( this.h == null )) 
		{
			this.q = null;
		}
		
		this.length--;
		return x;
	}
	
	
	public   java.lang.Object last()
	{
		return ( (( this.q == null )) ? (null) : (this.q.__get(0)) );
	}
	
	
	public   java.lang.Object first()
	{
		return ( (( this.h == null )) ? (null) : (this.h.__get(0)) );
	}
	
	
	public   void push(T item)
	{
		haxe.root.Array x = new haxe.root.Array(new java.lang.Object[]{item, this.h});
		this.h = x;
		if (( this.q == null )) 
		{
			this.q = x;
		}
		
		this.length++;
	}
	
	
	public   void add(T item)
	{
		haxe.root.Array x = new haxe.root.Array(new java.lang.Object[]{item});
		if (( this.h == null )) 
		{
			this.h = x;
		}
		 else 
		{
			this.q.__set(1, x);
		}
		
		this.q = x;
		this.length++;
	}
	
	
	public  int length;
	
	public  haxe.root.Array q;
	
	public  haxe.root.Array h;
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef65 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef65 = false;
						return this.length = ((int) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef65) 
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
			boolean __temp_executeDef66 = true;
			switch (field.hashCode())
			{
				case 104:
				{
					if (field.equals("h")) 
					{
						__temp_executeDef66 = false;
						return this.h = ((haxe.root.Array) (value) );
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef66 = false;
						return this.length = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 113:
				{
					if (field.equals("q")) 
					{
						__temp_executeDef66 = false;
						return this.q = ((haxe.root.Array) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef66) 
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
			boolean __temp_executeDef67 = true;
			switch (field.hashCode())
			{
				case 104:
				{
					if (field.equals("h")) 
					{
						__temp_executeDef67 = false;
						return this.h;
					}
					
					break;
				}
				
				
				case 107868:
				{
					if (field.equals("map")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "map");
					}
					
					break;
				}
				
				
				case 113:
				{
					if (field.equals("q")) 
					{
						__temp_executeDef67 = false;
						return this.q;
					}
					
					break;
				}
				
				
				case -1274492040:
				{
					if (field.equals("filter")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "filter");
					}
					
					break;
				}
				
				
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef67 = false;
						return this.length;
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "join");
					}
					
					break;
				}
				
				
				case 96417:
				{
					if (field.equals("add")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "add");
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case 3452698:
				{
					if (field.equals("push")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "push");
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "iterator");
					}
					
					break;
				}
				
				
				case 97440432:
				{
					if (field.equals("first")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "first");
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "remove");
					}
					
					break;
				}
				
				
				case 3314326:
				{
					if (field.equals("last")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "last");
					}
					
					break;
				}
				
				
				case 94746189:
				{
					if (field.equals("clear")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "clear");
					}
					
					break;
				}
				
				
				case 111185:
				{
					if (field.equals("pop")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "pop");
					}
					
					break;
				}
				
				
				case 2058039875:
				{
					if (field.equals("isEmpty")) 
					{
						__temp_executeDef67 = false;
						return new haxe.lang.Closure(this, "isEmpty");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef67) 
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
			boolean __temp_executeDef68 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef68 = false;
						return this.length;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef68) 
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
			boolean __temp_executeDef69 = true;
			switch (field.hashCode())
			{
				case 96417:
				{
					if (field.equals("add")) 
					{
						__temp_executeDef69 = false;
						this.add(((T) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case 107868:
				{
					if (field.equals("map")) 
					{
						__temp_executeDef69 = false;
						return ((haxe.root.List) (this.map(((haxe.lang.Function) (dynargs.__get(0)) ))) );
					}
					
					break;
				}
				
				
				case 3452698:
				{
					if (field.equals("push")) 
					{
						__temp_executeDef69 = false;
						this.push(((T) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case -1274492040:
				{
					if (field.equals("filter")) 
					{
						__temp_executeDef69 = false;
						return this.filter(((haxe.lang.Function) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 97440432:
				{
					if (field.equals("first")) 
					{
						__temp_executeDef69 = false;
						return this.first();
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef69 = false;
						return this.join(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 3314326:
				{
					if (field.equals("last")) 
					{
						__temp_executeDef69 = false;
						return this.last();
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef69 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case 111185:
				{
					if (field.equals("pop")) 
					{
						__temp_executeDef69 = false;
						return this.pop();
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef69 = false;
						return this.iterator();
					}
					
					break;
				}
				
				
				case 2058039875:
				{
					if (field.equals("isEmpty")) 
					{
						__temp_executeDef69 = false;
						return this.isEmpty();
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef69 = false;
						return this.remove(((T) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 94746189:
				{
					if (field.equals("clear")) 
					{
						__temp_executeDef69 = false;
						this.clear();
						return null;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef69) 
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
		baseArr.push("h");
		baseArr.push("q");
		baseArr.push("length");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


