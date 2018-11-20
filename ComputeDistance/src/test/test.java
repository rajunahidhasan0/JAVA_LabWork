package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Sound;

class test {
	@Test
	void test() {
		Sound obj=new Sound();
		assertEquals(obj.distanceCalculate(7.2, 1100), 7920.0);
	}

}
