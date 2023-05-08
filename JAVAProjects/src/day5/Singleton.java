package day5;


class Singleton {
	private volatile static Singleton instance;

	private Singleton() {}

	public static Singleton getInstance1()
	{
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}


	public static synchronized Singleton getInstance2()
	{
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	public static Singleton getInstance3()
	{
		if (instance == null) {
			synchronized (Singleton.class)
			{
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
}
