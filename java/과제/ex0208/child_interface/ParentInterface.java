package child_interface;

public interface ParentInterface {
	public void method1();
	public default void method2() {}
}
