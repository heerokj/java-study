package day06hw;

public class Q09 {

	public static void main(String[] args) {

		Q09Phone p1 = new Q09Phone("°¶·°½ÃS22", "»ï¼º", 1000000, "010-1111-2222");
		Q09Phone p2 = new Q09Phone("È«¹Ì³ëÆ®", "»þ¿À¹Ì", "010-2222-3333");
		Q09Phone p3 = new Q09Phone("¾ÆÀÌÆù", "¾ÖÇÃ", "Áß±¹", "010-3333-4444");

		p1.status();
		p2.status();
		p3.status();
	}
}
