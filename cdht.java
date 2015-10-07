import java.util.Timer;
import java.util.TimerTask;

public class cdht {
	int id;
	int first;
	int second;

	cdht(int id, int first, int second) {
		this.id = id;
		this.first = first;
		this.second = second;
		int delay = 500; // milliseconds
		TimerTask firstTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("My first successor is " + getFirst());
			}
		};
		TimerTask secondTask = new TimerTask() {
			@Override
			public void run() {
				System.out.println("My second successor is " + getSecond());
			}
		};
		Timer firstTimer = new Timer();
		firstTimer.schedule(firstTask, 0, 500);
		Timer secondTimer = new Timer();
		secondTimer.schedule(secondTask, 0, 500);
	}

	public static void main(String[] args) {
		int id = Integer.parseInt(args[0]);
		int first = Integer.parseInt(args[1]);
		int second = Integer.parseInt(args[2]);
		cdht node = new cdht(id, first, second);
	}
	
	public int getId() {
		return this.id;
	}
	public int getFirst() {
		return this.first;
	}
	public int getSecond() {
		return this.second;
	}

}
