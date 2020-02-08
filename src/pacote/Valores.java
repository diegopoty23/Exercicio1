package pacote;

public class Valores implements ValoresITF{
	
	int[] array = new int[9];

	public boolean ins(int v) {
		if(v > 0) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0 && v > 0) {
					array[i] = v;
					return true;
				}
			}
		}
		return false;
	}

	public int del(int v) {
		int aux = 0;
		boolean flag = false;

		if (v > 0) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] != 0)
					flag = true;

				if (flag == true) {
					if (i >= 0 && i < 10) {
						aux = array[v];
						array[v] = 0;
						return aux;
					}

				}
			}
		}
		return -1;
	}

	public int size() {
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				num += 1;
		}

		if (num > 0)
			return num;
		else
			return -1;
	}
	
	
}
