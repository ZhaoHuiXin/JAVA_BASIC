class TestContinue{
	public static void main(String[] args){
		for(int i=0; i<10; i++){
			System.out.print(i);
			for(int j=0; j<i; j++){
				System.out.print(j);
				if(j==5){
					System.out.println();
					continue;
				}
			} 
		}
	}
}