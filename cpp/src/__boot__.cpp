#include <hxcpp.h>

#include <haxe/Log.h>
#include <StringBuf.h>
#include <Std.h>
#include <Main.h>
#include <List.h>
#include <Lambda.h>
#include <IntIter.h>
#include <Date.h>

void __boot_all()
{
hx::RegisterResources( hx::GetResources() );
::haxe::Log_obj::__register();
::StringBuf_obj::__register();
::Std_obj::__register();
::Main_obj::__register();
::List_obj::__register();
::Lambda_obj::__register();
::IntIter_obj::__register();
::Date_obj::__register();
::haxe::Log_obj::__boot();
::Date_obj::__boot();
::IntIter_obj::__boot();
::Lambda_obj::__boot();
::List_obj::__boot();
::Main_obj::__boot();
::Std_obj::__boot();
::StringBuf_obj::__boot();
}

