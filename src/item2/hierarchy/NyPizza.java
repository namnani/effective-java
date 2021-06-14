/*
 * NyPizza.java 2021. 06. 14
 */
package item2.hierarchy;

import java.util.Objects;

/**
 * @author younan.nam
 */
public class NyPizza extends Pizza {
	public enum Size { SMALL, MEDIUM, LARGE }
	private final Size size;

	public static class Builder extends Pizza.Builder<Builder> {
		private final Size size;

		public Builder(Size size) {
			this.size = Objects.requireNonNull(size);
		}

		@Override public NyPizza build() {
			return new NyPizza(this);
		}

		@Override protected Builder self() {
			return this;
		}
	}

	private NyPizza(Builder builder) {
		super(builder);
		size = builder.size;
	}

	public static void main(String[] args) {
		NyPizza nyPizza = new NyPizza.Builder(Size.SMALL)
			.addTopping(Topping.SAUSAGE).addTopping(Topping.ONION).build();
	}
}