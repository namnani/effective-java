/*
 * Elvis.java 2021. 06. 14
 */
package item3.field;

/**
 * @author younan.nam
 */
public class Elvis {
	public static final Elvis INSTANCE = new Elvis();

	private Elvis() {

	}

	public void leaveTheBuilding() {
		System.out.println("Whoa baby, I'm outta here!");
	}

	// 이 메소드는 보통 클래스 바깥(다르 클래스)에 작성해야 한다!
	public static void main(String[] args) {
		Elvis elvis = Elvis.INSTANCE;
		elvis.leaveTheBuilding();
	}
}