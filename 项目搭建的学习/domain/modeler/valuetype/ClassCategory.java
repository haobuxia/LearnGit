package edu.thss.platform.domain.modeler.valuetype;

public enum ClassCategory {

	OperationClass(""),
	ItemClass("ItemClass"),
	ExternalItemClass("ItemClass"),
	RelationClass("Relation"),
	ResourceClass("Resource"),
	ModuleClass(""),
	BizItemClass("BizItem"),
	Root("Root");

	private String root;

	ClassCategory(String root) {
		this.root = root;
	}

	/**
	 * 返回这类对象根类（非Root）的类名
	 * 
	 * @return
	 */
	public String getRootClassName() {
		return root;
	}

	public static ClassCategory nameOf(String name) {
		return ClassCategory.valueOf(name);
	}
}
