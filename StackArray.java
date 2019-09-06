

public class StackArray<T> implements StackAdt<T>{
	
	//Private Variables
	private T[] stack;
	private int top;
	private final static int MAX_SIZE = 100;

	@SuppressWarnings("unchecked")
	public StackArray(){
		this.stack = (T[]) new Object[MAX_SIZE];
		this.top = 0;
	}

	@Override
	public void push(T data){
		if (this.size() == stack.length){
			expandLimit();
		}
		stack[top] = data;
		top++;
	}

	@SuppressWarnings("unchecked") 
	private void expandLimit(){
		T[] larger = (T[]) (new Object[this.stack.length*2]);
		for (int i=0; i < this.stack.length; i++){
			larger[i] = this.stack[i];
		}
		this.stack = larger;
	}

	@Override
	public T pop(){
		if (is_empty()){
			throw new RuntimeException("Impossible to pop an element when the stack is empty");
		}
		top--;
		T result = this.stack[this.top];
		this.stack[this.top] = null;
		return result;
	}

	@Override
	public T peek(){
		if (is_empty()){
			throw new RuntimeException("Impossible to peek an element when the stack is empty");
		}
		return this.stack[this.top-1];
	}

	@Override
	public boolean is_empty(){
		return this.top == 0;
	}
	
	@Override
	public int size(){
		return this.top;
	}

	@Override
	public String toString(){
		String elements = "[";

		for (int i = 0; i < this.top; i++){
			if (i==this.top-1){
				elements += this.stack[i] + ",";
			}
			if (i<this.top-1){
				elements += this.stack[i] + ",";
			}
		}
		elements += "]";
		return elements;
	}


}






























