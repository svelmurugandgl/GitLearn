public class ArrayLearn {

	public void secondLarget()
	{
		int[] arr={3,2,11,4,6,7};
		int tmp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
			System.out.println(arr[i]);
		}
			
		System.out.println("SecondBigNumber is= "+arr[arr.length-2]);
		
	}
	public void duplicateArray()
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(arr[i]);
			}
		}
		
	}
	
	public static void main(String[] args) 
	
	{
		ArrayLearn arrObj=new ArrayLearn();
		arrObj.secondLarget();
		arrObj.duplicateArray();

	}

}
