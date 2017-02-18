package edu.kis.vh.stacks;

public interface IStacks {
	
	/* Punkt 10 instrukcji był pomocny w zmianie zwracanej wartości przez
	 * metody peek (a tak naprawde 'top', ponieważ zmieniliśmy jej nazwę)
	 * oraz pop, ponieważ wystarczyło zmienić wartość stałej EMPTY z -1 na 0
	 */
	
	/* Skrót ctrl+t od razu otwiera nam listę klas w których metoda jest zaimplementowana / zadeklarowana.
	 * Przytrzymując ctrl i najeżdżając na metodę myszką, dostajemy do wyboru 2 opcje:
	 * - Open Declaration
	 * - Open Implementation
	 * Klikając "Open Implementation" efekt jest taki sam jak w przypadku skrótu ctrl+t.
	 *  
	 */

	static final int STACK_EMPTY = -1;
	/**
	 * @param i
	 * @return void
	 * Pushes argument i on the stack
	 */
	void push(int i);

	/**
	 * @return true if stack is empty, otherwise - returns false
	 */
	boolean isEmpty();

	/**
	 * @return true if stack is full, otherwise - returns false
	 */
	boolean isFull();

	/**
	 * @return an element from top of the stack
	 */
	int top();

	/**
	 * @return integer
	 * Removes top element from the stack
	 */
	int pop();

}