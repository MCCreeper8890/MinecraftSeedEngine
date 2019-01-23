package mccreeper8890.mcSeedEngine.util;

public class StringUtil {
	
	public static boolean duplicateEntryInArrays(String[] arr0, String[] arr1) {
		boolean ret = false;
		for(int i = 0; i < arr0.length; i++) {
			for(int j = 0; j < arr1.length; j++) {
				if (arr0[i].equals(arr1[j])) {
					ret = true;
				}
			}
		}
		return ret;
	}

}
