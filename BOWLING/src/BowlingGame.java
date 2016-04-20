
public class BowlingGame {
	//Create private variables for ball and frame
	private int ball;
	private int frame;
	
	//Create array of Frames
	Frame frames[] = new Frame[10];
	

	public BowlingGame()
	{
		//initialize ball, frame 
		ball = 1;
		frame = 1;
		//initialize the array of frames
		for (int i = 0; i < 9; i++) //for the first 8
		{
			frames[i] = new Frame(2); // create frames with 2 balls
		}
		//create the 10th frame with 3 balls
		frames[9] = new Frame(3);
	}


	public int getCurrentFrame()
	{
		
		return frame;
	}

	
	public int getCurrentBall()
	{
		return ball;
	}


	public void scoreBall(int pins)
	{
		//put the score in the current frame/ball array position
		frames[frame-1].balls[ball-1] = pins;
		//if ball is 1 
			//if this frame isn't a strike
				//add 1 to ball
			//else
				//add 1 to frame
		//else if ball is 3
			//add 1 to frame
			//ball is 1
		//else (ball is 2
			//if frame is less than 10
				//ball is 1 
				//add one to frame
			//else (ball is at least 10) 
	
		
	
		
	}

	
	public int getBallScore(int frame, int ball)
	{
		
		return getBallScore(frame,ball);
	}

	public boolean isStrike(int frame)
	{
		if(ball == 1 &&  frames[frame-1].balls[ball-1] == 10){
			return true;
		}
		
		return false;
	}

	
	public boolean isSpare(int frame)
	{
		if(ball == 2 &&  frames[frame-1].balls[ball-1] == 10){
			return true;
		}
		
		return false;
	}


class Frame
{
	public int[] balls;
	
	public Frame(int size)
	{
		balls = new int[size];
	}
}
}

}
