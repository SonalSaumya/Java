package day2;

public class DemoArray {
	public static void main (String[] args) {
		int arr[]= {12,13,14,15,16};
		for(int i : arr)
		{
			if(i%2==0)
				System.out.println("Number is even");
			else
				System.out.println("Number is odd");
		}
		
		Date[] dd= new Date[3];
		dd[0]= new Date();
		dd[0].setDate(12,"Aug",2000);
		dd[1]=new Date();
		dd[1].setDate(10,"Aug",2000);
		dd[2]= new Date();
		dd[2].setDate(11,"Aug",2000);
		for(int i=0; i<dd.length;i++)
			
		{
			dd[i].displayDate();
		}
		for(Date d: dd)
		{
	d.displayDate();
   }

}
}