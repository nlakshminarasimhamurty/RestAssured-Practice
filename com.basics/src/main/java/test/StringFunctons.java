package test;

public class StringFunctons {
	
	public static void main(String[] args) {

		String s = "HEllo world";
		
		
		String[] split = s.split(" ");
		 String split1="";
		for(String split2:split) {
			 split1=split1+split2;
		}
		System.out.println(split1);
		
		char[] ch = split1.toCharArray();
		
		for (int i = 0; i <ch.length; i++) {
			
				if (i % 2 == 0 ) {
					System.out.println("\t" + s.toLowerCase().charAt(i));

				}
				else {
					System.out.println(ch[i]);
				}
			

			
		}

	}

}
