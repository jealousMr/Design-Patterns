package IteratorMode;

public class DinnerIterator implements Iterator{
	MenuItem[] items;
	int pos=0;
	
	public DinnerIterator(MenuItem[] i) {
		items=i;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(pos>=items.length || items[pos]==null)
			return false;
		else
			return true;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		MenuItem m=items[pos];
		pos++;
		return m;
	}

	
}
