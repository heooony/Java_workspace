package test.exam;

public class Tv extends Elec implements ElecFunction{
	private int channel;
	
	Tv() {}
	Tv(int channel) {
		this.channel = channel;
	}
	Tv(String code, int cost, int channel) {
		super(code, cost);
		this.channel = channel;
	}
	
	@Override
	public void start() {
		System.out.println(getCode() + "��ǰ TV�� " + channel + "�� ����.");
		
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return null;
	}
	
}
