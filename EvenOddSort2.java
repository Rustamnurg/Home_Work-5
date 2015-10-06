/////улучшенный вариант, теперь сортирует четное и нечетное количество элементов
import java.util.Arrays;
import java.util.Scanner;

class EvenOddSort2{
	public static void main(String[] args){
 	
 		int k, n, n1, n2;
 		double check;
 		check       = 1;
 		n1          = 1;
 		n2          = 2;
 		Scanner sc  = new Scanner(System.in); 


		System.out.print("Введите колличество элементов в массиве: ");
 		n = sc.nextInt();

 		if(n < 0){ //проверяем правельность введенных данных
 			System.out.print("Вы ввели некорректное значение!"); 
 		}
 		else{

 			if(n % 2 != 0){
 				n1 = 2;
 				n2 = 1;
 			}

			int[] array = new int[n];

 			System.out.print("До: ");
 			for(int i = 0; i < n; i++){
 	 			array[i] = (int) Math.round(Math.random() * 100);
 	 			System.out.print(array[i] + " ");
 	 		}

	 		while(check == 1){ //сравниваем числа до тех, пока не получим нужный нам результат
				check = 0;



 				for(int i = 0; i < n - n1; i+=2){ //сравниваем два числа, первое из которых четное
 					if(array[i] > array[i + 1]){
 						k  = array[i];
 						array[i] = array[i + 1];
 						array[i + 1] = k;
 						check = 1;
 					}
 	 			}


 	 			for(int i = 1; i < n - n2; i+=2){ //сравниваем два числа, первое из которых нечетное

 					if(array[i] > array[i + 1]){
 						k  = array[i];
 						array[i] = array[i + 1];
 						array[i + 1] = k;
 						check = 1;
 					}
 				}	
			}


			System.out.print("\nПосле: ");

 	 		for(int i = 0; i < n; i++){
				System.out.print(array[i] + " ");
 	 		}
		}
	}
}
