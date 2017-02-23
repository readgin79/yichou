package SelectSort;

public class SelectSort_Main {
	
	static void selecSort(char[] data){
		int i , j , pos;
		int count = data.length;
		char temp;
		for(i = 0; i < count-1 ; i++){
			pos = i;
			temp = data[pos];
			for(j = i + 1 ; j < count ; j++){
				if(data[j] < temp){
					pos = j;
					temp = data[j];
				}
			}
			data[pos] = data[i];
			data[i] = temp;
			System.out.println(i+1 + ": "+ new String(data));
		}
	}

	public static void main(String[] args) {
		char[] charArray = {'a','p','p','l','e'};
		selecSort(charArray);
	}

}
