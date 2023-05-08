package day4;

public class TrafficLightSimulation {
	enum TrafficLight {
		RED, YELLOW, GREEN
	}

	public static void main(String[] args) {
		TrafficLight currentLight = TrafficLight.RED;
		int count = 0;
		while (count < 10) {
			switch (currentLight) {
			case RED:
				System.out.println("Stop! The light is red.");
				currentLight = TrafficLight.YELLOW;
				break;
			case YELLOW:
				System.out.println("Get ready! The light is yellow.");
				currentLight = TrafficLight.GREEN;
				break;
			case GREEN:
				System.out.println("Go! The light is green.");
				currentLight = TrafficLight.RED;
				break;
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
		}
	}
}
