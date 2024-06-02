//Nathan Borchelt
//A set of character blocks for use across all files
class AsciiChars{
	public static void clear(){
		System.out.print("\033[H\033[2J");
	}
	public static String clear = "\033[H\033[2J";
	public static class Particles{
		//░▒▓█
		public static char[] boxes = {9617, 9618, 9619, 9608};
		
	}
}
