package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"deprecation", "rawtypes", "unchecked"})
public  class Date extends haxe.lang.HxObject
{
	public    Date(int year, int month, int day, int hour, int min, int sec)
	{
		super();
		haxe.root.Date.__hx_ctor(this, year, month, day, hour, min, sec);
	}
	
	
	public static   void __hx_ctor(haxe.root.Date __temp_me2, int year, int month, int day, int hour, int min, int sec)
	{
		__temp_me2.date = new java.util.Date(( (( year != 0 )) ? (( year - 1900 )) : (0) ), month, day, hour, min, sec);
	}
	
	
	public static   haxe.root.Date now()
	{
		haxe.root.Date d = new haxe.root.Date(0, 0, 0, 0, 0, 0);
		d.date = new java.util.Date();
		return d;
	}
	
	
	public static   haxe.root.Date fromTime(double t)
	{
		haxe.root.Date d = new haxe.root.Date(0, 0, 0, 0, 0, 0);
		d.date = new java.util.Date(((long) (t) ));
		return d;
	}
	
	
	public static   haxe.root.Date fromString(java.lang.String s)
	{
		switch (s.length())
		{
			case 8:
			{
				haxe.root.Array<java.lang.String> k = haxe.lang.StringExt.split(s, ":");
				haxe.root.Date d = new haxe.root.Date(0, 0, 0, haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k.__get(0))), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k.__get(1))), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k.__get(2))));
				return d;
			}
			
			
			case 10:
			{
				haxe.root.Array<java.lang.String> k = haxe.lang.StringExt.split(s, "-");
				return new haxe.root.Date(haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k.__get(0))), ( haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k.__get(1))) - ((int) (1) ) ), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(k.__get(2))), 0, 0, 0);
			}
			
			
			case 19:
			{
				haxe.root.Array<java.lang.String> k = haxe.lang.StringExt.split(s, " ");
				haxe.root.Array<java.lang.String> y = haxe.lang.StringExt.split(k.__get(0), "-");
				haxe.root.Array<java.lang.String> t = haxe.lang.StringExt.split(k.__get(1), ":");
				return new haxe.root.Date(haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(y.__get(0))), ( haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(y.__get(1))) - ((int) (1) ) ), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(y.__get(2))), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(t.__get(0))), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(t.__get(1))), haxe.lang.Runtime.toInt(haxe.root.Std.parseInt(t.__get(2))));
			}
			
			
			default:
			{
				throw haxe.lang.HaxeException.wrap(( "Invalid date format : " + s ));
			}
			
		}
		
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Date(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Date(haxe.lang.Runtime.toInt(arr.__get(0)), haxe.lang.Runtime.toInt(arr.__get(1)), haxe.lang.Runtime.toInt(arr.__get(2)), haxe.lang.Runtime.toInt(arr.__get(3)), haxe.lang.Runtime.toInt(arr.__get(4)), haxe.lang.Runtime.toInt(arr.__get(5)));
	}
	
	
	public    Date(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	@Override public   java.lang.String toString()
	{
		int m = ( this.date.getMonth() + 1 );
		int d = this.date.getDate();
		int h = this.date.getHours();
		int mi = this.date.getMinutes();
		int s = this.date.getSeconds();
		return ( ( ( ( ( ( ( ( ( ( ( this.date.getYear() + 1900 ) + "-" ) + (( (( m < 10 )) ? (( "0" + m )) : (( "" + m )) )) ) + "-" ) + (( (( d < 10 )) ? (( "0" + d )) : (( "" + d )) )) ) + " " ) + (( (( h < 10 )) ? (( "0" + h )) : (( "" + h )) )) ) + ":" ) + (( (( mi < 10 )) ? (( "0" + mi )) : (( "" + mi )) )) ) + ":" ) + (( (( s < 10 )) ? (( "0" + s )) : (( "" + s )) )) );
	}
	
	
	public final   int getDay()
	{
		return this.date.getDay();
	}
	
	
	public final   int getDate()
	{
		return this.date.getDate();
	}
	
	
	public final   int getMonth()
	{
		return this.date.getMonth();
	}
	
	
	public final   int getFullYear()
	{
		return ( this.date.getYear() + 1900 );
	}
	
	
	public final   int getSeconds()
	{
		return this.date.getSeconds();
	}
	
	
	public final   int getMinutes()
	{
		return this.date.getMinutes();
	}
	
	
	public final   int getHours()
	{
		return this.date.getHours();
	}
	
	
	public final   double getTime()
	{
		return ((double) (this.date.getTime()) );
	}
	
	
	public  java.util.Date date;
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef43 = true;
			switch (field.hashCode())
			{
				case 3076014:
				{
					if (field.equals("date")) 
					{
						__temp_executeDef43 = false;
						return this.date = ((java.util.Date) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef43) 
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
			boolean __temp_executeDef44 = true;
			switch (field.hashCode())
			{
				case 3076014:
				{
					if (field.equals("date")) 
					{
						__temp_executeDef44 = false;
						return this.date;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case -75121853:
				{
					if (field.equals("getTime")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getTime");
					}
					
					break;
				}
				
				
				case -1249364890:
				{
					if (field.equals("getDay")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getDay");
					}
					
					break;
				}
				
				
				case 1955294553:
				{
					if (field.equals("getHours")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getHours");
					}
					
					break;
				}
				
				
				case -75605980:
				{
					if (field.equals("getDate")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getDate");
					}
					
					break;
				}
				
				
				case 2101762217:
				{
					if (field.equals("getMinutes")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getMinutes");
					}
					
					break;
				}
				
				
				case 1959905482:
				{
					if (field.equals("getMonth")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getMonth");
					}
					
					break;
				}
				
				
				case -1288010167:
				{
					if (field.equals("getSeconds")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getSeconds");
					}
					
					break;
				}
				
				
				case -885883678:
				{
					if (field.equals("getFullYear")) 
					{
						__temp_executeDef44 = false;
						return new haxe.lang.Closure(this, "getFullYear");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef44) 
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
			boolean __temp_executeDef45 = true;
			switch (field.hashCode())
			{
				case -75121853:
				{
					if (field.equals("getTime")) 
					{
						__temp_executeDef45 = false;
						return this.getTime();
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef45 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case 1955294553:
				{
					if (field.equals("getHours")) 
					{
						__temp_executeDef45 = false;
						return this.getHours();
					}
					
					break;
				}
				
				
				case -1249364890:
				{
					if (field.equals("getDay")) 
					{
						__temp_executeDef45 = false;
						return this.getDay();
					}
					
					break;
				}
				
				
				case 2101762217:
				{
					if (field.equals("getMinutes")) 
					{
						__temp_executeDef45 = false;
						return this.getMinutes();
					}
					
					break;
				}
				
				
				case -75605980:
				{
					if (field.equals("getDate")) 
					{
						__temp_executeDef45 = false;
						return this.getDate();
					}
					
					break;
				}
				
				
				case -1288010167:
				{
					if (field.equals("getSeconds")) 
					{
						__temp_executeDef45 = false;
						return this.getSeconds();
					}
					
					break;
				}
				
				
				case 1959905482:
				{
					if (field.equals("getMonth")) 
					{
						__temp_executeDef45 = false;
						return this.getMonth();
					}
					
					break;
				}
				
				
				case -885883678:
				{
					if (field.equals("getFullYear")) 
					{
						__temp_executeDef45 = false;
						return this.getFullYear();
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef45) 
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
		baseArr.push("date");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


