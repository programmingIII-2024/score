class Score 
{
	protected int jap;	// 国語	
	protected int math;	// 数学	
	protected int eng;	// 英語	

	protected double average;	// 3科目平均
	protected int sum;		// 3科目合計

	public int setJap(int jap)
	{
		if(jap <0 || jap>100)
		{
			System.out.println("点数は0点から100点で入力して下さい");
			return -1;
		}

		this.jap = jap;
		calcSum();
		calcAve();

		return 0;
	}

	public int setEng(int eng)
	{
		if(eng <0 || eng>100)
		{
			System.out.println("点数は0点から100点で入力して下さい");
			return -1;
		}

		this.eng = eng;
		calcSum();
		calcAve();

		return 0;
	}

	public int setMath(int math)
	{
		if(math <0 || math>100)
		{
			System.out.println("点数は0点から100点で入力して下さい");
			return -1;
		}

		this.math = math;
		calcSum();
		calcAve();

		return 0;
	}

	protected void calcSum()
	{
		this.sum = this.math + this.eng +this.jap;
	}

	protected void calcAve()
	{
		this.average = this.sum/3.0;
	}

	public void showScore()
	{
		System.out.println("国語:"+ this.jap +"\t数学:" + this.math + "\t英語" + this.eng);
		System.out.println("合計:" + this.sum + "\t 平均:" + this.average);
	}
		
}

public class score
{
	public static void main(String[] args)
	{
		Score student;	
		student =new Score();	

		int ret;

		student.setJap(80);
		student.setEng(70);
		student.setMath(60);

		student.showScore();

	}
}
