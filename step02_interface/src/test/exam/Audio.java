package test.exam;

public class Audio extends Elec implements ElecFunction{
	private int volumn;
	
	Audio() {
		this(0);
	}
	Audio(int volumn) {
		this(null, 0, volumn);
	}
	Audio(String code, int cost, int volumn) {
		super(code, cost);
		this.volumn = volumn;
	}
	
	@Override
	public void start() {
		System.out.println(this.getCode() + "�� Audio�� " + volumn + "���� ��´�.");
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
