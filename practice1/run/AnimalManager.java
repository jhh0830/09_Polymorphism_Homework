package practice1.run;

import practice1.model.vo.Animal;
import practice1.model.vo.Cat;
import practice1.model.vo.Dog;

public class AnimalManager{

	public static void main(String[] args) {
		
		Animal arr[] = new Animal[5];
		
		arr[0] = new Dog("���","���",65);
		arr[1] = new Cat("�ɳ�","�ɳ�","����","����");
		arr[2] = new Dog("�Ƶ�","�ᵹ",45);
		arr[3] = new Cat("�ɹ�","����","����","����");
		arr[4] = new Dog("�굹","�ѵ�",15);
		
		for(int i = 0; i < arr.length; i ++) {
			arr[i].speak();
			
		}
		
	}
	

}
