package core;

public interface IStack {
	int getSize() ;
	boolean isEmpty() ;
	void push(Object element) throws Exception ; 
	Object top(); 
	

}
