package lesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniTestCase {

	@Test
	public void testMerge() {

		MergeStrings ms = new MergeStrings();
		String Ooutput = ms.mergeStrings("ace", "bdf");
		String Eoutput = "abcdef";
		assertEquals(Ooutput, Eoutput);
	}
	
	@Test
	public void testPalindrom() {
		
		RecursivePalindrome rp = new RecursivePalindrome();
		boolean Ooutput = rp.isPalindrome("mamam");
		boolean Eoutput = true;
		assertEquals(Ooutput, Eoutput);
		
	}

}

/*
 * Output: Runs: 2/2 Errors: 0 Failures: 0
 * 
 */
