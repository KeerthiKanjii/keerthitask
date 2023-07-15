
public class Array {

	public static void main(String[] args) {  
        
        String [] arr = new String [] {"a","b","c,","d"};  
        System.out.println();  
        System.out.println("Array in reverse order: ");
        for (int i = arr.length-1; i >= 0; i--) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
} 

