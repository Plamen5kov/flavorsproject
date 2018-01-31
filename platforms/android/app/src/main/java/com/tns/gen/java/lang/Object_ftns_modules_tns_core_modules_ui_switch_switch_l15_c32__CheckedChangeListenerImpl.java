package com.tns.gen.java.lang;

public class Object_ftns_modules_tns_core_modules_ui_switch_switch_l15_c32__CheckedChangeListenerImpl extends java.lang.Object implements com.tns.NativeScriptHashCodeProvider, android.widget.CompoundButton.OnCheckedChangeListener {
	public Object_ftns_modules_tns_core_modules_ui_switch_switch_l15_c32__CheckedChangeListenerImpl(){
		super();
		com.tns.Runtime.initInstance(this);
	}

	public void onCheckedChanged(android.widget.CompoundButton param_0, boolean param_1)  {
		java.lang.Object[] args = new java.lang.Object[2];
		args[0] = param_0;
		args[1] = param_1;
		com.tns.Runtime.callJSMethod(this, "onCheckedChanged", void.class, args);
	}

	public boolean equals__super(java.lang.Object other) {
		return super.equals(other);
	}

	public int hashCode__super() {
		return super.hashCode();
	}

}
