package com.tns.gen.java.lang;

public class Object_ftns_modules_tns_core_modules_ui_text_base_text_base_l17_c32__TextTransformationImpl extends java.lang.Object implements com.tns.NativeScriptHashCodeProvider, android.text.method.TransformationMethod {
	public Object_ftns_modules_tns_core_modules_ui_text_base_text_base_l17_c32__TextTransformationImpl(){
		super();
		com.tns.Runtime.initInstance(this);
	}

	public java.lang.CharSequence getTransformation(java.lang.CharSequence param_0, android.view.View param_1)  {
		java.lang.Object[] args = new java.lang.Object[2];
		args[0] = param_0;
		args[1] = param_1;
		return (java.lang.CharSequence)com.tns.Runtime.callJSMethod(this, "getTransformation", java.lang.CharSequence.class, args);
	}

	public void onFocusChanged(android.view.View param_0, java.lang.CharSequence param_1, boolean param_2, int param_3, android.graphics.Rect param_4)  {
		java.lang.Object[] args = new java.lang.Object[5];
		args[0] = param_0;
		args[1] = param_1;
		args[2] = param_2;
		args[3] = param_3;
		args[4] = param_4;
		com.tns.Runtime.callJSMethod(this, "onFocusChanged", void.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
