public class PatternNine{
	public static void main(String[]args){
		for(int i=1;i<=6;i++){
			for(int j=1;j<=11;j++){
				int k=i;
				if(j>=7-i && j<=5+i){
					System.out.print(k+" ");
					if(j<6){
						k--;
					}else{
						k++;
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
}