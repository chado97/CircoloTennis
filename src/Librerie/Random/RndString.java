package Librerie.Random;

import java.util.Random;

/**
 * Creato da Vlady il 14/04/2016.
 * in origine parte del progetto:
 * CircoloTennis
 */
public class RndString {
private static final char[] symbols;
private static final Random random = new Random();
private static char[] buf;

static {
	StringBuilder tmp = new StringBuilder();
	for (char ch = '0'; ch <= '9'; ++ch)
		tmp.append(ch);
	for (char ch = 'a'; ch <= 'z'; ++ch)
		tmp.append(ch);
	symbols = tmp.toString().toCharArray();
}

public RndString(int length) {
	if (length < 1)
		throw new IllegalArgumentException("length < 1: " + length);
	buf = new char[length];
}

public static String nextString() {
	for (int idx = 0; idx < buf.length; ++idx)
		buf[idx] = symbols[random.nextInt(symbols.length)];
	return new String(buf);
}
}
