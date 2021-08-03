package maven_pluginpractice;

import org.apache.log4j.Logger;

public class test {
    final static Logger logger = Logger.getLogger(test.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("this is the way to create executable jar");
     logger.warn("this is warining messages");
     
	}
	public int addition(int x,int y){
		int z;
		z=x+y;
		return z;
	}

}
