package fr.loyat.katadeux;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Stopwatch;

public class SuperTest {

	private static final int SIZE = 2000000;
	Stopwatch sw = new Stopwatch();
	protected int[] grosseTable;

	public SuperTest() {
		super();
	}

	@BeforeMethod
	public void debut() {
		grosseTable = new int[SIZE];
		for (int i=0;i<SIZE;i++){
			grosseTable[i]=i;
		}
		sw.start();
	}

	@AfterMethod
	public void fin() {
		System.out.println(sw.stop());
	}


}