/*
 * Calzone.java 2021. 06. 14
 */
package item2.hierarchy;

import static item2.hierarchy.Pizza.Topping.*;
/**
 * @author younan.nam
 */
public class Calzone extends Pizza {
	private final boolean sauceInside;

	public static class Builder extends Pizza.Builder<Builder> {
		private boolean sauceInside = false; // 기본값

		public Builder sauceInside() {
			sauceInside = true;
			return this;
		}

		@Override public Calzone build() {
			return new Calzone(this);
		}

		@Override protected Builder self() { return this; }
	}

	private Calzone(Builder builder) {
		super(builder);
		sauceInside = builder.sauceInside;
	}

	public static void main(String[] args) {
		Calzone calzone = new Calzone.Builder()
			.addTopping(SAUSAGE).sauceInside().build();
	}
}