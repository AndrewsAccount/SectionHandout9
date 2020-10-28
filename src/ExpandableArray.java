
public class ExpandableArray<T> {
	T[] oArr;	
	
	public ExpandableArray(T[] oArr) {	
		this.oArr = oArr;
	}
	// if original arr not long enough, create new arr that is 1 element larger
	public void set(int index, Object value) {
		if (oArr.length-1 < index) {
			Object[] temp = new Object[index +1];
			for (int i = 0; i < oArr.length; i++) {
				temp[i] = oArr[i];
				oArr = (T[]) temp;
			}
			oArr[oArr.length -1] = (T) value;
		}	
	}
	// if index is out of bounds of array, return null, else return the index
	public Object get(int index) {
		if (oArr.length < index)
			return null;
		else
			return oArr[index];
	}
}
