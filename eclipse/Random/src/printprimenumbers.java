public class printprimenumbers{
	public static void main(String [] args){
		//int [] numList = {2, 3, 5, 7, 11, 13, 17, 19, 23};
		//System.out.println(numList[0]);
		//System.out.println(numList[2]);
		//System.out.println(numList[4]);
		primus();
	}
	public static void primus(){
		int MAX = 5;
	    int first = 0;
	    int second = 1;
	    int third = second;
	    System.out.println(second);
	    while(first + second < MAX){
	        third = first + second;
	        first = second;
	        second = third;
	        if(third % third != 0) {
		        System.out.println(third);
	        }
        }
	
		
	}
}
	


