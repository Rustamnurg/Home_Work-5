import java.util.Arrays;
import java.util.Scanner;

class EvenOddSort{
	public static void main(String[] args){
 	
 		int k, j;
 		double check;
 		check       = 1;
 		Scanner sc  = new Scanner(System.in); 


		System.out.print("Введите колличество элементов в массиве(четное значение): ");
 		j = sc.nextInt();

 		if(j % 2 != 0 || j < 0){ //проверяем правельность введенных данных
 			System.out.print("Вы ввели некорректные значения!"); 
 		}
 		else{

			int[] array = new int[j];

 			System.out.print("До: ");
 			for(int i = 0; i < j; i++){
 	 			array[i] = (int) Math.round(Math.random() * 100);
 	 			System.out.print(array[i] + " ");
 	 		}

	 		while(check == 1){ //сравниваем числа до тех, пока не получим нужный нам результат
				check = 0;



 				for(int i = 0; i < j - 1; i+=2){ //сравниваем два числа, первое из которых четное
 					if(array[i] > array[i + 1]){
 						k  = array[i];
 						array[i] = array[i + 1];
 						array[i + 1] = k;
 						check = 1;
 					}
 	 			}


 	 			for(int i = 1; i < j - 2; i+=2){ //сравниваем два числа, первое из которых нечетное

 					if(array[i] > array[i + 1]){
 						k  = array[i];
 						array[i] = array[i + 1];
 						array[i + 1] = k;
 						check = 1;
 					}
 				}	
			}


			System.out.print("\nПосле: ");

 	 		for(int i = 0; i < j; i++){
				System.out.print(array[i] + " ");
 	 		}
		}
	}
}
