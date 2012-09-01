package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Lambda extends haxe.lang.HxObject
{
	public    Lambda()
	{
		super();
	}
	
	
	public static  <A> haxe.root.Array<A> array(java.lang.Object it)
	{
		haxe.root.Array<A> a = new haxe.root.Array<A>();
		{
			java.lang.Object __temp_iterator14 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator14, "hasNext", null)))
			{
				A i = ((A) (haxe.lang.Runtime.callField(__temp_iterator14, "next", null)) );
				a.push(i);
			}
			
		}
		
		return a;
	}
	
	
	public static  <A> haxe.root.List<A> list(java.lang.Object it)
	{
		haxe.root.List<A> l = new haxe.root.List<A>();
		{
			java.lang.Object __temp_iterator15 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator15, "hasNext", null)))
			{
				A i = ((A) (haxe.lang.Runtime.callField(__temp_iterator15, "next", null)) );
				l.add(i);
			}
			
		}
		
		return l;
	}
	
	
	public static  <A, B> haxe.root.List<B> map(java.lang.Object it, haxe.lang.Function f)
	{
		haxe.root.List<B> l = new haxe.root.List<B>();
		{
			java.lang.Object __temp_iterator16 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator16, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator16, "next", null)) );
				l.add(((B) (f.__hx_invoke1_o(0.0, x)) ));
			}
			
		}
		
		return l;
	}
	
	
	public static  <A, B> haxe.root.List<B> mapi(java.lang.Object it, haxe.lang.Function f)
	{
		haxe.root.List<B> l = new haxe.root.List<B>();
		int i = 0;
		{
			java.lang.Object __temp_iterator17 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator17, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator17, "next", null)) );
				l.add(((B) (f.__hx_invoke2_o(i++, 0.0, haxe.lang.Runtime.undefined, x)) ));
			}
			
		}
		
		return l;
	}
	
	
	public static  <A> boolean has(java.lang.Object it, A elt, haxe.lang.Function cmp)
	{
		if (( cmp == null )) 
		{
			{
				java.lang.Object __temp_iterator19 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator19, "hasNext", null)))
				{
					A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator19, "next", null)) );
					if (haxe.lang.Runtime.eq(x, elt)) 
					{
						return true;
					}
					
				}
				
			}
			
		}
		 else 
		{
			{
				java.lang.Object __temp_iterator18 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator18, "hasNext", null)))
				{
					A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator18, "next", null)) );
					if (haxe.lang.Runtime.toBool(cmp.__hx_invoke2_o(0.0, 0.0, x, elt))) 
					{
						return true;
					}
					
				}
				
			}
			
		}
		
		return false;
	}
	
	
	public static  <A> boolean exists(java.lang.Object it, haxe.lang.Function f)
	{
		{
			java.lang.Object __temp_iterator20 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator20, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator20, "next", null)) );
				if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, x))) 
				{
					return true;
				}
				
			}
			
		}
		
		return false;
	}
	
	
	public static  <A> boolean foreach(java.lang.Object it, haxe.lang.Function f)
	{
		{
			java.lang.Object __temp_iterator21 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator21, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator21, "next", null)) );
				if ( ! (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, x))) ) 
				{
					return false;
				}
				
			}
			
		}
		
		return true;
	}
	
	
	public static  <A> void iter(java.lang.Object it, haxe.lang.Function f)
	{
		{
			java.lang.Object __temp_iterator22 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator22, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator22, "next", null)) );
				f.__hx_invoke1_o(0.0, x);
			}
			
		}
		
	}
	
	
	public static  <A> haxe.root.List<A> filter(java.lang.Object it, haxe.lang.Function f)
	{
		haxe.root.List<A> l = new haxe.root.List<A>();
		{
			java.lang.Object __temp_iterator23 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator23, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator23, "next", null)) );
				if (haxe.lang.Runtime.toBool(f.__hx_invoke1_o(0.0, x))) 
				{
					l.add(x);
				}
				
			}
			
		}
		
		return l;
	}
	
	
	public static  <A, B> B fold(java.lang.Object it, haxe.lang.Function f, B first)
	{
		{
			java.lang.Object __temp_iterator24 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator24, "hasNext", null)))
			{
				A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator24, "next", null)) );
				first = ((B) (f.__hx_invoke2_o(0.0, 0.0, x, first)) );
			}
			
		}
		
		return first;
	}
	
	
	public static  <A> int count(java.lang.Object it, haxe.lang.Function pred)
	{
		int n = 0;
		if (( pred == null )) 
		{
			{
				java.lang.Object __temp_iterator26 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator26, "hasNext", null)))
				{
					A _ = ((A) (haxe.lang.Runtime.callField(__temp_iterator26, "next", null)) );
					n++;
				}
				
			}
			
		}
		 else 
		{
			{
				java.lang.Object __temp_iterator25 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
				while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator25, "hasNext", null)))
				{
					A x = ((A) (haxe.lang.Runtime.callField(__temp_iterator25, "next", null)) );
					if (haxe.lang.Runtime.toBool(pred.__hx_invoke1_o(0.0, x))) 
					{
						n++;
					}
					
				}
				
			}
			
		}
		
		return n;
	}
	
	
	public static   boolean empty(java.lang.Object it)
	{
		return  ! (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) ), "hasNext", null))) ;
	}
	
	
	public static  <T> int indexOf(java.lang.Object it, T v)
	{
		int i = 0;
		{
			java.lang.Object __temp_iterator27 = ((java.lang.Object) (haxe.lang.Runtime.callField(it, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator27, "hasNext", null)))
			{
				T v2 = ((T) (haxe.lang.Runtime.callField(__temp_iterator27, "next", null)) );
				if (haxe.lang.Runtime.eq(v, v2)) 
				{
					return i;
				}
				
				i++;
			}
			
		}
		
		return -1;
	}
	
	
	public static  <T> haxe.root.List<T> concat(java.lang.Object a, java.lang.Object b)
	{
		haxe.root.List<T> l = new haxe.root.List<T>();
		{
			java.lang.Object __temp_iterator28 = ((java.lang.Object) (haxe.lang.Runtime.callField(a, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator28, "hasNext", null)))
			{
				T x = ((T) (haxe.lang.Runtime.callField(__temp_iterator28, "next", null)) );
				l.add(x);
			}
			
		}
		
		{
			java.lang.Object __temp_iterator29 = ((java.lang.Object) (haxe.lang.Runtime.callField(b, "iterator", null)) );
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator29, "hasNext", null)))
			{
				T x = ((T) (haxe.lang.Runtime.callField(__temp_iterator29, "next", null)) );
				l.add(x);
			}
			
		}
		
		return l;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Lambda(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Lambda();
	}
	
	
	public    Lambda(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
}


