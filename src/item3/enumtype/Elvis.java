/*
 * Elvis.java 2021. 06. 14
 */
package item3.enumtype;

/**
 * @author younan.nam
 */
public enum Elvis {
	INSTANCE;

	public void leaveTheBuilding() {
		System.out.println("기다려 자기야, 지금 나갈께!");
	}

	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}