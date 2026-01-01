class Solution {
		    public int[] plusOne(int[] digits) {
		        long num=0;
		      //  [9,8,7,6,5,4,3,2,1,0]
		        for (int i=0;i<digits.length;i++){
		               if(digits[i]!=0) {
		                num=digits[i]+num*10;}
		        	 	else {
		        	 		num=num*10;
		        	 	}

		        }
		        num=num+1;
		        String n = String.valueOf(num); 
		        int [] arr= new int[n.length()];
		        for(int i=arr.length-1;i>=0;i--){
		            long k =num%10;
                    arr[i] = (int)k;
		            num=num/10;
		        }
		        return arr;
		    }
		}
		