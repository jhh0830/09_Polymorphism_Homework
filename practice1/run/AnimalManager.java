package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager{

	public static void main(String[] args) {
		
		Animal arr[] = new Animal[5];
		
		arr[0] = new Dog("大大","大大",65);
		arr[1] = new Cat("成成","成成","けけ","けけ");
		arr[2] = new Dog("绕倒","冕倒",45);
		arr[3] = new Cat("成苟","苟成","ささ","ささ");
		arr[4] = new Dog("魂倒","茄倒",15);
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i].speak();
			
		}
		
	}
	

}
