package day2;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {-5,-10,-20,-15,-67,-78,-12,-58,-102,-58};
		int max = -1000;
		for(int i=0; i< values.length;)
		{
			if(values[i]>max)
				max = values[i];
			else
				i++;
		}
		System.out.println(max);
	}

}
