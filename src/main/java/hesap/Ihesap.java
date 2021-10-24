package hesap;

import javax.jws.WebService;


@WebService
public interface Ihesap {

	public double toplama(double a ,double b); 
	
	public double cikartma(double a ,double b); 
	
	public double bolme(double a ,double b); 
	
	public double carpma(double a ,double b); 
	
	
}
