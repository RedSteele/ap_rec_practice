/**************************************************************
 * 
 * 	palindrome
 * 
 * 		Figures out if a string is a palindrome
 * 
 **************************************************************/

class palindrome {
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Please type a string after palindrome the next time you run this program.");
			System.exit(0);
		}

		String n;

		System.out.println("The word " + n + " is "+ iterativePalindrome(n));

	}
	public static boolean iterativePalindrome(String n){
		char word[] = n.toCharArray();
		for(int i =0; i<word.length; i++){
				while(word[i] == word[]){
					return true;
				}
				
			}
			return false;	
		}
	}
}