package kr.co.softsoldesk.beans;

public class TestBean {

	private int data1;
	private double data2;
	private String data3;
	private String data4;
	private DataBean data5;
	private DataBean data6;
	
	public String getData4() {
		return data4;
	}

	public void setData4(String data4) {
		this.data4 = data4;
	}

	public DataBean getData5() {
		return data5;
	}

	public void setData5(DataBean data5) {
		this.data5 = data5;
	}

	public DataBean getData6() {
		return data6;
	}

	public void setData6(DataBean data6) {
		this.data6 = data6;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}

	public void setData2(double data2) {
		this.data2 = data2;
	}

	public void setData3(String data3) {
		this.data3 = data3;
	}

	public TestBean() {
		System.out.println("TestBean의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = null;
	}
	
	public TestBean(int data1, double data2, String data3) {
		super();
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}
	
	public TestBean(int data1) {
		System.out.println("TestBean의 기본 생성자");
		this.data1 = data1;
		this.data2 = 0.0;
		this.data3 = null;
	}
	public TestBean(double data2) {
		System.out.println("TestBean의 기본 생성자");
		this.data1 = 0;
		this.data2 = data2;
		this.data3 = null;
	}
	public TestBean(String data3) {
		System.out.println("TestBean의 기본 생성자");
		this.data1 = 0;
		this.data2 = 0.0;
		this.data3 = data3;
	}

	public void printData() {
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
	}
	
	public int getData1() {
		return data1;
	}
	public double getData2() {
		return data2;
	}
	public String getData3() {
		return data3;
	}
	
	
}
