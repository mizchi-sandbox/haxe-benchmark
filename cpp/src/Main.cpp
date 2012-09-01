#include <hxcpp.h>

#ifndef INCLUDED_Date
#include <Date.h>
#endif
#ifndef INCLUDED_Lambda
#include <Lambda.h>
#endif
#ifndef INCLUDED_Main
#include <Main.h>
#endif
#ifndef INCLUDED_hxMath
#include <hxMath.h>
#endif
#ifndef INCLUDED_haxe_Log
#include <haxe/Log.h>
#endif

Void Main_obj::__construct()
{
	return null();
}

Main_obj::~Main_obj() { }

Dynamic Main_obj::__CreateEmpty() { return  new Main_obj; }
hx::ObjectPtr< Main_obj > Main_obj::__new()
{  hx::ObjectPtr< Main_obj > result = new Main_obj();
	result->__construct();
	return result;}

Dynamic Main_obj::__Create(hx::DynamicArray inArgs)
{  hx::ObjectPtr< Main_obj > result = new Main_obj();
	result->__construct();
	return result;}

Void Main_obj::main( ){
{
		HX_STACK_PUSH("Main::main","Main.hx",7);
		HX_STACK_LINE(8)
		::haxe::Log_obj::trace(HX_CSTRING("Hello World !"),hx::SourceInfo(HX_CSTRING("Main.hx"),8,HX_CSTRING("Main"),HX_CSTRING("main")));
		HX_STACK_LINE(9)
		Array< Array< int > > arr = Array_obj< Array< int > >::__new().Add(Array_obj< int >::__new());		HX_STACK_VAR(arr,"arr");

		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_Function_1_1,Array< Array< int > >,arr)
		Void run(){
			HX_STACK_PUSH("*::_Function_1_1","Main.hx",11);
			{
				HX_STACK_LINE(12)
				int _g = (int)1;		HX_STACK_VAR(_g,"_g");
				HX_STACK_LINE(12)
				while(((_g < (int)100000))){
					HX_STACK_LINE(12)
					int i = (_g)++;		HX_STACK_VAR(i,"i");
					HX_STACK_LINE(13)
					int num = (::Math_obj::random() * (int)1000);		HX_STACK_VAR(num,"num");
					HX_STACK_LINE(14)
					arr->__get((int)0)->push(num);
				}
			}
			return null();
		}
		HX_END_LOCAL_FUNC0((void))

		HX_STACK_LINE(11)
		::Main_obj::showExecTime(HX_CSTRING("array insertion"), Dynamic(new _Function_1_1(arr)));

		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_Function_1_2,Array< Array< int > >,arr)
		Void run(){
			HX_STACK_PUSH("*::_Function_1_2","Main.hx",18);
			{
				HX_STACK_LINE(18)
				::Main_obj::qsort(arr->__get((int)0));
			}
			return null();
		}
		HX_END_LOCAL_FUNC0((void))

		HX_STACK_LINE(18)
		::Main_obj::showExecTime(HX_CSTRING("quicksort"), Dynamic(new _Function_1_2(arr)));

		HX_BEGIN_LOCAL_FUNC_S1(hx::LocalFunc,_Function_1_3,Array< Array< int > >,arr)
		Void run(){
			HX_STACK_PUSH("*::_Function_1_3","Main.hx",22);
			{
				HX_STACK_LINE(22)
				::Main_obj::sum(arr->__get((int)0));
			}
			return null();
		}
		HX_END_LOCAL_FUNC0((void))

		HX_STACK_LINE(22)
		::Main_obj::showExecTime(HX_CSTRING("lambda sum"), Dynamic(new _Function_1_3(arr)));
	}
return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC0(Main_obj,main,(void))

Float Main_obj::measureExecTime( Dynamic func){
	HX_STACK_PUSH("Main::measureExecTime","Main.hx",27);
	HX_STACK_ARG(func,"func");
	HX_STACK_LINE(28)
	::Date start_time = ::Date_obj::now();		HX_STACK_VAR(start_time,"start_time");
	HX_STACK_LINE(29)
	func().Cast< Void >();
	HX_STACK_LINE(30)
	::Date end_time = ::Date_obj::now();		HX_STACK_VAR(end_time,"end_time");
	HX_STACK_LINE(31)
	return (end_time->getTime() - start_time->getTime());
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Main_obj,measureExecTime,return )

Void Main_obj::showExecTime( ::String explain,Dynamic func){
{
		HX_STACK_PUSH("Main::showExecTime","Main.hx",34);
		HX_STACK_ARG(explain,"explain");
		HX_STACK_ARG(func,"func");
		HX_STACK_LINE(35)
		Float time = ::Main_obj::measureExecTime(func);		HX_STACK_VAR(time,"time");
		HX_STACK_LINE(36)
		::haxe::Log_obj::trace((((explain + HX_CSTRING(" : ")) + time) + HX_CSTRING("ms")),hx::SourceInfo(HX_CSTRING("Main.hx"),36,HX_CSTRING("Main"),HX_CSTRING("showExecTime")));
	}
return null();
}


STATIC_HX_DEFINE_DYNAMIC_FUNC2(Main_obj,showExecTime,(void))

Array< int > Main_obj::qsort( Array< int > array){
	HX_STACK_PUSH("Main::qsort","Main.hx",39);
	HX_STACK_ARG(array,"array");
	HX_STACK_LINE(40)
	if (((array->length == (int)0))){
		HX_STACK_LINE(41)
		return Array_obj< int >::__new();
	}
	HX_STACK_LINE(42)
	Dynamic pivot = array->shift();		HX_STACK_VAR(pivot,"pivot");
	HX_STACK_LINE(43)
	Array< int > b = Array_obj< int >::__new();		HX_STACK_VAR(b,"b");
	Array< int > a = Array_obj< int >::__new();		HX_STACK_VAR(a,"a");
	HX_STACK_LINE(44)
	{
		HX_STACK_LINE(44)
		int _g = (int)0;		HX_STACK_VAR(_g,"_g");
		HX_STACK_LINE(44)
		while(((_g < array->length))){
			HX_STACK_LINE(44)
			int i = array->__get(_g);		HX_STACK_VAR(i,"i");
			HX_STACK_LINE(44)
			++(_g);
			HX_STACK_LINE(45)
			if (((i < pivot))){
				HX_STACK_LINE(46)
				b->push(i);
			}
			else{
				HX_STACK_LINE(48)
				a->push(i);
			}
		}
	}
	HX_STACK_LINE(49)
	return ::Main_obj::qsort(b)->concat(Array_obj< int >::__new().Add(pivot))->concat(::Main_obj::qsort(a));
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Main_obj,qsort,return )

int Main_obj::sum( Array< int > array){
	HX_STACK_PUSH("Main::sum","Main.hx",52);
	HX_STACK_ARG(array,"array");

	HX_BEGIN_LOCAL_FUNC_S0(hx::LocalFunc,_Function_1_1)
	int run(int a,int b){
		HX_STACK_PUSH("*::_Function_1_1","Main.hx",53);
		HX_STACK_ARG(a,"a");
		HX_STACK_ARG(b,"b");
		{
			HX_STACK_LINE(53)
			return (a + b);
		}
		return null();
	}
	HX_END_LOCAL_FUNC2(return)

	HX_STACK_LINE(52)
	return ::Lambda_obj::fold(array, Dynamic(new _Function_1_1()),(int)0);
}


STATIC_HX_DEFINE_DYNAMIC_FUNC1(Main_obj,sum,return )


Main_obj::Main_obj()
{
}

void Main_obj::__Mark(HX_MARK_PARAMS)
{
	HX_MARK_BEGIN_CLASS(Main);
	HX_MARK_END_CLASS();
}

void Main_obj::__Visit(HX_VISIT_PARAMS)
{
}

Dynamic Main_obj::__Field(const ::String &inName,bool inCallProp)
{
	switch(inName.length) {
	case 3:
		if (HX_FIELD_EQ(inName,"sum") ) { return sum_dyn(); }
		break;
	case 4:
		if (HX_FIELD_EQ(inName,"main") ) { return main_dyn(); }
		break;
	case 5:
		if (HX_FIELD_EQ(inName,"qsort") ) { return qsort_dyn(); }
		break;
	case 12:
		if (HX_FIELD_EQ(inName,"showExecTime") ) { return showExecTime_dyn(); }
		break;
	case 15:
		if (HX_FIELD_EQ(inName,"measureExecTime") ) { return measureExecTime_dyn(); }
	}
	return super::__Field(inName,inCallProp);
}

Dynamic Main_obj::__SetField(const ::String &inName,const Dynamic &inValue,bool inCallProp)
{
	return super::__SetField(inName,inValue,inCallProp);
}

void Main_obj::__GetFields(Array< ::String> &outFields)
{
	super::__GetFields(outFields);
};

static ::String sStaticFields[] = {
	HX_CSTRING("main"),
	HX_CSTRING("measureExecTime"),
	HX_CSTRING("showExecTime"),
	HX_CSTRING("qsort"),
	HX_CSTRING("sum"),
	String(null()) };

static ::String sMemberFields[] = {
	String(null()) };

static void sMarkStatics(HX_MARK_PARAMS) {
	HX_MARK_MEMBER_NAME(Main_obj::__mClass,"__mClass");
};

static void sVisitStatics(HX_VISIT_PARAMS) {
	HX_VISIT_MEMBER_NAME(Main_obj::__mClass,"__mClass");
};

Class Main_obj::__mClass;

void Main_obj::__register()
{
	Static(__mClass) = hx::RegisterClass(HX_CSTRING("Main"), hx::TCanCast< Main_obj> ,sStaticFields,sMemberFields,
	&__CreateEmpty, &__Create,
	&super::__SGetClass(), 0, sMarkStatics, sVisitStatics);
}

void Main_obj::__boot()
{
}

