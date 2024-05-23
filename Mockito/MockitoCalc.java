package app01;

public class MockitoCalc  extends MockitoSubCalc {

	private MockitoSubCalc subCalc;

	public MockitoCalc(){
		this.subCalc = new MockitoSubCalc();
	}

	public int add(){

        int x = this.subCalc.getValA();
        int y = this.subCalc.getValB();
        int z = this.subCalc.getValC(x, y);

        return x + y + z;
	}
	

}
