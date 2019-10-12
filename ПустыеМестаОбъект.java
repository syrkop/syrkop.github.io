/*
¬озми фрагменты из кучи и заполни пустые места в коде.
¬ы можте исрользовать фрагмент несколько раз, но не все пригод€тс€

¬аша цель: создать класс, который выведет в консоль

% java ѕустыећестаќбъект
привееееет...
привееееет...
привееееет...
привееееет...
10

*/

public class ѕустыећестаќбъект {

	public static void main(String[] args) {
		Echo e1 = new Echo();
		______________________
		int x = 0;
		while (_____) {
			e1.hello();
			__________________
			if (_______) {
				e1.count = e2.count + 1;
			}
			if (_______) {
				e2.count = e2.count + e1.count;
			}
			x = x + 1;
		}
		System.out.println(e2.count);
	}

}

class _________{
	int _______ = 0;
	void __________{
		System.out.println("привееееет...");
	}
}


/*	куча 1						куча 2			куча 3		куча 4			куча 5					куча 6
e1 = e1 + 1;					 x				x < 4		Echo			e2 = e1;				x == 3
e1 = count + 1;					 y				x < 5		Tester			Echo e2;				x == 4
e1.count = count + 1;			 e2				x > 0		echo()			Echo e2 = e1;
e1.count = e1.count + 1;		 count			x > 1		count()			Echo e2 = new Echo();
															hello()
*/