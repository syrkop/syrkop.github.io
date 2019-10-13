public class GuessGame{
	Player p1; //Определяем переменные объекта
	Player p2;
	Player p3;

	public void startGame(){ //метод , который создает 3 игрока, загадывает число и ждет когда хотябы один угадает
		p1 = new Player(); //Создаем игрока 1
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0; //Определяем пееменную ответа игрока 1
		int guessp2 = 0;
		int guessp3 = 0;

		boolean p1isRight = false; //Определяем переменную результата попытки угадать игрока 1
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int)(Math.random()*10);
		System.out.println("Я задумала число от 0 до 9...");

		while(true){ //Начинаем бесконечный цикл
			System.out.println("Число которое надо угадать " + targetNumber);

			p1.guess();   // Первый игрок пытается угадать число
			p2.guess();
			p3.guess();

			guessp1 = p1.number; 
			System.out.println("1 игрок думает это " + guessp1);

			guessp2 = p2.number;
			System.out.println("2 игрок думает это " + guessp2);

			guessp3 = p3.number;
			System.out.println("3 игрок думает это " + guessp3);

			if(guessp1 == targetNumber){ //Проверяем угадал ли 1 игрок
				p1isRight = true;
			}

			if(guessp2 == targetNumber){
				p2isRight = true;
			}

			if(guessp3 == targetNumber){
				p3isRight = true;
			}

			if(p1isRight||p2isRight||p3isRight){ //Провераям (условие "или")
				System.out.println("У нас есть победитель!");
				System.out.println("1 игрок угадал? " + p1isRight);
				System.out.println("2 игрок угадал? " + p2isRight);
				System.out.println("3 игрок угадал? " + p3isRight);
				System.out.println("БИНГО!!!");
				break; //Прерываем "вечный" цикл, конец игре
			} else { //Неудача 
				System.out.println("Игроки пробую еще раз.");
			}
		} //Конец цикла while


	} //Конец метода StartGame
} // Конец класса GuessGame
