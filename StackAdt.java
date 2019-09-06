
public interface StackAdt<T> {

	public void push(T data);

	public T pop();

	public T peek();

	public boolean is_empty();

	public int size();

	public String toString();

}
