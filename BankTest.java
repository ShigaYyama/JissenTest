package jissen11of2;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	public void Instance() {
		Bank b = new Bank();
	}
	
	@Test
	public void NameLength() {
		Bank b = new Bank();
		b.setName("よこやま");
	}
	
	@Test
	public void NameLongLength() {
		Bank b = new Bank();
		try {
			b.setName(null);
		}catch(NullPointerException e){
			e.fillInStackTrace();
		}
	}

}
