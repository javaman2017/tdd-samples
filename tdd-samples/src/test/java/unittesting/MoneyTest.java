package unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

import unittesting.Money;

public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Money money = new Money(10,"USD");
		
		assertEquals(10,money.getAmount());
		assertEquals("USD",money.getCurrency());
	}

}
