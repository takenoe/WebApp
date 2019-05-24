package S3;

import java.io.Serializable;

public class CalcBeans implements Serializable{


	public int bWeight(String height,String weight){
		double hight1 = Double.parseDouble(height);
		int hight2 = (int)((hight1 * hight1)*20);
		return hight2;
	}

}
