package com.tns.gen.java.lang;

public class Object_ftns_modules_tns_core_modules_ui_core_view_view_l25_c32__TouchListenerImpl extends java.lang.Object implements com.tns.NativeScriptHashCodeProvider, android.view.View.OnTouchListener {
	public Object_ftns_modules_tns_core_modules_ui_core_view_view_l25_c32__TouchListenerImpl(){
		super();
		com.tns.Runtime.initInstance(this);
	}

	public boolean onTouch(android.view.View param_0, android.view.MotionEvent param_1)  {
		java.lang.Object[] args = new java.lang.Object[2];
		args[0] = param_0;
		args[1] = param_1;
		return (boolean)com.tns.Runtime.callJSMethod(this, "onTouch", boolean.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
